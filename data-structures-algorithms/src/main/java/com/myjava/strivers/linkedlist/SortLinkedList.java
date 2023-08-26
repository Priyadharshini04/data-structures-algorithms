package com.myjava.strivers.linkedlist;

//https://leetcode.com/problems/sort-list/

public class SortLinkedList {

	public static Node selectionSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node first = head;
		while (first != null) {
			Node min = first;
			Node second = first.next;
			while (second != null) {
				if (second.data < min.data) {
					int data=min.data;
					min.data = second.data;
					second.data = data;
					// min.next=second.next;
					// second.next=temp.next;
				}
				second = second.next;
			}
			first = first.next;
		}
		return head;
	}
	// TODO have to implement quick, merge, insertion and bubble sort
}
