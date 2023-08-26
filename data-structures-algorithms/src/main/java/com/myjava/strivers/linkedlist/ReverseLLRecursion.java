package com.myjava.strivers.linkedlist;
//https://leetcode.com/problems/reverse-linked-list/
public class ReverseLLRecursion {

	public static Node reverse(Node head) {
		return reverse(head,head,null,null);
	}
	public static Node reverse(Node head,Node curr,Node tail, Node temp)
	{
		if(curr==null)
		return tail;
		
		temp=curr.next;
		curr.next=tail;
		tail=curr;
		curr=temp;
		return reverse(head,curr,tail,temp);
	}

}
