package com.myjava.strivers.doublylinkedlist;
//https://www.codingninjas.com/studio/problems/reverse-a-doubly-linked-list_1116098
public class ReverseDLL {

	public static Node reverse(Node head) {
		Node curr=head;
		Node prev=null;
		Node temp;
		while(curr!=null)
		{
			temp=curr.next;
			curr.next=prev;
			curr.prev=temp;
			prev=curr;
			curr=temp;
		}
		return prev;
	}

}
