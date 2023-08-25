package com.myjava.strivers.doublylinkedlist;

public class Node {
	int data;
	Node next;
	Node prev;
	Node()
	{
		this.data=0;
		this.next=null;
		this.prev=null;
	}
	Node(int data)
	{
		this.data=data;
		this.next=null;
		this.prev=null;
	}

	Node(int data, Node prev)
	{
		this.data=data;
		this.next=null;
		this.prev=prev;
	}
	

	Node(int data, Node next, Node prev)
	{
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}
