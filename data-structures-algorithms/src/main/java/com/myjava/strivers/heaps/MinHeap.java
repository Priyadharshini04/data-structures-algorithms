package com.myjava.strivers.heaps;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

// https://www.codingninjas.com/studio/problems/min-heap-implementation_5480527
public class MinHeap {
	List<Integer> heap = new ArrayList<Integer>();

	MinHeap(int size) {
	}

	// Implement the function to remove minimum element.
	int extractMinElement() {
		int pop = -1;
		if (heap.size() > 0) {
			pop = heap.get(0);
			heap.set(0, heap.get(heap.size() - 1));
			heap.set(heap.size() - 1, pop);
			heap.remove(heap.size() - 1);
			for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
				heapify(i);
			}
		}
		return pop;
	}

	// Implement the function to delete an element.
	void deleteElement(int ind) {
		int pop = -1;
		if (heap.size() > ind) {
			pop = heap.get(ind);
			heap.set(ind, heap.get(heap.size() - 1));
			heap.set(heap.size() - 1, pop);
			heap.remove(heap.size() - 1);
			for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
				heapify(i);
			}
		}
	}

	// Implement the function to insert 'val' in the heap.
	void insert(int val) {
		heap.add(val);
		for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
			heapify(i);
		}
	}

	void heapify(int i) {
		int smallest = i;
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		if (left < heap.size() && heap.get(smallest) > heap.get(left)) {
			smallest = left;
		}
		if (right < heap.size() && heap.get(smallest) > heap.get(right)) {
			smallest = right;
		}
		if (smallest != i) {
			int temp = heap.get(i);
			heap.set(i, heap.get(smallest));
			heap.set(smallest, temp);
			heapify(smallest);
		}
	}
}
