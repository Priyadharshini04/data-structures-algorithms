package com.myjava.strivers.stackqueue;

import com.myjava.strivers.linkedlist.Node;

// https://www.codingninjas.com/studio/problems/implement-queue-using-linked-list_8161235
public class QueueUseLL extends Queue {
	public void push(int x) {
		if(front==null)
		{
			front=new Node(x);
			rear=front;
		}
		else {
			Node temp=new Node(x);
			rear.next=temp;
			rear=rear.next;
		}
	}

	public int pop() {
		if(front==null)
		{
			return -1;
		}
		int data=front.data;
		front=front.next;
		return data;
	}
}
