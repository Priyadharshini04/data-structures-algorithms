package com.myjava.strivers.linkedlist;

public class FlattenLL_430 {

	public static Node flattenLinkedList(Node head) {
		Node curr = head;
		while (curr != null) {
			if (curr.child != null) {
				Node tail = findTail(curr.child);
				if (curr.next != null) {
					curr.next.prev = tail;
				}
				tail.next = curr.next;
				curr.next = curr.child;
				curr.child.prev = curr;
				curr.child = null;
			}
			curr = curr.next;
		}
		return head;
	}

	public static Node findTail(Node child) {
		while (child.next != null) {
			child = child.next;
		}
		return child;
	}

}
