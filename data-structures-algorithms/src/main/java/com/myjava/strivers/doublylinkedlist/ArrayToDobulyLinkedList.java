package com.myjava.strivers.doublylinkedlist;
// https://www.codingninjas.com/studio/problems/introduction-to-doubly-linked-list_8160413
public class ArrayToDobulyLinkedList {

	public static Node constructDLL(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		Node head = null;
		Node tail = null;
		Node prev = null;
		for (int i = 0; i < arr.length; i++) {
			if (head == null) {
				head = new Node(arr[i]);
				tail = head; // the obj ref
			} else {
				Node currNode = new Node(arr[i]);
				tail.next = currNode;
				tail.prev = prev;
				prev = tail;
				tail = currNode;
			}
		}
		tail.next = null;
		tail.prev = prev;
		return head;
	}

	public static ListNode<Integer> constructDLLListNode(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		ListNode<Integer> head = null;
		ListNode<Integer> tail = null;
		ListNode<Integer> prev = null;
		for (int i = 0; i < arr.length; i++) {
			if (head == null) {
				head = new ListNode<Integer>(arr[i]);
				tail = head; // the obj ref
			} else {
				ListNode<Integer> currNode = new ListNode<Integer>(arr[i]);
				tail.next = currNode;
				tail.prev = prev;
				prev = tail;
				tail = currNode;
			}
		}
		tail.next = null;
		tail.prev = prev;
		return head;
	}

}
