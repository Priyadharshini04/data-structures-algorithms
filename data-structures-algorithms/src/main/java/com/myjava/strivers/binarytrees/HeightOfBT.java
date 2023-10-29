package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
// https://leetcode.com/problems/maximum-depth-of-binary-tree/description/
public class HeightOfBT {

	// Solved using level Order.
	public int heightOfBinaryTree_levelRecursion(TreeNode root) {
		if (root == null)
			return 0;
		int left = heightOfBinaryTree_levelRecursion(root.left);
		int right = heightOfBinaryTree_levelRecursion(root.right);
		return 1 + Math.max(left, right);
	}
	
	public int heightOfBinaryTree_level(TreeNode root) {
		Queue<TreeNode> bfsQueue = new ArrayDeque<TreeNode>();
		if (root != null) {
			bfsQueue.offer(root);
		}
		int level = 0;
		while (!bfsQueue.isEmpty()) {
			int size = bfsQueue.size();
			while (size-- > 0) {
				TreeNode node = bfsQueue.poll();
				if (node.left != null) {
					bfsQueue.offer(node.left);
				}
				if (node.right != null) {
					bfsQueue.offer(node.right);
				}
			}
			level++;
		}
		return level;
	}

	// Solved using post order logic.
	public int maxHeight = 0;

	public int heightOfBinaryTree(TreeNode root) {
		heightOfBT(root, 0);
		return maxHeight;
	}

	private void heightOfBT(TreeNode node, int cnt) {
		if (node != null) {
			heightOfBT(node.left, cnt + 1);
			heightOfBT(node.right, cnt + 1);
		}
		maxHeight = Math.max(cnt, maxHeight);
	}

	public int heightOfBinaryTree_loop(TreeNode root) {
		int maxHeight = 0;
		Stack<TreeNode> stk = new Stack<>();
		TreeNode node = root;
		while (node != null || !stk.isEmpty()) {
			while (node != null) {
				stk.push(node);
				node = node.left;
			}
			TreeNode temp = stk.peek().right;
			if (temp == null) {
				if (maxHeight < stk.size()) {
					maxHeight = stk.size();
				}
				temp = stk.pop();
				while (!stk.isEmpty() && temp == stk.peek().right) {
					temp = stk.pop();
				}
			} else {
				node = temp;
			}
		}
		return maxHeight;
	}
}
