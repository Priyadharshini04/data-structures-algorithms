package com.myjava.strivers.linkedlist;
//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleNode {

	public static Node findMiddle(Node head) {
		int count = 1;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			count++;
		}
		int middle=(count/2)+1;
		int i=1;
		temp=head;
		while(temp.next!=null)
		{
			if(middle==i)
			{
				return temp;
			}
			temp=temp.next;
			i++;
		}
		return temp;
	}
	
	public static Node findMiddleOptimized(Node head) 
	{
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		return slow;
	}

}
