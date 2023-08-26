package com.myjava.strivers.linkedlist;

import java.util.HashSet;

//https://leetcode.com/problems/linked-list-cycle/
public class LLcycle {
	public static boolean hasCycle(Node head) {
		Node curr=head;
		HashSet<Node> hs=new HashSet<Node>();
		while(curr!=null)
		{
			if(hs.contains(curr))
			{
				return true;
			}
			hs.add(curr);
			curr=curr.next;
		}
        return false;
    }
	
	public static boolean hasCyclic(Node head) {
		Node slow=head;
		Node fast=head;
		while(fast!=null && fast.next!=null)
		{
			slow=slow.next;
			fast=fast.next.next;
			if(fast==slow)
			{
				return true;
			}
		}
        return false;
    }
}
