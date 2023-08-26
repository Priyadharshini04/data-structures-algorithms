package com.myjava.strivers.linkedlist;

//https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/
public class RemoveMiddleNode {

	public static Node removeNode(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node slow = head;
		Node fast = head;
		Node prev = null;
		while (fast != null && fast.next != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next.next;
		}
		prev.next = slow.next;
		return head;
	}

	// Optimized memory solution
	public static Node removeNodeOptimized(Node head) {
		if (head == null || head.next == null) {
			return null;
		}
		Node slow = head;
		Node fast = head.next.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
	}
}
