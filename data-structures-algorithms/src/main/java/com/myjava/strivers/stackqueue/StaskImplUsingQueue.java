package com.myjava.strivers.stackqueue;

import java.util.ArrayDeque;
import java.util.Queue;

// https://leetcode.com/problems/implement-stack-using-queues/
public class StaskImplUsingQueue {
	
	class MyStack {
		Queue<Integer> q1;
		Queue<Integer> q2;

		public MyStack() {
			q1 = new ArrayDeque<Integer>();
			q2 = new ArrayDeque<Integer>();
		}

		public void push(int x) {
			q2.add(x);
			q2.addAll(q1);
			q1=new ArrayDeque<Integer>(q2);
			q2=new ArrayDeque<Integer>();
		}

		public int pop() {
			return q1.poll();
		}

		public int top() {
			return q1.peek();
		}

		public boolean empty() {
			return q1.isEmpty();
		}
	}
}
