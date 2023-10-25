package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.Queue;

public class BinaryTreeLoop {

	public static TreeNode createBinaryTree(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		Queue<TreeNode> q1 = new ArrayDeque<TreeNode>();
		TreeNode root = new TreeNode(arr[0]);
		q1.offer(root);
		int i = 0;
		while (!q1.isEmpty() && i <= arr.length/2) {
			TreeNode temp = q1.poll();
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			if (left < arr.length) {
				temp.left = new TreeNode(arr[left]);
				q1.offer(temp.left);
			}
			if (right < arr.length) {
				temp.right = new TreeNode(arr[right]);
				q1.offer(temp.right);
			}
			i++;
		}
		return root;
	}

	public static TreeNode createBinaryTreeWithNull(int[] arr) {
		if (arr.length == 0) {
			return null;
		}
		Queue<TreeNode> q1 = new ArrayDeque<TreeNode>();
		TreeNode root = new TreeNode(arr[0]);
		q1.offer(root);
		int i = 0;
		while (!q1.isEmpty() && i <= arr.length/2) {
			TreeNode temp = q1.poll();
			int left = 2 * i + 1;
			int right = 2 * i + 2;
			if (left < arr.length && arr[left] != -1) {
				temp.left = new TreeNode(arr[left]);
				q1.offer(temp.left);
			}
			if (right < arr.length && arr[right] != -1) {
				temp.right = new TreeNode(arr[right]);
				q1.offer(temp.right);
			}
			i++;
		}
		return root;
	}

}
