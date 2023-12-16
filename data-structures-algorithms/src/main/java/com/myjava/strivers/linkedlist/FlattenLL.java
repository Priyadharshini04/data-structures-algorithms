package com.myjava.strivers.linkedlist;

//https://www.codingninjas.com/studio/problems/flatten-a-linked-list_1112655
public class FlattenLL {
	// with parent child node.
	public static Node flattenLinkedList(Node head) {
		if (head == null)
			return null;
		Node result = head;
		Node node = head.next;
		while (node != null) {
			result = mergeNodes(result, node);
			node = node.next;
		}
		return result;
	}

	public static Node mergeNodes(Node a, Node b) {
		Node newNode = null;
		Node tempNode = null;
		while (a != null && b != null) {
			if (a.data < b.data) {
				if (newNode == null) {
					newNode = new Node(a.data);
					tempNode = newNode;
				} else {
					Node temp = new Node(a.data);
					tempNode.child = temp;
					tempNode = tempNode.child;
				}
				a = a.child;
			} else {
				if (newNode == null) {
					newNode = new Node(b.data);
					tempNode = newNode;
				} else {
					Node temp = new Node(b.data);
					tempNode.child = temp;
					tempNode = tempNode.child;
				}
				b = b.child;
			}
		}
		while (a != null) {
			Node temp = new Node(a.data);
			tempNode.child = temp;
			tempNode = tempNode.child;
			a = a.child;
		}
		while (b != null) {
			Node temp = new Node(b.data);
			tempNode.child = temp;
			tempNode = tempNode.child;
			b = b.child;
		}
		return newNode;
	}

	// with parent next node.
	public static Node flattenLinkedLists(Node head) {
		Node node = head;
		while (node != null) {
			Node nextNode = node.next;
			Node childNode = node.child;
			if (childNode != null) {
				node.next = childNode;
				while (childNode != null && childNode.next != null) {
					childNode = childNode.next;
				}
				childNode.next = nextNode;
				node = nextNode;
			} else {
				node = nextNode;
			}
		}
		return head;
	}
}
