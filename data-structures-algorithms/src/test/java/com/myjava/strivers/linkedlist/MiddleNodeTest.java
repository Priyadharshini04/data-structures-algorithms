package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNodeTest {
	@Test
	public void test1()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,3,4,5});
		assertEquals(3,MiddleNode.findMiddle(head).data);
	}
	
	@Test
	public void test2()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,3,4,5});
		assertEquals(3,MiddleNode.findMiddleOptimized(head).data);
	}
}
