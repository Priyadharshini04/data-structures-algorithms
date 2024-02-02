package com.myjava.strivers.linkedlist;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AddOneAsNumberTest {
	@Test
	public void test1() {
		assertData(new int[] { 1, 5, 4 }, AddOneAsNumber.add(ArrayToLinkedList.conLL(new int[] { 1, 5, 3 })));
	}

	@Test
	public void test2() {
		assertData(new int[] { 1, 0, 0 }, AddOneAsNumber.add(ArrayToLinkedList.conLL(new int[] { 9, 9 })));
	}

	@Test
	public void test3() {
		assertData(new int[] { 1, 0, 0, 0 }, AddOneAsNumber.add(ArrayToLinkedList.conLL(new int[] { 9, 9, 9 })));
	}

	@Test
	public void test4() {
		assertData(new int[] { 1, 0 }, AddOneAsNumber.add(ArrayToLinkedList.conLL(new int[] { 0, 0, 9 })));
	}

	public void assertData(int[] arr, Node head) {
		int i = 0;
		while (i < arr.length) {
			assertEquals(arr[i], head.data);
			head = head.next;
			i++;
		}
	}
}
