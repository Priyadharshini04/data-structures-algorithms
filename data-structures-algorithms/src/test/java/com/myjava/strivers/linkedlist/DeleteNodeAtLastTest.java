package com.myjava.strivers.linkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class DeleteNodeAtLastTest {
	
	@Test
	public void test1()
	{
		Node head= DeleteNodeAtLast.delete(ArrayToLinkedList.constructLL(new int[] {4,3,2,1}));
		assertEquals(4, head.data);
		assertEquals(3, head.next.data);
		assertEquals(2, head.next.next.data);
		assertNull(head.next.next.next);
	}
	
}
