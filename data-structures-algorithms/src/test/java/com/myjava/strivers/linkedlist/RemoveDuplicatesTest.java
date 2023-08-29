package com.myjava.strivers.linkedlist;

import org.junit.Test;

public class RemoveDuplicatesTest {
	@Test
	public void test1() {
		Node head = RemoveDuplicates.removeDuplicate(ArrayToLinkedList.conLL(new int[] { 1, 2, 3, 3, 4, 4, 5 }));
		new OddEvenLLTest().assertAlignment(head, new int[] { 1, 2, 3, 4, 5 });
	}

	@Test
	public void test2() {
		Node head = RemoveDuplicates.removeDuplicate(ArrayToLinkedList.conLL(new int[] { 1, 1, 1, 2, 3 }));
		new OddEvenLLTest().assertAlignment(head, new int[] { 1, 2, 3 });
	}

	@Test
	public void test3() {
		Node head = RemoveDuplicates.removeDuplicate(ArrayToLinkedList.conLL(new int[] { 1, 1, 1, 1, 1 }));
		new OddEvenLLTest().assertAlignment(head, new int[] { 1 });
	}

	@Test
	public void test4() {
		Node head = RemoveDuplicates.removeDuplicate(ArrayToLinkedList.conLL(new int[] { 1, 2, 2, 2 }));
		new OddEvenLLTest().assertAlignment(head, new int[] { 1, 2 });
	}
}
