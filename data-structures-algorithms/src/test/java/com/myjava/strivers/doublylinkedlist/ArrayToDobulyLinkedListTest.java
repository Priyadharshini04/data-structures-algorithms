package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class ArrayToDobulyLinkedListTest {
	@Test
	public void test1()
	{
		Node head=ArrayToDobulyLinkedList.constructDLL(new int[] {4,2,5,1});
		assertEquals(head.data, 4);
		assertNull(head.prev);
		assertEquals(head.next.data, 2);
		assertEquals(head.next.prev.data, 4);
		assertEquals(head.next.next.data, 5);
		assertEquals(head.next.next.prev.data, 2);
		assertEquals(head.next.next.next.data, 1);
		assertEquals(head.next.next.next.prev.data, 5);
		assertNull(head.next.next.next.next);
	}
}
