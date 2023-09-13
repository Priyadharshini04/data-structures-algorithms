package com.myjava.strivers.stackqueue;

import com.myjava.strivers.linkedlist.Node;

// https://www.codingninjas.com/studio/problems/implement-stack-with-linked-list_1279905
public class StackUseLL {
	static class Stack {
		Node head,tail;
		int size=0;
        Stack()
        {
        }

        int getSize()
        {
            return size;
        }

        boolean isEmpty()
        {
            return size==0;
        }

        void push(int data)
        {
            head=new Node(data);
            head.next=tail;
            tail=head;
            ++size;
        }

        void pop()
        {
        	if(isEmpty())
        	{
        		return;
        	}
            head=head.next;
            tail=head;
            --size;
        }

        int getTop()
        {
        	if(isEmpty())
        	{
        		return -1;
        	}
            return head.data;
        }
    }
}
