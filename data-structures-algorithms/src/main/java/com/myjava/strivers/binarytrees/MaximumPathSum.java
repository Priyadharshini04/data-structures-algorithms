package com.myjava.strivers.binarytrees;

// https://leetcode.com/problems/binary-tree-maximum-path-sum/
public class MaximumPathSum {
	int maxPathSum = Integer.MAX_VALUE * -1;

	public int maxPathSum(TreeNode root) {
		if (root != null && root.left == null && root.right == null) {
			return root.data;
		}
		findMaxPathSum_optimised(root);
		return maxPathSum;
	}

	// Optimised code.
	private int findMaxPathSum_optimised(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftSum = Math.max(0, findMaxPathSum(node.left));
		int rightSum = Math.max(0, findMaxPathSum(node.right));
		if (maxPathSum < node.data + leftSum + rightSum) {
			maxPathSum = node.data + leftSum + rightSum;
		}
		return node.data + Math.max(leftSum, rightSum);
	}

	private int findMaxPathSum(TreeNode node) {
		if (node == null) {
			return 0;
		}
		int leftSum = Math.max(0, findMaxPathSum(node.left));
		int rightSum = Math.max(0, findMaxPathSum(node.right));
		// assign zero if sum is negative.
//		int leftSum = Math.max(0, findMaxPathSum(node.left));
//		int rightSum = Math.max(0, findMaxPathSum(node.right));
		int currSum = node.data + leftSum + rightSum;
		if (currSum < leftSum && leftSum != 0) {
			currSum = leftSum;
		}
		if (currSum < rightSum && rightSum != 0) {
			currSum = rightSum;
		}
		if (node.data + leftSum > currSum) {
			currSum = node.data + leftSum;
		}
		if (node.data + rightSum > currSum) {
			currSum = node.data + rightSum;
		}
		if (node.data > currSum) {
			currSum = node.data;
		}
		if (maxPathSum < currSum) {
			maxPathSum = currSum;
		}
		// Mistake made was please sum the max of right or left with node. It's a max
		// sum path. Note: Path.
		return node.data + Math.max(leftSum, rightSum);
	}

}
