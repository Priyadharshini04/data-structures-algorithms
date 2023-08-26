package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class OddEvenLLTest {
	@Test
	public void test1()
	{
		Node head=OddEvenLL.align(ArrayToLinkedList.constructLL(new int[] {1,2,3,4,5}));
		assertAlignment(head,new int[]{1,3,5,2,4});
	}
	
	@Test
	public void test2()
	{
		Node head=OddEvenLL.align(ArrayToLinkedList.constructLL(new int[] {1,2,3,4,5,6}));
		assertAlignment(head,new int[]{1,3,5,2,4,6});
	}
	
	@Test
	public void test3()
	{
		Node head=OddEvenLL.alignOptmized(ArrayToLinkedList.constructLL(new int[] {1,2,3,4,5}));
		assertAlignment(head,new int[]{1,3,5,2,4});
	}
	
	@Test
	public void test4()
	{
		Node head=OddEvenLL.alignOptmized(ArrayToLinkedList.constructLL(new int[] {1,2,3,4,5,6}));
		assertAlignment(head,new int[]{1,3,5,2,4,6});
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
