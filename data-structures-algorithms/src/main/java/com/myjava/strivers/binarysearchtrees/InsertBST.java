package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

// https://leetcode.com/problems/insert-into-a-binary-search-tree/
public class InsertBST {

	public static TreeNode insertIntoBST(TreeNode root, int val) {
		TreeNode temp = new TreeNode(val);
		if (root == null)
			return temp;
		TreeNode node = root;
		while (node != null) {
			if (node.data == val || (node.left == null && node.right == null))
				break;
			if (node.data > val) {
				if (node.left == null)
					break;
				node = node.left;
			} else {
				if (node.right == null)
					break;
				node = node.right;
			}
			// reduces memory usage but increases time complexity slightly.
			System.gc();

		}
		if (node.data < val)
			node.right = temp;
		else
			node.left = temp;
		return root;
	}

	public static TreeNode insertIntoBSTs(TreeNode root, int val) {
		if (root == null)
			return new TreeNode(val);
		if (val < root.data)
			root.left = insertIntoBST(root.left, val);
		else
			root.right = insertIntoBST(root.right, val);
		System.gc();
		return root;
	}

}
