package com.myjava.strivers.binarysearchtrees;

import java.util.Stack;

import com.myjava.strivers.binarytrees.TreeNode;

public class KthSmallestElement_L230 {

	// Tried with inorder traversal works fine.
	static int foundVal = 0;
	static int count = 0;

	// recursive solutions took less time.
	public static int kthSmallest(TreeNode root, int k) {
		inorderTraversal(root, k);
		return foundVal;
	}

	public static int kthSmallests(TreeNode root, int k) {
		TreeNode node = root;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		int i = 0;
		while (node != null || !stk.isEmpty()) {
			if (node != null) {
				stk.push(node);
				node = node.left;
			} else {
				++i;
				if (i == k)
					return stk.pop().data;
				TreeNode temp = stk.pop();
				if (temp.right != null)
					node = temp.right;
			}
		}
		return -1;
	}

	private static void inorderTraversal(TreeNode node, int k) {
		if (node == null || count >= k) {
			return;
		}

		inorderTraversal(node.left, k);

		count++;
		if (count == k) {
			foundVal = node.data;
			return;
		}

		inorderTraversal(node.right, k);
	}
}
