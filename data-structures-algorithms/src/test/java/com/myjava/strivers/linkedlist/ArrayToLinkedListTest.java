package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayToLinkedListTest {
	
	@Test
	public void test1()
	{
		Node head=ArrayToLinkedList.constructLL(new int[] {4,3,2,1});
		assertEquals(4, head.data);
		assertEquals(3, head.next.data);
		assertEquals(2, head.next.next.data);
		assertEquals(1, head.next.next.next.data);
	}
	
}
