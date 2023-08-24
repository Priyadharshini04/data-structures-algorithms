package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class InsertNodeAtBeginTest {
	@Test
	public void test1()
	{
		Node head=InsertNodeAtBegin.insertBeginLL( ArrayToLinkedList.constructLL(new int[] {4,3,2,1}),0);
		assertEquals(0, head.data);
		assertEquals(4, head.next.data);
		assertEquals(3, head.next.next.data);
		assertEquals(2, head.next.next.next.data);
		assertEquals(1, head.next.next.next.next.data);
	}
	
}
