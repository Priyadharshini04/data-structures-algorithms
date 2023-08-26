package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveNthNodeTest {
	@Test
	public void test1()
	{
		Node head= RemoveNthNode.removeNode(ArrayToLinkedList.conLL(new int[] {1,2,3,4,5}),2);
		assertAlignment( head, new int[] {1,2,3,5});
	}
	@Test
	public void test2()
	{
		Node head= RemoveNthNode.removeNode(ArrayToLinkedList.conLL(new int[] {1}),1);
		assertAlignment( head, new int[] {});
	}
	@Test
	public void test3()
	{
		Node head= RemoveNthNode.removeNode(ArrayToLinkedList.conLL(new int[] {1,2}),2);
		assertAlignment( head, new int[] {2});
	}
	@Test
	public void test4()
	{
		Node head= RemoveNthNode.removeNodeN(ArrayToLinkedList.conLL(new int[] {1,2,3,4,5}),2);
		assertAlignment( head, new int[] {1,2,3,5});
	}
	@Test
	public void test5()
	{
		Node head= RemoveNthNode.removeNodeN(ArrayToLinkedList.conLL(new int[] {1}),1);
		assertAlignment( head, new int[] {});
	}
	@Test
	public void test6()
	{
		Node head= RemoveNthNode.removeNodeN(ArrayToLinkedList.conLL(new int[] {1,2}),2);
		assertAlignment( head, new int[] {2});
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
