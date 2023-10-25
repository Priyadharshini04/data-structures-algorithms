package com.myjava.strivers.binarytrees;

public class CreateBinaryTree {

	public static TreeNode createBinaryTree(int[] arr) {
		return createBinaryStructure(arr, 0, null, null);
	}

	public static TreeNode createBinaryStructure(int[] arr, int i, TreeNode temp, TreeNode head) {
		if (i < arr.length / 2) {
			int left = i * 2 + 1;
			int right = i * 2 + 2;
			if (head == null) {
				head = new TreeNode(arr[i]);
				temp = head;
			}
			if (left < arr.length) {
				temp.left = new TreeNode(arr[left]);
			}
			if (right < arr.length) {
				temp.right = new TreeNode(arr[right]);
			}
			createBinaryStructure(arr, left, temp.left, head);
			createBinaryStructure(arr, right, temp.right, head);
		}
		return head;
	}
}
