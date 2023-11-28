package com.myjava.ds.implementation;

public class QueueArrayImpl {
	private int _capacity;
	private int _front;
	private int _rear = -1;
	private int[] _array;

	QueueArrayImpl(int capacity) {
		_capacity = capacity;
		_array = new int[_capacity];
	}

	public void push(int ele) {
		if(isFull())
		{
			throw new QueueFullExeption();
		}
		_array[++_rear]=ele;
	}
	
	public int peek()
	{
		if(isEmpty())
		{
			throw new QueueEmptyException();
		}
		return _array[_front];
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			throw new QueueEmptyException();
		}
		return _array[_front++];
	}

	public boolean isEmpty() {
		return size()==0;
	}

	public boolean isFull() {
		return size()==_capacity;
	}

	public int size() {
		return _rear-_front+1;
	}
}
class QueueFullExeption extends RuntimeException
{
	private static final long serialVersionUID = 1L;
	
}

class QueueEmptyException extends RuntimeException
{
	private static final long serialVersionUID = 1L;
}