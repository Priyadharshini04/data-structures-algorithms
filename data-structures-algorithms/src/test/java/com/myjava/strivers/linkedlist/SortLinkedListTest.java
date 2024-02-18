package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class SortLinkedListTest {
	@Test
	public void test1() {
		int[] arr = new int[] { 4, 2, 1, 3 };
		Node head = SortLinkedList.selectionSort(ArrayToLinkedList.conLL(arr));
		Arrays.sort(arr);
		checkLLSorted(arr, head);
	}

	@Test
	public void test2() {
		int[] arr = new int[] { 4, 2, 1, 3 };
		Node head = SortLinkedList.bubbleSort(ArrayToLinkedList.conLL(arr));
		Arrays.sort(arr);
		checkLLSorted(arr, head);
	}

	@Test
	public void test3() {
		int[] arr = new int[] { 4, 2, 1, 3 };
		Node head = SortLinkedList.mergeSort(ArrayToLinkedList.conLL(arr));
		Arrays.sort(arr);
		checkLLSorted(arr, head);
	}

	public void checkLLSorted(int[] arr, Node head) {
		Node tail = head;
		int i = 0;
		while (tail != null) {
			assertEquals(arr[i], tail.data);
			tail = tail.next;
			i++;
		}
		assertEquals(arr.length, i);
	}
}
