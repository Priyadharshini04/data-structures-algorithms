package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MiddleNodeTest {
	@Test
	public void test1()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,3,4,5});
		assertEquals(3,MiddleNode.findMiddle(head).data);
	}
}
