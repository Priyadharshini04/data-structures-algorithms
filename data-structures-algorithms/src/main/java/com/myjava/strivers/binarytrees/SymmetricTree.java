package com.myjava.strivers.binarytrees;

// https://leetcode.com/problems/symmetric-tree/description/
public class SymmetricTree {
	boolean isSymmetric = true;

	public boolean isSymmetric(TreeNode root) {
		checkSymmetric(root.left, root.right);
		return isSymmetric;
	}

	public void checkSymmetric(TreeNode left, TreeNode right) {
		if (isSymmetric) {
			if (left != null || right != null) {
				if (left == null && right != null) {
					isSymmetric = false;
					return;
				}
				if (left != null && right == null) {
					isSymmetric = false;
					return;
				}
				if (left.data != right.data) {
					isSymmetric = false;
					return;
				}
				checkSymmetric(left.left, right.right);
				checkSymmetric(left.right, right.left);
			}
		}
	}
}
