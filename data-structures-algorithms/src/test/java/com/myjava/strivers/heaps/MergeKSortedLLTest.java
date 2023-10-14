package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myjava.strivers.linkedlist.ArrayToLinkedList;
import com.myjava.strivers.linkedlist.Node;

public class MergeKSortedLLTest {
	@Test
	public void test1() {
		Node expected = ArrayToLinkedList.conLL(new int[] { 1, 1, 2, 3, 4, 4, 5, 6 });
		Node[] list = new Node[] { ArrayToLinkedList.conLL(new int[] { 1, 4, 5 }),
				ArrayToLinkedList.conLL(new int[] { 1, 3, 4 }), ArrayToLinkedList.conLL(new int[] { 2, 6 }) };

		assertLinkedList(expected, MergeKSortedLL.mergeKLists(list));
	}
	
	@Test
	public void test2() {
		Node expected = ArrayToLinkedList.conLL(new int[] { -2,-1,-1,-1 });
		Node[] list = new Node[] { ArrayToLinkedList.conLL(new int[] { -2,-1,-1,-1 }),
				ArrayToLinkedList.conLL(new int[] {}) };

		assertLinkedList(expected, MergeKSortedLL.mergeKLists(list));
	}

	private void assertLinkedList(Node expected, Node mergeKLists) {
		while (expected.next != null) {
			assertEquals(expected.data, mergeKLists.data);
			expected = expected.next;
			mergeKLists = mergeKLists.next;
		}
	}
}
