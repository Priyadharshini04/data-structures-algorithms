package com.myjava.strivers.linkedlist;

import org.junit.Test;

public class FlattenLLTest {
	@Test
	public void test1() {
		Node head = ArrayToLinkedList.conLL(new int[] { 1, 4, 7, 9 });
		Node node = head;
		int[][] arr = new int[][] { new int[] { 2, 3 }, new int[] { 5, 6 }, new int[] { 8 } };

		int i = 0;
		while (node != null) {
			if (i < arr.length)
				node.child = ArrayToLinkedList.conLL(arr[i]);
			i++;
			node = node.next;
		}
		Node result = FlattenLL.flattenLinkedList(head);
		new AddOneAsNumberTest().assertData(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, result);
	}

	@Test
	public void test2() {
		Node head = ArrayToLinkedList.conLL(new int[] { 1, 4, 7, 9 });
		Node node = head;
		int[][] arr = new int[][] { new int[] { 2, 3 }, new int[] { 5, 6 }, new int[] { 8 } };

		int i = 0;
		while (node != null) {
			if (i < arr.length)
			{
				for(int j=0;j<arr[i].length;j++)
				{
					node.child=ArrayToLinkedList.conLL(arr[i]);
					node=node.child;
				}
			}
			i++;
			node = node.next;
		}
		Node result = FlattenLL.flattenLinkedList(head);
		new AddOneAsNumberTest().assertData(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, result);
	}
}
