package com.myjava.strivers.binarytrees;

// https://leetcode.com/problems/balanced-binary-tree/
public class CheckBTisBalanced {
	boolean isNotBalanced = false;

	// the own solution is more optimized solution.
	public boolean isBalanced_optimised(TreeNode root) {
		return heightOfBTDiff_optimised(root)==-1?false:true;
		//return !isNotBalanced;
	}

	public int heightOfBTDiff(TreeNode node) {
		if (isNotBalanced)
			return 0;
		if (node == null)
			return 0;
		int lH = heightOfBTDiff(node.left);
		int rH = heightOfBTDiff(node.right);
		if (!isNotBalanced) {
			if (lH > rH) {
				isNotBalanced = lH - rH <= 1 ? false : true;
			} else {
				isNotBalanced = rH - lH <= 1 ? false : true;

			}
		}
		return 1 + Math.max(lH, rH);
	}

	public int heightOfBTDiff_optimised(TreeNode node) {
		if (node == null)
			return 0;
		int lH = heightOfBTDiff_optimised(node.left);
		if (lH == -1)
			return -1;
		int rH = heightOfBTDiff_optimised(node.right);
		if (rH == -1)
			return -1;
		if (Math.abs(lH - rH) > 1)
			return -1;
		return 1 + Math.max(lH, rH);
	}

	public boolean isBalanced(TreeNode node) {
		if (node == null)
			return true;
		int lH = new HeightOfBT().heightOfBinaryTree_levelRecursion(node.left);
		int rH = new HeightOfBT().heightOfBinaryTree_levelRecursion(node.right);
		if (Math.abs(lH - rH) > 1) {
			return false;
		}
		boolean left = isBalanced_optimised(node.left);
		boolean right = isBalanced_optimised(node.right);
		if (!left || !right)
			return false;
		return true;
	}
}
