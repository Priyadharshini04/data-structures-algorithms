package com.myjava;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Solution2 {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		MyPredicate<Integer> predicate = (val) -> val % 2 == 0;
		list.stream().filter(i -> predicate.validate(i)).forEach(System.out::println);
		MyQueue mq = new MyQueue();
		mq.offer(1);
		mq.offer(2);
		mq.offer(3);
		System.out.println(mq.poll());
		mq.offer(4);
		mq.offer(5);
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.poll());
		System.out.println(mq.poll());

	}
}

@FunctionalInterface
interface MyPredicate<T> {
	public boolean validate(T val);
}

class MyQueue {
	Stack<Integer> stk1;
	Stack<Integer> stk2;

	MyQueue() {
		stk1 = new Stack<>();
		stk2 = new Stack<>();
	}

	public void offer(int val) {
		while (!stk2.isEmpty()) {
			stk1.push(stk2.pop()); // stk1 2,3,4,5
		}
		stk1.push(val); // queue 2,3,4,5

	}

	public int poll() {
		if (isEmpty())
			return -1;
		while (!stk1.isEmpty()) {
			stk2.push(stk1.pop()); // 5,4,3,2
		}
		return stk2.pop(); // 2,3,4,5
	}

	public boolean isEmpty() {
		return stk1.isEmpty() && stk2.isEmpty();
	}
}