package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DeleteNodesBasedOnKeyTest {
	@Test
	public void test1() {
		Node head = DeleteNodesBasedOnKey
				.delete(ArrayToDobulyLinkedList.constructDLL(new int[] { 10, 4, 10, 3, 5, 20, 10 }), 10);
		assertData(new int[] { 4, 3, 5, 20 }, head);
	}

	@Test
	public void test2() {
		Node head = DeleteNodesBasedOnKey
				.delete(ArrayToDobulyLinkedList.constructDLL(new int[] { 10, 4, 10, 3, 5, 20, 10 }), 30);
		assertData(new int[] { 10, 4, 10, 3, 5, 20, 10 }, head);
	}

	@Test
	public void test3() {
		Node head = DeleteNodesBasedOnKey
				.delete(ArrayToDobulyLinkedList.constructDLL(new int[] { 10, 10, 10, 10, 10, 10, 10 }), 10);
		assertNull(head);
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
