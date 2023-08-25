package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class DeleteLastNodeTest {
	@Test
	public void test1()
	{
		int[] arr=new int[] {4,2,5,1,20};
		Node head= DeleteLastNode.delete( ArrayToDobulyLinkedList.constructDLL(arr) );
		checkLastNodeDeleted(arr,head);
	}
	
	@Test
	public void test2()
	{
		int[] arr=new int[] {4};
		Node head= DeleteLastNode.delete( ArrayToDobulyLinkedList.constructDLL(arr) );
		assertNull(head);
	}
	public void checkLastNodeDeleted(int [] arr, Node head)
	{
		Node tail=head;
		int i=0;
		Node prev=null;
		while(tail.next!=null)
		{
			assertEquals(arr[i],tail.data);
			assertEquals(prev,tail.prev);
			prev=tail;
			tail=tail.next;
			i++;
		}
		assertEquals(arr[arr.length-2],tail.data);
		assertNull(tail.next);
	}
}
