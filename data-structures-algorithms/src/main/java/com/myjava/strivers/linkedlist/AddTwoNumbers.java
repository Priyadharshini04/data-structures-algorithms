package com.myjava.strivers.linkedlist;

//https://leetcode.com/problems/add-two-numbers/
public class AddTwoNumbers {

	public static Node add(Node l1, Node l2) {
		if (l1 == null && l2 == null) {
			return null;
		}
		Node sumHead = null;
		Node sumCurr = sumHead;
		Node l1Curr = l1;
		Node l2Curr = l2;
		int carry = 0;
		while (l1Curr != null && l2Curr != null) {
			int total = l1Curr.data + l2Curr.data + carry;
			carry = total / 10;
			total = total % 10;
			if (sumCurr == null) {
				sumHead = new Node(total);
				sumCurr = sumHead;
			} else {
				Node temp = new Node(total);
				sumCurr.next = temp;
				sumCurr = sumCurr.next;
			}
			l1Curr = l1Curr.next;
			l2Curr = l2Curr.next;
		}

		while (l1Curr != null) {
			int total = l1Curr.data + carry;
			carry = total / 10;
			total = total % 10;
			if (sumCurr == null) {
				sumHead = new Node(total);
				sumCurr = sumHead;
			} else {
				Node temp = new Node(total);
				sumCurr.next = temp;
				sumCurr = sumCurr.next;
			}
			l1Curr = l1Curr.next;
		}

		while (l2Curr != null) {
			int total = l2Curr.data + carry;
			carry = total / 10;
			total = total % 10;
			if (sumCurr == null) {
				sumHead = new Node(total);
				sumCurr = sumHead;
			} else {
				Node temp = new Node(total);
				sumCurr.next = temp;
				sumCurr = sumCurr.next;
			}
			l2Curr = l2Curr.next;
		}
		if (carry != 0) {
			Node tailNode = new Node(carry);
			sumCurr.next = tailNode;
		}

		return sumHead;

	}

}
