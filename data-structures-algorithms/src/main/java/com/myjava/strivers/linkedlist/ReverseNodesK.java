package com.myjava.strivers.linkedlist;

import java.util.Stack;

public class ReverseNodesK {

	public static Node reverseK(Node node, int k) {
		Node temp = node; // 1
		Node prevTail = null;
		Node reverseHead = null;
		while (temp != null) {
			boolean[] isLess = new boolean[] { false };
			Node kNode = findKthNodes(temp, k, isLess);
			if (!isLess[0]) {
				Node reverse = reverse(temp, k);
				if (reverseHead == null) {
					reverseHead = reverse;
				}
				if (prevTail != null) {
					prevTail.next = reverse;
				}
			}
			else {
				prevTail.next=temp;
				break;
			}

			prevTail = temp;
			temp = kNode;
		}
		return reverseHead;
	}

	static Node findKthNodes(Node node, int k, boolean[] isLess) {
		Node temp = node; // 1
		while (temp != null && k-- > 0) {
			temp = temp.next;
		}
		if (k > 0)
			isLess[0] = true;
		else
			isLess[0] = false;
		return temp;
	}

	static Node reverse(Node node, int k) {
		Node temp = node;
		Node prev = null;
		while (temp != null && k-- > 0) {
			Node currTemp = temp.next;
			temp.next = prev;
			prev = temp;
			temp = currTemp;
		}
		return prev;
	}

	public static Node reverseK1(Node head, int k) {
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
