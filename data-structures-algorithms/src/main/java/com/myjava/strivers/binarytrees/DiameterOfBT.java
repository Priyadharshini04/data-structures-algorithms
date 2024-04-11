package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

// https://leetcode.com/problems/diameter-of-binary-tree/
public class DiameterOfBT {
	int maxDiameter = 0;

	public int diameterOfBinaryTree(TreeNode root) {
//		findDiameterOfTree(root);
//		return maxDiameter;
		int[] maxHeight = new int[] { 0 };
		findMaxDiameter(root, maxHeight);
		return maxHeight[0];
	}

	int findMaxDiameter(TreeNode node, int[] maxDia) {
		if (node == null)
			return 0;
		int leftHeight = findMaxDiameter(node.left, maxDia);
		int rightHeight = findMaxDiameter(node.right, maxDia);
		maxDia[0] = Math.max(maxDia[0], leftHeight + rightHeight);
		return 1 + Math.max(leftHeight, rightHeight);
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

	public int diameterOfBinaryTrees(TreeNode root) {
		int maxDiameter = 0;
		Queue<TreeNode> q1 = new ArrayDeque<TreeNode>();
		if (root != null) {
			q1.offer(root);
		}
		while (!q1.isEmpty()) {
			int level = q1.size();
			while (level-- > 0) {
				TreeNode n = q1.poll();
				int diameter = heightOfTree(n.left) + heightOfTree(n.right);
				if (maxDiameter < diameter) {
					maxDiameter = diameter;
				}
				if (n.left != null) {
					q1.offer(n.left);
				}
				if (n.right != null) {
					q1.offer(n.right);
				}
			}
		}
		return maxDiameter;
	}

	public int heightOfTree(TreeNode node) {
		int height = 1;
		TreeNode node1 = node;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		while (node1 != null || !stk.isEmpty()) {
			while (node1 != null) {
				stk.push(node1);
				node1 = node1.left;
			}
			if (stk.size() > height) {
				height = stk.size();
			}
			TreeNode temp = stk.peek().right;
			if (temp == null) {
				temp = stk.pop();
				while (!stk.isEmpty() && temp == stk.peek().right) {
					temp = stk.pop();
				}
			} else {
				node1 = temp;
			}
		}
		return height;
	}
}
