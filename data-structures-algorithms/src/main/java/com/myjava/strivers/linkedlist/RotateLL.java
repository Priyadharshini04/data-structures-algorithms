package com.myjava.strivers.linkedlist;
// https://leetcode.com/problems/rotate-list/
public class RotateLL {
	public Node rotateRight(Node head, int k) {
        // 1->2->3->4->5
        int length=0;
        Node traverse=head;
        while(traverse!=null)
        {
            traverse=traverse.next;
            ++length;
        }
        k%=length;
        int rotate=length-k;
        traverse=head;
        int i=1;
        Node newHead=null;
        // 1->2->3->4->5
        while(i<=rotate && traverse!=null)
        {
            if(i==rotate)
            {
                newHead=traverse.next; // 4
                traverse.next=null;
            }
            traverse=traverse.next; // 3
            i++; // 3
        }
        traverse=newHead;
        while(traverse!=null && traverse.next!=null)
        {
            traverse=traverse.next;
        }
        if(traverse!=null)
        {
        traverse.next=head;
        return newHead;
        }
        return head;
    }
}
