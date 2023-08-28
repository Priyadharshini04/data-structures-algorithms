package com.myjava.strivers.linkedlist;

// https://www.codingninjas.com/studio/problems/add-one-to-a-number-represented-as-linked-list_920557
public class AddOneAsNumber {

	public static Node add(Node head) {
		Node curr = head;
		if (head == null) {
			return head;
		}
		while (curr != null && curr.data == 0) {
			curr = curr.next;
		}
		curr = reverse(curr);
		Node prev = curr;
		Node temp = curr;
		int carry = 1;
		while (temp != null) {
			int sum = temp.data + carry;
			carry = sum / 10;
			sum = sum % 10;
			temp.data = sum;
			prev = temp;
			temp = temp.next;
		}
		if (carry != 0) {
			Node newNode = new Node(1);
			if (prev != null) {
				prev.next = newNode;
			} else {
				return newNode;
			}
		}
		curr = reverse(curr);
		return curr;
	}

	public static Node reverse(Node curr) {
		Node currMove = curr;
		if (currMove != null && currMove.next == null) {
			return curr;
		}
		Node prev = null;
		while (currMove != null) {
			Node temp = currMove.next;
			currMove.next = prev;
			prev = currMove;
			currMove = temp;
		}
		return prev;

	}

}
