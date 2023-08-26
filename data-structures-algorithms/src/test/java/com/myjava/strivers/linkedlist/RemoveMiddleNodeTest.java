package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveMiddleNodeTest {
	@Test
	public void test1()
	{
		Node head= RemoveMiddleNode.removeNode(ArrayToLinkedList.conLL(new int[] {1,2}));
		assertAlignment( head, new int[] {1});
	}
	@Test
	public void test2()
	{
		Node head= RemoveMiddleNode.removeNode(ArrayToLinkedList.conLL(new int[] {1,2,3,4,5}));
		assertAlignment( head, new int[] {1,2,4,5});
	}
	@Test
	public void test3()
	{
		Node head= RemoveMiddleNode.removeNode(ArrayToLinkedList.conLL(new int[] {1}));
		assertAlignment( head, new int[] {});
	}
	@Test
	public void test4()
	{
		Node head= RemoveMiddleNode.removeNodeOptimized(ArrayToLinkedList.conLL(new int[] {1,2}));
		assertAlignment( head, new int[] {1});
	}
	@Test
	public void test5()
	{
		Node head= RemoveMiddleNode.removeNodeOptimized(ArrayToLinkedList.conLL(new int[] {1,2,3,4,5}));
		assertAlignment( head, new int[] {1,2,4,5});
	}
	@Test
	public void test6()
	{
		Node head= RemoveMiddleNode.removeNodeOptimized(ArrayToLinkedList.conLL(new int[] {1}));
		assertAlignment( head, new int[] {});
	}
	public void assertAlignment(Node head,int[] arr)
	{
		Node current=head;
		int i=0;
		while(current!=null)
		{
			assertEquals(arr[i], current.data);
			current=current.next;
			i++;
		}
		assertEquals(arr.length, i);
	}
}
