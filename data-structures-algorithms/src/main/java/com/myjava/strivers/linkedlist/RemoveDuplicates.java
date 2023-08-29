package com.myjava.strivers.linkedlist;

// https://leetcode.com/problems/remove-duplicates-from-sorted-list/
public class RemoveDuplicates {

	public static Node removeDuplicate(Node head) {
		Node temp = head;
		while (temp != null) {
			if (temp != null && temp.next != null && temp.data == temp.next.data) {
				temp.next = temp.next.next;
			} else {
				temp = temp.next;
			}
		}
		return head;
	}

}
