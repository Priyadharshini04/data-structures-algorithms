package com.myjava.strivers.linkedlist;

import java.util.Stack;

public class ReverseNodesK {
	public static Node reverseK(Node head, int k) {
		Node temp = head;
		Node prevNode = null;
		while (temp != null) {
			Node kthNode = findKthNode(temp, k);
			if (kthNode == null) {
				prevNode.next = temp;
				temp = null;
			} else {
				Node nextNode = kthNode.next;
				kthNode.next = null;
				Node reversedNodeHead = reverse(temp);
				if (head == temp) {
					head = reversedNodeHead;
				} else {
					prevNode.next = reversedNodeHead;
				}
				prevNode = temp;
				temp = nextNode;
			}
		}
		return head;
	}

	public static Node findKthNode(Node node, int k) {
		int i = 1;
		while (i < k) {
			if (node != null)
				node = node.next;
			else
				return null;
			i++;
		}
		return node;
	}

	public static Node reverse(Node node) {
		Node prev = null;
		while (node != null) {
			Node temp = node.next;
			node.next = prev;
			prev = node;
			node = temp;
		}
		return prev;
	}

	public static Node reverseKs(Node head, int k) {
		Node node = head;
		Node result = null;
		Node resultNode = null;
		Node resultNodePrev = null;

		Stack<Node> stk = new Stack<Node>();
		while ((node != null || !stk.isEmpty()) && k > 1) {
			if (!stk.isEmpty() && stk.size() % k == 0) {
				Node temp = node;
				node = stk.pop();
				Node temp2 = node;
				while (!stk.isEmpty()) {
					temp2.next = stk.pop();
					temp2 = temp2.next;
				}
				temp2.next = temp;
				if (result == null) {
					result = node;
					resultNode = result;
				} else {
					resultNodePrev.next = node;
				}
				node = temp2.next;
			} else if (node != null) {
				stk.push(node);
				node = node.next;
				if (resultNode != null) {
					resultNodePrev = resultNode;
					resultNode = resultNode.next;
				}
			} else {
				break;
			}
		}
		return result == null ? head : result;
	}
}
