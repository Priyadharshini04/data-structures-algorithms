package com.myjava.strivers.arrays;

public class RotateArrayByN {

	static int[] rotateArray(int[] arr, int rotateN) {
		if (arr.length == 1) {
			return arr;
		}
		if (arr.length == 2 && rotateN == 1) {
			int temp = arr[0];
			arr[0] = arr[1];
			arr[1] = temp;
			return arr;
		}
		int[] newarr = new int[rotateN];
		for (int i = 0; i < newarr.length; i++) {
			newarr[i] = arr[i];
		}
		int k = rotateN;
		int j = 0;
		for (j = 0; j < arr.length && k < arr.length; j++) {
			arr[j] = arr[k];
			k++;
		}
		for (int l = 0; l < newarr.length; l++) {
			arr[j] = newarr[l];
			j++;
		}
		return arr;
	}

	public void rotates(int[] arr, int k) {
		int n = arr.length;
		int[] rotate = new int[n - k];
		int i = 0;
		while (i < rotate.length) {
			rotate[i] = arr[i++];
		}
		i = 0;
		int j = n - k;
		while (i < k && j < n) {
			arr[i++] = arr[j++];
		}
		j = 0;
		while (i < n) {
			arr[i++] = rotate[j++];
		}
	}

	// More optimized O(n) with less space complexity.
	public void rotate(int[] arr, int k) {
		int n = arr.length;
		k=k%n;
		reverse(arr, 0, n-1);
		reverse(arr, 0, k-1);
		reverse(arr, k, n-1);

	}

	public void reverse(int[] arr, int start, int end) {
		while (start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
