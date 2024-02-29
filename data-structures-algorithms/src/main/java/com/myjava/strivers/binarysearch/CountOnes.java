package com.myjava.strivers.binarysearch;

public class CountOnes {
	public static int countOnes(int arr[], int N) {
		int leftIndexOfOne = -1;
		int left = 0, right = N - 1;
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (arr[mid] == 1) {
				if (mid - 1 < 0 || arr[mid - 1] != arr[mid]) {
					leftIndexOfOne = mid;
					break;
				} else
					right = mid - 1;
			} else if (arr[left] == 0)
				left = mid + 1;
			else
				right = mid - 1;
		}
		if (leftIndexOfOne == -1)
			return 0;
		int leftIndexOfZero = -1;
		left = 0;
		right = N - 1;
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (arr[mid] == 0) {
				if (mid - 1 < 0 || arr[mid - 1] != arr[mid]) {
					leftIndexOfZero = mid;
					break;
				} else
					right = mid - 1;
			} else if (arr[left] == 1)
				left = mid + 1;
			else
				right = mid - 1;
		}
		if (leftIndexOfZero == -1)
			return N;
		if (leftIndexOfZero < leftIndexOfOne)
			return N - leftIndexOfOne;
		else
			return leftIndexOfZero;
	}
}
