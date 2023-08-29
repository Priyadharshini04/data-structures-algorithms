package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveDuplicatesTest {
	@Test
	public void test1() {
		Node head = RemoveDuplicates.removeDuplicate(ArrayToDobulyLinkedList.constructDLL(new int[] { 1, 2, 2, 2, 3 }));
		assertData(new int[] { 1, 2, 3 }, head);
	}

	@Test
	public void test2() {
		Node head = RemoveDuplicates
				.removeDuplicate(ArrayToDobulyLinkedList.constructDLL(new int[] { 1, 2, 2, 2, 2, 3 }));
		assertData(new int[] { 1, 2, 3 }, head);
	}

	@Test
	public void test3() {
		Node head = RemoveDuplicates.removeDuplicate(ArrayToDobulyLinkedList.constructDLL(new int[] { 1, 1 }));
		assertData(new int[] { 1 }, head);
	}

	public void assertData(int[] arr, Node head) {
		Node tail = head;
		int i = 0;
		Node prev = null;
		while (tail != null) {
			assertEquals(arr[i], tail.data);
			assertEquals(prev, tail.prev);
			prev = tail;
			tail = tail.next;
			i++;
		}
		assertEquals(arr.length, i);
	}
}
