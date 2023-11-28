package com.myjava.ds.implementation;

public class HeapSort {
	public static int[] sort(int[] arr) {
		int len = arr.length;
		for (int i = (len / 2) - 1; i >= 0; i--) {
			heapify(arr, i, len);
		}

		for (int j = len - 1; j > 0; j--) {
			int temp = arr[0];
			arr[0] = arr[j];
			arr[j] = temp;
			heapify(arr, 0, j);
		}
		return arr;
	}

	public static void heapify(int[] arr, int idx, int len) {
		int currentIdx = idx;
		if (idx < len) {
			int left = (2 * idx) + 1;
			int right = (2 * idx) + 2;
			if (left < len && arr[left] > arr[idx]) {
				idx = left;
			}
			if (right < len && arr[right] > arr[idx]) {
				idx = right;
			}
			if (idx != currentIdx) {
				int temp = arr[idx];
				arr[idx] = arr[currentIdx];
				arr[currentIdx] = temp;
				heapify(arr, idx, len);
			}
		}
	}
}
