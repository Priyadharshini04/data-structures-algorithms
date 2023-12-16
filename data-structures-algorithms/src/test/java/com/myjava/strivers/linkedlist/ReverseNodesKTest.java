package com.myjava.strivers.linkedlist;

import org.junit.Test;

public class ReverseNodesKTest {
	SortLinkedListTest ll = new SortLinkedListTest();

	@Test
	public void test1() {
		Node head = ArrayToLinkedList.conLL(new int[] { 1, 2, 3, 4, 5 });
		Node rev = ReverseNodesK.reverseK(head, 2);
		ll.checkLLSorted(new int[] { 2, 1, 4, 3, 5 }, rev);
	}

	@Test
	public void test2() {
		Node head = ArrayToLinkedList.conLL(new int[] { 5, 4, 3, 7, 9, 2 });
		Node rev = ReverseNodesK.reverseK(head, 4);
		ll.checkLLSorted(new int[] { 7, 3, 4, 5, 9, 2 }, rev);
	}

	@Test
	public void test3() {
		Node head = ArrayToLinkedList.conLL(new int[] { 2, 7, 13, 8, 5, 6, 10 });
		Node rev = ReverseNodesK.reverseK(head, 1);
		ll.checkLLSorted(new int[] { 2, 7, 13, 8, 5, 6, 10 }, rev);
	}
	
	@Test
	public void test4() {
		Node head = ArrayToLinkedList.conLL(new int[] { 1,2,3,4,5,6 });
		Node rev = ReverseNodesK.reverseK(head, 2);
		ll.checkLLSorted(new int[] { 2,1,4,3,6,5 }, rev);
	}
}
