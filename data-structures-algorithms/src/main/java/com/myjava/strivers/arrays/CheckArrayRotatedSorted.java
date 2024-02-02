package com.myjava.strivers.arrays;

public class CheckArrayRotatedSorted {

	// O(n) time complexity.
	public static boolean checkRotatedAndSorted(int arr[], int num) {
		int flag1 = 0;
		int flag2 = 0;

		for (int i = 1; i < num; i++) {

			if (arr[i] > arr[i - 1]) {
				flag1++;
			}
			if (arr[i] < arr[i - 1]) {
				flag2++;
			}

		}

		return (flag2 == 1 && arr[0] >= arr[num - 1]) || (flag1 == 1 && arr[0] <= arr[num - 1]);

	}

	// O(n)+O(n)
	public static boolean checkRotatedAndSorted(int[] arr) {
		return checkIncrese(arr) || checkDecrease(arr);
	}

	public static boolean checkIncrese(int[] arr) {
		int num = arr.length;
		int i = 0;
		while (i + 1 < num && arr[i] < arr[i + 1]) {
			++i;
		}
		if (i == num - 1)
			return false;
		i = i + 1;
		while (i < num && i + 1 < num && arr[i] < arr[i + 1]) {
			++i;
		}
		if (i >= num - 1 && arr[0] > arr[num - 1])
			return true;
		return false;
	}

	public static boolean checkDecrease(int[] arr) {
		int num = arr.length;
		int i = 0;
		while (i + 1 < num && arr[i] > arr[i + 1]) {
			++i;
		}
		if (i == num - 1)
			return false;
		i = i + 1;
		while (i < num && i + 1 < num && arr[i] > arr[i + 1]) {
			++i;
		}
		if (i >= num - 1 && arr[0] < arr[num - 1])
			return true;
		return false;
	}
}
