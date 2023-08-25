package com.myjava.strivers.doublylinkedlist;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.myjava.strivers.recursion.ReverseAnArray;

public class ReverseDLLTest {
	@Test
	public void test1()
	{
		int[] arr=new int[] {4,2,5,1,20};
		Node head= ReverseDLL.reverse( ArrayToDobulyLinkedList.constructDLL(arr) );
		arr = ReverseAnArray.reverseArray(arr.length, arr, 0);
		checkDLLReversed(arr,head);
	}
	public void checkDLLReversed(int [] arr, Node head)
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
		assertEquals(arr.length-1, i);
	}
}
