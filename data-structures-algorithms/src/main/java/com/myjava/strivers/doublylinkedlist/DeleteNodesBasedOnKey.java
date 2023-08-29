package com.myjava.strivers.doublylinkedlist;

// https://www.codingninjas.com/studio/problems/delete-all-occurrences-of-a-given-key-in-a-doubly-linked-list_8160461
public class DeleteNodesBasedOnKey {

	public static Node delete(Node head, int k) {
		if (head == null) {
			return null;
		}

		Node traverse = head;

		while (traverse != null) {
			if (traverse.data == k && traverse.prev == null) {
				head = head.next;
				if (head != null)
					head.prev = null;
				traverse = head;
			} else if (traverse.data == k) {
				if (traverse.prev != null) {
					traverse.prev.next = traverse.next;
					if (traverse.next != null)
						traverse.next.prev = traverse.prev;
				}
				traverse = traverse.next;
			} else {
				traverse = traverse.next;
			}
		}

		return head;
	}

}
