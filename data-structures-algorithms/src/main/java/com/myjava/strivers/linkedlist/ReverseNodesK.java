package com.myjava.strivers.linkedlist;

public class ReverseNodesK {

	public static Node reverseK(Node head, int k) {
		Node dummyHead=new Node(-1);
		dummyHead.next=head;
		Node begin=dummyHead;
		int idx=0;
		while(head!=null)
		{
			if(idx!=0 && idx%k==0)
			{
				begin=reverse(begin,head);
				
			}
			head=head.next;
			idx++;
		}
		return head;
	}
	public static Node reverse(Node begin,Node end)
	{
		Node curr=begin.next;
		while(curr!=null && curr!=end)
		{
			Node temp=curr.next;
			curr.next=end;
			end=curr;
			curr=temp;
		}
		return begin;
	}
}
