package com.myjava.strivers.heaps;

import java.util.List;

// https://www.codingninjas.com/studio/problems/implement-a-priority-queue-_1743878
public class ImplementPriorityQueue {

	public static void push(List<Integer> heap, int ele) {
		heap.add(ele);
		int idx = heap.size() - 1;
		// Compare parent and swap. bottom to top.
		for (int i = idx; i >= 0 && heap.get(parent(i)) < heap.get(i);) {
			int temp = heap.get(i);
			heap.set(i, heap.get(parent(i)));
			heap.set(parent(i), temp);
			i = parent(i);
		}
		// more time even though if no swap.
//		for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
//			heapify(heap, i);
//		}
	}

	public static int parent(int idx) {
		return (idx - 1) / 2;
	}

	public static int pop(List<Integer> heap) {
		int pop = -1;
		if (heap.size() > 0) {
			pop = heap.get(0);
			int last = heap.size() - 1;
			heap.set(0, heap.get(last));
			heap.set(last, pop);
			heap.remove(last);
			// top to bottom heapify logic.
			heapify(heap, 0);
			// reverse heapify logic
//			for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
//				heapify(heap, i);
//			}
		}
		return pop;
	}

	public static int deleteKey(List<Integer> heap, int idx) {
		int pop = -1;
		if (heap.size() > 0) {
			pop = heap.get(idx);
			int last = heap.get(heap.size() - 1);
			heap.set(heap.size() - 1, heap.get(0));
			heap.set(idx, last);
			for (int j = idx; j >= 0 && heap.get(parent(j)) > heap.get(j);) {
				int temp = heap.get(j);
				heap.set(j, heap.get(parent(j)));
				heap.set(parent(j), temp);
				j = parent(j);
			}
			heapify(heap, idx);
		}
		return pop;
	}

	public static void heapify(List<Integer> heap, int i) {
		int largest = i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		if (left < heap.size() && heap.get(largest) < heap.get(left)) {
			largest = left;
		}
		if (right < heap.size() && heap.get(largest) < heap.get(right)) {
			largest = right;
		}
		if (largest != i) {
			int temp = heap.get(i);
			heap.set(i, heap.get(largest));
			heap.set(largest, temp);
			heapify(heap, largest);
		}
	}

	// reverse heapify logic.
	public static void heapifyReverse(List<Integer> heap, int i) {
		int largest = i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		if (left < heap.size() && heap.get(largest) < heap.get(left)) {
			largest = left;
		}
		if (right < heap.size() && heap.get(largest) < heap.get(right)) {
			largest = right;
		}
		if (largest != i) {
			int temp = heap.get(i);
			heap.set(i, heap.get(largest));
			heap.set(largest, temp);
		}
	}

}
