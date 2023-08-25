package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.*;

import org.junit.Test;

public class InsertAtEndTest {
	@Test
	public void test1()
	{
		Node head=InsertAtEnd.insert(ArrayToDobulyLinkedList.constructDLL(new int[] {4,2,5,1}),20);
		checkLastNodeInserted(20,head,1);
	}
	@Test
	public void test2()
	{
		Node head=InsertAtEnd.insert(ArrayToDobulyLinkedList.constructDLL(new int[] {}),20);
		assertEquals(20,head.data);
		assertNull(head.next);	
		assertNull(head.prev);	
	}
	public void checkLastNodeInserted(int ele, Node head, int prev)
	{
		Node tail=head;
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		assertEquals(ele,tail.data);
		assertEquals(prev,tail.prev.data);
		assertNull(tail.next);		
	}
}
