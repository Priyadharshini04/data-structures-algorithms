package com.myjava.strivers.heaps;

public class HeapSort {

	public static int[] sort(int[] arr) {
		int[] size = new int[] { arr.length - 1 };
		for (int i = arr.length - 1; i >= 0; i--) {
			heapify(arr, i, size);
		}
		for (int i = 0; i < arr.length - 1; i++) {
			extractMax(arr, size);
			heapify(arr, 0, size);
		}
		return arr;
	}

	public static int extractMax(int[] arr, int[] size) {
		int pop = arr[0];
		arr[0] = arr[size[0]];
		arr[size[0]] = pop;
		size[0]--;
		return pop;
	}

	public static void heapify(int[] arr, int idx, int[] size) {
		int largest = idx;
		int left = 2 * idx + 1;
		int right = 2 * idx + 2;
		if (left < size[0] + 1 && arr[largest] < arr[left]) {
			largest = left;
		}
		if (right < size[0] + 1 && arr[largest] < arr[right]) {
			largest = right;
		}
		if (largest != idx) {
			int temp = arr[idx];
			arr[idx] = arr[largest];
			arr[largest] = temp;
			heapify(arr, largest, size);
		}
	}
}
