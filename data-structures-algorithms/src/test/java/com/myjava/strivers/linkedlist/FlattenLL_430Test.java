package com.myjava.strivers.linkedlist;

import org.junit.Test;

public class FlattenLL_430Test {
	@Test
	public void test1() {
		Node head = new Node(1);
		Node node = head;
		node.next = new Node(2);
		node = node.next;
		node.next = new Node(3);
		node = node.next;
		node.child = new Node(7);
		node = node.child;
		node.next = new Node(8);
		node = node.next;
		Node temp = node;
		temp.next = new Node(9);
		temp = temp.next;
		temp.next = new Node(10);
		node.child = new Node(11);
		node = node.child;
		node.next = new Node(12);

		Node result = FlattenLL_430.flattenLinkedList(head);
		new AddOneAsNumberTest().assertData(new int[] { 1, 2, 3, 7, 8, 11, 12, 9, 10 }, result);
	}

	@Test
	public void test2() {
		Node head = new Node(1);
		Node node = head;
		node.next = new Node(2);
		node = node.next;
		node.next = new Node(3);
		node = node.next;
		node.child = new Node(7);
		node = node.child;
		node.next = new Node(8);
		node = node.next;
		Node temp = node;
		temp.next = new Node(9);
		temp = temp.next;
		temp.next = new Node(10);
		node.child = new Node(11);
		node = node.child;
		node.next = new Node(12);
		FlattenLL_430.traverseLL(head);
//1, 2, 3, 7, 8, 11, 12, 9, 10]
	}
}
