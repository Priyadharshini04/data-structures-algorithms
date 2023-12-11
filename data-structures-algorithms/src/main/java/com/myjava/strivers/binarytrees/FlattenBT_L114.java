package com.myjava.strivers.binarytrees;

import java.util.Stack;

public class FlattenBT_L114 {
	public static void flatten(TreeNode root) {
		if (root == null)
			return;
		flatten(root.left);
		flatten(root.right);
		if (root.left != null) {
			TreeNode left = root.left;
			while (left.right != null) {
				left = left.right;
			}
			left.right=root.right;
			root.right=root.left;
			root.left=null;
		}
	}

	public static void flattens(TreeNode root) {
		Stack<TreeNode> stk = new Stack<TreeNode>();
		if (root != null) {
			stk.push(root);
		}
		while (!stk.isEmpty()) {
			TreeNode node = stk.pop();
			if (node.left != null) {
				if (node.right != null) {
					stk.push(node.right);
					node.right = node.left;
					node.left = null;
				} else { // if right is null then directly assign left to right
					node.right = node.left;
					node.left = null;
				}
				stk.push(node.right);
			} else if (node.right != null) {
				stk.push(node.right);
			} else {
				if (!stk.isEmpty()) {
					node.right = stk.pop();
					stk.push(node.right);
				}
			}
		}
	}

	public static void flat(TreeNode node, TreeNode temp) {
		if (node != null) {
			if (node.left != null) {
				if (node.right != null) {
					temp = node.right;
					node.right = node.left;
					node.left = null;
					flat(node.right, temp);
				}
			} else if (node.right != null)
				flat(node.right, temp);
			else {
				node.right = temp;
			}
		}
	}
}
