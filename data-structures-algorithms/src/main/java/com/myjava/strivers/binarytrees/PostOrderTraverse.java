package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-postorder-traversal/description/
public class PostOrderTraverse {

	public static List<Integer> postOrderTraverse(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		postOrderTraverse(root, list);
		return list;
	}

	private static void postOrderTraverse(TreeNode root, List<Integer> list) {
		if (root != null) {
			postOrderTraverse(root.left, list);
			postOrderTraverse(root.right, list);
			list.add(root.data);
		}
	}

	public static List<Integer> postOrderTraverse_loop(TreeNode root) {
		List<Integer> list1 = new ArrayList<Integer>();
		Stack<TreeNode> stk1 = new Stack<TreeNode>();
		Stack<TreeNode> stk2 = new Stack<TreeNode>();
		TreeNode node = root;
		if (root != null) {
			stk1.push(node);
		}
		while (!stk1.isEmpty()) {
			TreeNode n = stk1.pop();
			if (n.left != null)
				stk1.push(n.left);
			if (n.right != null)
				stk1.push(n.right);
			stk2.push(n);
		}
		while (!stk2.isEmpty()) {
			list1.add(stk2.pop().data);
		}

		return list1;
	}
}
