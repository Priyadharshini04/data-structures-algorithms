package com.myjava.ds.implementation;

public class StackImpl {
	private int _capacity;
	private int _top = -1;
	private int[] _array;

	StackImpl(int capacity) {
		_capacity = capacity;
		_array = new int[capacity];
	}

	public void push(int ele) {
		if (isFull()) {
			throw new StackFullException();
		}
		_array[++_top] = ele;
	}

	public int pop() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return _array[_top--];
	}
	
	public int peek() {
		if (isEmpty()) {
			throw new StackEmptyException();
		}
		return _array[_top];
	}
	
	public int size() {
		return _top+1;
	}

	public boolean isEmpty() {
		return _top == -1;
	}

	public boolean isFull() {
		return _top == _capacity - 1 ? true : false;
	}

}

class StackEmptyException extends RuntimeException {
	private static final long serialVersionUID = 1L;

}

class StackFullException extends RuntimeException {
	private static final long serialVersionUID = 1L;
}