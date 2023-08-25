package com.myjava.strivers.linkedlist;
//https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLL {

	public static Node reverse(Node head) {
		Node curr=head;
		Node tail=null;
		while(curr!=null)
		{
			Node temp=curr.next;
			curr.next=tail;
			tail=curr;
			curr=temp;
		}
		
		return tail;
	}

}
