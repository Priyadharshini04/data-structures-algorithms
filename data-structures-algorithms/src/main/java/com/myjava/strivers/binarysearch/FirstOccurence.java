package com.myjava.strivers.binarysearch;

public class FirstOccurence {
	static int leftIndex(int N, int arr[], int X) {

		int left = 0;
		int right = N - 1;
		while (left <= right) {
			int mid = left + ((right - left) / 2);
			if (arr[mid] == X) {
				if (mid - 1 < 0 || arr[mid - 1] != arr[mid])
					return mid;
				else
					right = mid - 1;
			} else if (arr[mid] > X) {
				right = mid - 1;
			} else
				left = mid + 1;
		}
		return -1;
	}
}
