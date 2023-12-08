package com.myjava.strivers.binarytrees;

public class ChildrenSumProperty {

	public static boolean isParentSum(TreeNode root) {
		if (root == null)
			return true;
		if (root.left == null && root.right == null)
			return true;
		int left = 0;
		int right = 0;
		if (root.left != null) {
			left = root.left.data;
		}
		if (root.right != null) {
			right = root.right.data;
		}
		if (root.data != left + right)
			return false;
		boolean leftNode = isParentSum(root.left);
		boolean rightNode = isParentSum(root.right);

		return leftNode && rightNode;
	}

}
