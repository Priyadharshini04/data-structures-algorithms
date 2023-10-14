package com.myjava.strivers.heaps;

//https://www.codingninjas.com/studio/problems/convert-min-heap-to-max-heap_1381084
public class MinHeapToMaxHeap {

	public static int[] insert(int[] arr) {
		for (int i = (arr.length / 2) - 1; i >= 0; i--) {
			heapify(arr, i);
		}
		for (int i = (arr.length / 2) - 1; i < arr.length; i++) {
			heapify(arr, i);
		}
		return arr;
	}

	public static void heapify(int[] arr, int i) {
		int largest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < arr.length && arr[largest] < arr[left]) {
			largest = left;
		}
		if (right < arr.length && arr[largest] < arr[right]) {
			largest = right;
		}
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			heapify(arr, largest);
		}
	}

}
