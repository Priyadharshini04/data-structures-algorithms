package com.myjava.strivers.linkedlist;

public class PalindromeList {

	public static boolean isPlaindrome(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
		}
		if(slow==null)
		{
			return false;
		}
		Node curr=head;
		Node middle=slow;
		Node tail=null;
		while(slow!=null)
		{
			Node temp=slow.next;
			slow.next=tail;
			tail=slow;
			slow=temp;
		}
		while(curr!=middle && tail!=null)
		{
			if(curr.data!=tail.data)
			{
				return false;
			}
			curr=curr.next;
			tail=tail.next;
		}
		return true;
	}

}
