package com.myjava.ds.implementation;

import com.myjava.strivers.linkedlist.Node;

public class QueueLLImpl {
	Node _head;
	Node _rear;
	int size = 0;

	public void push(int ele) {
		if (_head == null) {
			_head = new Node(ele);
			_rear = _head;
		} else {
			Node temp = new Node(ele);
			_rear.next = temp;
			_rear = _rear.next;
		}
		++size;
	}

	public int peek() {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		return _head.data;
	}

	public int pop() {
		if (isEmpty()) {
			throw new QueueEmptyException();
		}
		int val = _head.data;
		_head = _head.next;
		--size;
		return val;
	}

	public boolean isEmpty() {
		return _head == null;
	}

	public int size() {
		return size;
	}
}
