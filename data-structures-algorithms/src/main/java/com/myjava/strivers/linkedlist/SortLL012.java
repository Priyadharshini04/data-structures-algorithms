package com.myjava.strivers.linkedlist;

// https://www.codingninjas.com/studio/problems/sort-linked-list-of-0s-1s-2s_1071937
public class SortLL012 {

	public static Node sortList(Node head) {
		Node node0 = null, node0Tail = null;
		Node node1 = null, node1Tail = null;
		Node node2 = null, node2Tail = null;
		Node tail = head;
		while (tail != null) {
			if (tail.data == 0) {
				if (node0 == null) {
					node0 = new Node(tail.data);
					node0Tail = node0;
				} else {
					node0Tail.next = new Node(tail.data);
					node0Tail = node0Tail.next;
				}
			} else if (tail.data == 1) {
				if (node1 == null) {
					node1 = new Node(tail.data);
					node1Tail = node1;
				} else {
					node1Tail.next = new Node(tail.data);
					node1Tail = node1Tail.next;
				}
			} else if (tail.data == 2) {
				if (node2 == null) {
					node2 = new Node(tail.data);
					node2Tail = node2;
				} else {
					node2Tail.next = new Node(tail.data);
					node2Tail = node2Tail.next;
				}
			}
			tail=tail.next;
		}
		if (node0 != null) {
			if (node1 != null) {
				node0Tail.next = node1;
				node1Tail.next = node2;
				return node0;
			} else {
				node0Tail.next = node2;
				return node0;
			}
		} else if (node1 != null) {
			node1Tail.next = node2;
			return node1;
		}
		return node2;
	}

}
