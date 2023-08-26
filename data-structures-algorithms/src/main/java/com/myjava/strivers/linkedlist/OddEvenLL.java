package com.myjava.strivers.linkedlist;

//https://leetcode.com/problems/odd-even-linked-list/
public class OddEvenLL {

	public static Node align(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node odd = head;
		Node even = head.next;
		Node oddCurrent = odd;
		Node evenCurrent = even;
		while (oddCurrent != null && oddCurrent.next != null) {
			oddCurrent.next = oddCurrent.next.next;
			if (oddCurrent.next != null)
				oddCurrent = oddCurrent.next;
			if (evenCurrent.next != null) {
				evenCurrent.next = evenCurrent.next.next;
				evenCurrent = evenCurrent.next;
			}
		}
		oddCurrent.next = even;
		return odd;
	}

	public static Node alignOptmized(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node oddCurrent = head;
		Node evenCurrent = head.next;
		Node even = evenCurrent;
		while (evenCurrent != null && evenCurrent.next != null) {
			oddCurrent.next = evenCurrent.next;
			oddCurrent = oddCurrent.next;
			evenCurrent.next = oddCurrent.next;
			evenCurrent = evenCurrent.next;
		}
		oddCurrent.next = even;
		return head;
	}

}
