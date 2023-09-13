package com.myjava.strivers.stackqueue;

// https://www.codingninjas.com/studio/problems/stack-implementation-using-array_3210209
public class StackImplementation {
	static class Stack {
		int _top = -1;
		int[] _arr;

		Stack(int capacity) {
			_arr = new int[capacity];
		}

		public void push(int num) {
			if (isFull() == 0) {
				_arr[++_top] = num;
			}
		}

		public int pop() {
			if(isEmpty()==1)
	        {
	            return -1;
	        }
			return _arr[_top--];
		}

		public int top() {
		if(isEmpty()==1)
        {
            return -1;
        }
			return _arr[_top];
		}

		public int isEmpty() {
			return _top == -1 ? 1 : 0;
		}

		public int isFull() {
			return _top + 1 == _arr.length ? 1 : 0;
		}
		public int size()
		{
			return _top+1;
		}
	}
}
