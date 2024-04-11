package com.myjava;

public class MyMain1 {
	public static void main(String[] args) {
		int[] arr = new int[] { -8, -4, -2, 0, 1, 3, 5, 7, 9 };
		int[] result = squareofArr(arr);
		for (int val : result) {
			System.out.println(val);
		}
	}

	public static int[] squareofArr(int[] arr) {
		int[] result = new int[arr.length];
		int left = 0;
		int right = arr.length - 1;
		int i = arr.length - 1;
		while (left <= right) {
			int leftVal = arr[left] < 0 ? -arr[left] : arr[left];// 8
			int rightVal = arr[right] < 0 ? -arr[right] : arr[right];// 20
			if (leftVal <= rightVal) {
				result[i] = arr[right] * arr[right];
				right--;
			} else {
				result[i] = arr[left] * arr[left];
				left++;
			}
			i--;
		}
		return result;
	}
}
