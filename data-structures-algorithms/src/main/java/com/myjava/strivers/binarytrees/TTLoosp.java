package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TTLoosp {
	// Own impementation.
	public static List<List<Integer>> getTreeTraversals(TreeNode root) {
		List<Integer> preOrder = new Stack<Integer>();
		List<Integer> inOrder = new ArrayList<Integer>();
		List<Integer> postOrder = new ArrayList<Integer>();
		if (root != null) {
			preOrders(root, preOrder);
			inOrders(root, inOrder);
			postOrders(root, postOrder);
		}
		return Arrays.asList(inOrder, preOrder, postOrder);
	}

	private static void preOrders(TreeNode root, List<Integer> preOrder) {
		Stack<TreeNode> stk = new Stack<TreeNode>();
		if (root.right != null)
			stk.push(root.right);
		if (root.left != null)
			stk.push(root.left);
		preOrder.add(root.data);
		while (!stk.isEmpty() && stk.peek() != null) {
			TreeNode n = stk.pop();
			preOrder.add(n.data);
			if (n.right != null)
				stk.push(n.right);
			if (n.left != null)
				stk.push(n.left);
		}
	}

	private static void inOrders(TreeNode root, List<Integer> inOrder) {
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root.right);
		stk.push(root);
		stk.push(root.left);
		while (!stk.isEmpty()) {
			TreeNode n = stk.pop();
			if (n != null) {
				if ((n.left == null && n.right == null)
						|| (!stk.isEmpty() && (stk.peek() == null || stk.peek() == n.right))) {
					inOrder.add(n.data);
				} else {
					stk.push(n.right);
					stk.push(n);
					stk.push(n.left);
				}
			}
		}
	}

	private static void postOrders(TreeNode root, List<Integer> preOrder) {
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root);
		if (root.right != null)
			stk.push(root.right);
		if (root.left != null)
			stk.push(root.left);
		TreeNode lastPopped = null;
		while (!stk.isEmpty() && stk.peek() != null) {
			TreeNode n = stk.pop();
			if (n.left == null && n.right == null
					|| (lastPopped != null && (lastPopped == n.right || lastPopped == n.left))) {
				lastPopped = n;
				preOrder.add(n.data);
			} else {
				stk.push(n);
				if (n.right != null)
					stk.push(n.right);
				if (n.left != null)
					stk.push(n.left);
			}
		}
	}
}
