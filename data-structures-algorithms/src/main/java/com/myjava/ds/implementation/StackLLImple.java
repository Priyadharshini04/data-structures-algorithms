package com.myjava.ds.implementation;

import com.myjava.strivers.linkedlist.Node;

public class StackLLImple {
	private Node _head;
	private int _size = 0;

	public int pop() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		int val = _head.data;
		_head = _head.next;
		--_size;
		return val;

	}

	public int peek() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return _head.data;
	}

	public void push(int ele) {
		try {
			// no need of null check here.
			if (_head == null) {
				_head = new Node(ele);
			}
			else {
			Node newNode = new Node(ele);
			newNode.next = _head;
			_head = newNode;
			}
			++_size;
		} catch (Exception e) {
			throw new StackFullException();
		}
	}

	public boolean isEmpty() {
		return _head == null;
	}

	public int size() {
		return _size;
	}
}
