package com.myjava.strivers.heaps;

import java.util.List;

// https://www.codingninjas.com/studio/problems/implement-a-priority-queue-_1743878
public class ImplementPriorityQueue {

	public static void push(List<Integer> heap, int ele) {
		heap.add(ele);
		for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
			heapify(heap, i);
		}
	}

	public static int pop(List<Integer> heap) {
		int pop = -1;
		if (heap.size() > 0) {
			pop = heap.get(0);
			int last = heap.size() - 1;
			heap.set(0, heap.get(last));
			heap.set(last, pop);
			heap.remove(last);
			for (int i = (heap.size() / 2) - 1; i >= 0; i--) {
				heapify(heap, i);
			}
		}
		return pop;
	}

	public static void heapify(List<Integer> heap, int i) {
		int largest=i;
		int left = (2 * i) + 1;
		int right = (2 * i) + 2;
		if (left < heap.size() && heap.get(largest) < heap.get(left)) {
			largest=left;
		}
		if (right < heap.size() && heap.get(largest) < heap.get(right)) {
			largest=right;
		}
		if(largest!=i)
		{
			int temp = heap.get(i);
			heap.set(i, heap.get(largest));
			heap.set(largest, temp);
			heapify(heap, largest);
		}
	}

}
