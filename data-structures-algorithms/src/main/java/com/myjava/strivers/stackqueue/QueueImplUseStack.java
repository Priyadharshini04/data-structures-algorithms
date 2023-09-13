package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/implement-queue-using-stacks/
public class QueueImplUseStack {
	class MyQueue {
		Stack<Integer> stk1;
		Stack<Integer> stk2;

	    public MyQueue() {
	    	stk1=new Stack<Integer>();
			stk2=new Stack<Integer>();
	    }
	    
	    public void push(int x) {
	    	while(!stk1.isEmpty())
	    	{
	    		stk2.push(stk1.pop());
	    	}
	        stk2.push(x);
	        while(!stk2.isEmpty())
	        {
	        	stk1.push(stk2.pop());
	        }
	    }
	    
	    public int pop() {
	        return stk1.pop();
	    }
	    
	    public int peek() {
	        return stk1.peek();
	    }
	    
	    public boolean empty() {
	        return stk1.isEmpty();
	    }
	}
}
