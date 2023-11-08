package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

// https://www.codingninjas.com/studio/problems/boundary-traversal-of-binary-tree_790725
public class BoundaryTraversal {
	// Hint: Traverse left and right separately instead of doing both at the same
	// time. Dont't use single while loop for left and right boundaries.
	public static List<Integer> traverseBoundary(TreeNode root) {
		List<Integer> boundaries = new ArrayList<Integer>();
		if (root.left != null || root.right != null)
			boundaries.add(root.data);
		addLeft(root.left, boundaries);
		addLeaf(root, boundaries);
		addRight(root.right, boundaries);

		return boundaries;
	}

	private static void addLeft(TreeNode node, List<Integer> boundaries) {
		while (node != null) {
			if (!(node.left == null && node.right == null))
				boundaries.add(node.data);
			if (node.left != null) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
	}

	private static void addRight(TreeNode node, List<Integer> boundaries) {
		Stack<Integer> right = new Stack<Integer>();
		while (node != null) {
			if (!(node.left == null && node.right == null))
				right.push(node.data);
			if (node.right != null) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		while (!right.isEmpty()) {
			boundaries.add(right.pop());
		}
	}

	public static void addLeaf(TreeNode node, List<Integer> leaves) {
		if (node != null) {
			if (node.left == null && node.right == null) {
				leaves.add(node.data);
				return;
			}
			addLeaf(node.left, leaves);
			addLeaf(node.right, leaves);
		}
	}
}
