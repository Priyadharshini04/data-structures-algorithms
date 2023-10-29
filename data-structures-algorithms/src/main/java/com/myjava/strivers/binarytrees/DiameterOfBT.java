package com.myjava.strivers.binarytrees;

// https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBT {
	int maxDiameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {
		findDiameterOfTree(root);
		return maxDiameter;
	}

	public int findDiameterOfTree(TreeNode node) {
		if (node == null) {
			return 0;
		}

		int lH = findDiameterOfTree(node.left);
		int rH = findDiameterOfTree(node.right);
		if (lH + rH > maxDiameter) {
			maxDiameter = lH + rH;
		}
		return 1 + Math.max(lH, rH);
	}
}
