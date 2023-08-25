package com.myjava.strivers.doublylinkedlist;

public class InsertAtEnd {

	public static Node insert(Node head, int i) {
		if(head==null)
		{
			return new Node(i);
		}
		Node tail=head;
		while(tail.next!=null)
		{
			tail=tail.next;
		}
		Node lastNode=new Node(i);
		tail.next=lastNode;
		lastNode.prev=tail;
		tail=tail.next;
		tail.next=null;
		return head;
	}

}
