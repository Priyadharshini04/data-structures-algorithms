package com.myjava.strivers.linkedlist;
//https://leetcode.com/problems/remove-nth-node-from-end-of-list/
public class RemoveNthNode {

	public static Node removeNode(Node head, int n) {
		int length=0;
		Node curr=head;
		while(curr!=null)
		{
			curr=curr.next;
			length++;
		}
		int idx=length-n;
		int i=0;
		curr=head;
		Node prev=null;
		while(curr!=null)
		{
			if(i==idx)
			{
				if(i==0)
				{
					if(curr.next==null)
					{
					curr=null;
					return curr;
					}
					else {
						head=head.next;
					}
				}
				else if(prev.next!=null && prev.next.next!=null)
				{
					prev.next=prev.next.next;
				}
				else {
					prev.next=null;
				}
			}
			prev=curr;
			curr=curr.next;
			i++;
		}
		return head;
	}
	
	public static Node removeNodeN(Node head, int n) {
		Node fast=head;
		Node slow=head;
		for(int i=0;i<n;i++)
		{
			fast=fast.next;
		}
		if(fast==null)
		{
			return head.next;
		}
		while(fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next;
		}
		slow.next=slow.next.next;
		return head;
	}

}
