package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myjava.strivers.recursion.ReverseAnArray;

public class ReverseLLTest {
	@Test
	public void test1()
	{
		int[] arr=new int[] {4,2,5,1,20};
		Node head= ReverseLL.reverse( ArrayToLinkedList.conLL(arr) );
		arr = ReverseAnArray.reverseArray(arr.length, arr, 0);
		checkDLLReversed(arr,head);
	}
	public void checkDLLReversed(int [] arr, Node head)
	{
		Node tail=head;
		int i=0;
		while(tail.next!=null)
		{
			assertEquals(arr[i],tail.data);
			tail=tail.next;
			i++;
		}
		assertEquals(arr.length-1, i);
}
}
