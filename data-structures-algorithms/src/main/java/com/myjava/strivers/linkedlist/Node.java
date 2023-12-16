package com.myjava.strivers.linkedlist;

public class Node {
	public int data;
	public Node next;
	public Node child;

	public Node() {
		this.data = 0;
		this.next = null;
		this.child = null;
	}

	public Node(int data) {
		this.data = data;
		this.next = null;
		this.child = null;
	}

	public Node(int data, Node next) {
		this.data = data;
		this.next = next;
		this.child = null;
	}

	public Node(int data, Node next, Node child) {
		this.data = data;
		this.next = next;
		this.child = child;
	}
}