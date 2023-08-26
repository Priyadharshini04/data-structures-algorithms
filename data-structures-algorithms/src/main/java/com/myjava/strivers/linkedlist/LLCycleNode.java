package com.myjava.strivers.linkedlist;
//https://leetcode.com/problems/linked-list-cycle-ii/
public class LLCycleNode {

	public static Node findCyclePosition(Node head) {
		// TODO Auto-generated method stub
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(slow==fast)
			{
				break;
			}
		}
        if (fast == null || fast.next == null) return null;
		Node curr=head;
		while(curr!=slow)
		{
			curr=curr.next;
			slow=slow.next;
		}
		return curr;
	}

}
