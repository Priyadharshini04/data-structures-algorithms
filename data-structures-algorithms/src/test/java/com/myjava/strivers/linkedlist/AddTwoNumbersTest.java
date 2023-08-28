package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddTwoNumbersTest {
	@Test
	public void test1() {
		Node sum = AddTwoNumbers.add(ArrayToLinkedList.conLL(new int[] { 2, 4, 3 }),
				ArrayToLinkedList.conLL(new int[] { 5, 6, 4 }));
		assertData(new int[] { 7, 0, 8 }, sum);
	}

	@Test
	public void test2() {
		Node sum = AddTwoNumbers.add(ArrayToLinkedList.conLL(new int[] { 9, 9, 9, 9, 9, 9, 9 }),
				ArrayToLinkedList.conLL(new int[] { 9, 9, 9, 9 }));
		assertData(new int[] { 8, 9, 9, 9, 0, 0, 0, 1 }, sum);
	}

	public void assertData(int[] arr, Node head) {
		int i = 0;
		while (head != null) {
			assertEquals(arr[i], head.data);
			head = head.next;
			i++;
		}
	}
}
