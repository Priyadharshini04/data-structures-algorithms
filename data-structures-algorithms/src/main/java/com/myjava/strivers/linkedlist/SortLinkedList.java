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
					int data = min.data;
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

	public static Node bubbleSort(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		Node first = head;
		while (first != null) {
			boolean swapped = false;
			Node second = head;
			while (second != null && second.next != null) {
				if (second.data > second.next.data) {
					int temp = second.data;
					second.data = second.next.data;
					second.next.data = temp;
					swapped = true;
				}
				second = second.next;
			}
			if (!swapped) {
				break;
			}
			first = first.next;
		}
		return head;
	}

	public static Node mergeSort(Node head) {
		return mergeSortAlgo(head);
	}

	private static Node mergeSortAlgo(Node node) {
		if (node != null) {
			if (node.next != null) {
				Node midNode = findMid(node);
				Node temp = midNode.next;
				midNode.next = null;
				Node leftSortedNode = mergeSortAlgo(node);
				Node rightSortedNode = mergeSortAlgo(temp);
				return merge(leftSortedNode, rightSortedNode);
			}
			return node;
		} else {
			return null;
		}
	}

	private static Node merge(Node leftSortedNode, Node rightSortedNode) {
		Node newNode = null;
		Node newTemp = null;
		while (leftSortedNode != null && rightSortedNode != null) {
			if (leftSortedNode.data < rightSortedNode.data) {
				Node temp = new Node(leftSortedNode.data);
				if (newNode == null) {
					newNode = temp;
					newTemp = newNode;
				} else {
					newTemp.next = temp;
					newTemp = newTemp.next;
				}
				leftSortedNode = leftSortedNode.next;
			} else {
				Node temp = new Node(rightSortedNode.data);
				if (newNode == null) {
					newNode = temp;
					newTemp = newNode;
				} else {
					newTemp.next = temp;
					newTemp = newTemp.next;
				}
				rightSortedNode = rightSortedNode.next;
			}
		}
		while (leftSortedNode != null) {
			Node temp = new Node(leftSortedNode.data);
			if (newNode == null) {
				newNode = temp;
				newTemp = newNode;
			} else {
				newTemp.next = temp;
				newTemp = newTemp.next;
			}
			leftSortedNode = leftSortedNode.next;
		}
		while (rightSortedNode != null) {
			Node temp = new Node(rightSortedNode.data);
			if (newNode == null) {
				newNode = temp;
				newTemp = newNode;
			} else {
				newTemp.next = temp;
				newTemp = newTemp.next;
			}
			rightSortedNode = rightSortedNode.next;
		}
		return newNode;
	}

	private static Node findMid(Node node) {
		Node slow = node;
		Node fast = node.next;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}
	// TODO: quick sort.
}
