package com.myjava.strivers.binarytrees;

public class CreateBinaryTree {

	public static Node createBinaryTree(int[] arr) {
		return createBinaryStructure(arr, 0, null, null);
	}

	public static Node createBinaryStructure(int[] arr, int i, Node temp, Node head) {
		if (i < arr.length / 2) {
			int left = i * 2 + 1;
			int right = i * 2 + 2;
			if (head == null) {
				head = new Node(arr[i]);
				temp = head;
			}
			if (left < arr.length) {
				temp.left = new Node(arr[left]);
			}
			if (right < arr.length) {
				temp.right = new Node(arr[right]);
			}
			createBinaryStructure(arr, left, temp.left, head);
			createBinaryStructure(arr, right, temp.right, head);
		}
		return head;
	}
}
