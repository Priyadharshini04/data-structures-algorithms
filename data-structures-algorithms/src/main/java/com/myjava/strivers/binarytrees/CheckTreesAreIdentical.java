package com.myjava.strivers.binarytrees;

// https://leetcode.com/problems/same-tree/
public class CheckTreesAreIdentical {
	boolean isSame = true;

	public boolean isSameTree(TreeNode root1, TreeNode root2) {
		checkIsSameTree(root1, root2);
		return isSame;
	}

	public boolean checkIsSameTree(TreeNode root1, TreeNode root2) {
		if (isSame) {
			if (root1 == null && root2 == null) {
				return true;
			}
			if (root1 == null && root2 != null) {
				isSame=false;
				return false;
			}
			if (root1 != null && root2 == null) {
				isSame=false;
				return false;
			}
			if (root1.data != root2.data) {
				isSame=false;
				return false;
			}
			boolean leftSame = checkIsSameTree(root1.left, root2.left);
			boolean rightSame = checkIsSameTree(root1.right, root2.right);
			if (!leftSame || !rightSame) {
				isSame = false;
				return false;
			}
			return true;
		}
		return false;
	}
}
