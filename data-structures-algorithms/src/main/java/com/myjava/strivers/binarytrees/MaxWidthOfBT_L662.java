package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// https://leetcode.com/problems/maximum-width-of-binary-tree/description/
public class MaxWidthOfBT_L662 {

	// Optimised.
	static int width = 1;

	public static int widthOfBinaryTree(TreeNode root) {
		ArrayList<Integer> sc = new ArrayList<>();
		check(root, 0, 1, sc);
		return width;
	}

	public static void check(TreeNode root, int index, int h, ArrayList<Integer> sc) {
		if (root == null) {
			return;
		}
		if (index == sc.size()) {
			sc.add(h);
		}
		width = Math.max(width, h - sc.get(index) + 1);
		check(root.left, index + 1, h * 2, sc);
		check(root.right, index + 1, h * 2 + 1, sc);
	}

	// maintain indexing.
	public static int widthOfBinaryTreess(TreeNode root) {
		int maxWidth = 0;
		Queue<Pair> queue = new LinkedList<Pair>();
		if (root != null) {
			queue.offer(new Pair(root, 0));
		}
		while (!queue.isEmpty()) {
			int level = queue.size();
			int leftMost = queue.peek().idx;
			int rightMost = 0;
			while (level-- > 0) {
				if (level == 0) {
					rightMost = queue.peek().idx;
				}
				Pair pair = queue.poll();
				if (pair.node.left != null) {
					queue.offer(new Pair(pair.node.left, (pair.idx * 2 + 1)));
				}
				if (pair.node.right != null) {
					queue.offer(new Pair(pair.node.right, (pair.idx * 2 + 2)));
				}
			}
			if ((rightMost - leftMost + 1) > maxWidth) {
				maxWidth = rightMost - leftMost + 1;
			}
		}
		return maxWidth;
	}

	// Time limit exceeded.
	public static int widthOfBinaryTrees(TreeNode root) {
		int maxWidth = 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null)
			queue.offer(root);
		if (root.left == null && root.right == null)
			return 1;
		while (!queue.isEmpty()) {
			int level = queue.size();
			Stack<TreeNode> stk = new Stack<TreeNode>();
			for (int i = 0; i < level; i++) {
				TreeNode node = queue.poll();

				if (node.left != null) {
					queue.offer(node.left);
					stk.push(node.left);
				} else if (!stk.isEmpty()) {
					TreeNode dummy = new DummyTreeNode();
					stk.push(dummy);
					queue.offer(dummy);
				}
				if (node.right != null) {
					queue.offer(node.right);
					stk.push(node.right);
				} else if (!stk.isEmpty()) {
					TreeNode dummy = new DummyTreeNode();
					stk.push(dummy);
					queue.offer(dummy);
				}
			}
			while (!stk.isEmpty() && stk.peek() instanceof DummyTreeNode) {
				stk.pop();
			}
			if (stk.size() == 0)
				break;
			if (maxWidth < stk.size()) {
				maxWidth = stk.size();
			}
		}
		return maxWidth;

	}
}

class DummyTreeNode extends TreeNode {

	public DummyTreeNode() {
	}

}

class Pair {

	TreeNode node;
	int idx;

	Pair(TreeNode node, int idx) {
		this.node = node;
		this.idx = idx;
	}
}