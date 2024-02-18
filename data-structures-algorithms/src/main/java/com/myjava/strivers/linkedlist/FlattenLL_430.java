package com.myjava.strivers.linkedlist;

import java.util.ArrayList;
import java.util.List;

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

	static List<Integer> list = new ArrayList<Integer>();

	public static void traverseLL(Node node) {
		while (node != null) {
			list.add(node.data); // 3,1,2,5,7,8,4,6
			if (node.child != null) {
				traverseLL(node.child);
			}
			node = node.next;
		}
	}

}
