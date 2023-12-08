package com.myjava.strivers.binarytrees;

// https://leetcode.com/problems/count-complete-tree-nodes/
public class CountNodes_L222 {

	public static int countNodes(TreeNode root) {
		if (root != null) {
			int left = countNodes(root.left);
			int right = countNodes(root.right);
			return 1 + left + right;
		}
		return 0;
	}

}
