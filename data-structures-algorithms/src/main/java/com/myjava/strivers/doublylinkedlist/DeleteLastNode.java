package com.myjava.strivers.doublylinkedlist;
//https://www.codingninjas.com/studio/problems/delete-last-node-of-a-doubly-linked-list_8160469
public class DeleteLastNode {

	public static Node delete(Node head) {
		Node tail=head;
		if(tail.next==null)
		{
			head=null;
			return head;
		}
		Node prev=null;
		while(tail.next!=null)
		{
			prev=tail;
			tail=tail.next;
		}
		prev.next=null;
		tail=null;
		return head;
	}

}
