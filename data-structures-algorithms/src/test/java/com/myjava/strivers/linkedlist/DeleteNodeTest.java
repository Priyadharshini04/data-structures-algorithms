package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DeleteNodeTest {
	@Test
	public void test1()
	{
		Node head=ArrayToLinkedList.constructLL(new int[] {4,5,1,9});
		DeleteNode.deleteNode( head.next );
		assertEquals(4, head.data);
		assertEquals(1, head.next.data);
		assertEquals(9, head.next.next.data);
		assertNull(head.next.next.next);
	}

}
