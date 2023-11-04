package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

// https://leetcode.com/problems/search-in-a-binary-search-tree/
public class SearchBST {

	public static TreeNode searchLoop(TreeNode root, int val) {
		while (root != null) {
			int rootVal = root.data;
			if (rootVal == val) {
				return root;
			} else if (rootVal < val) {
				root = root.right;
			} else {
				root = root.left;
			}
		}
		return null;
	}
	static TreeNode foundNode=null;
	public static TreeNode search(TreeNode root, int val) {
		if (root != null && foundNode==null) {
			int rootValue = root.data;
			if (rootValue == val) {
				foundNode=root;
			} else if (rootValue < val) {
				search(root.right, val);
			} else {
				search(root.left, val);
			}
		}
		return foundNode;
	}
}
