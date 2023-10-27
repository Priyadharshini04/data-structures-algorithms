package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreOrderTraverse {

	public static List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		preorderTraversal(root, list);
		return list;
	}

	public static List<Integer> preorderTraversal_loop(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		Stack<TreeNode> stk1 = new Stack<TreeNode>();
		if (root != null) {
			stk1.push(root);
		}
		while (!stk1.isEmpty()) {
			TreeNode node = stk1.pop();
			list.add(node.data);
			if (node.right != null)
				stk1.push(node.right);
			if (node.left != null)
				stk1.push(node.left);
		}
		return list;
	}

	private static void preorderTraversal(TreeNode root, List<Integer> list) {
		if (root != null) {
			list.add(root.data);
			preorderTraversal(root.left, list);
			preorderTraversal(root.right, list);

		}

	}

}
