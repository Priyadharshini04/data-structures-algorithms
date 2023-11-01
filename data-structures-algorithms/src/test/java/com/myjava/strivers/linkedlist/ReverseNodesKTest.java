package com.myjava.strivers.linkedlist;

import org.junit.Test;

public class ReverseNodesKTest {
	SortLinkedListTest ll=new SortLinkedListTest();
	@Test
	public void test1()
	{
		Node head=ArrayToLinkedList.conLL(new int[] {1,2,3,4,5});
		Node rev=ReverseNodesK.reverseK(head,2);
		ll.checkLLSorted(new int[] {2,1,4,3,5}, rev);
	}
}
