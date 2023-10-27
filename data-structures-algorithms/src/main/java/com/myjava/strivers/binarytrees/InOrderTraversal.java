package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class InOrderTraversal {

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> inOrderList = new ArrayList<Integer>();
		inOrderTraverse(root, inOrderList);
		return inOrderList;
	}

	public static List<Integer> inorderTraversalLoop(TreeNode root) {
		List<Integer> inOrderList = new ArrayList<Integer>();
		Stack<TreeNode> stk = new Stack<TreeNode>();
		TreeNode node = root;
		while (true) {
			if (node != null) {
				stk.push(node);
				node = node.left;
			} else {
				if (stk.isEmpty()) {
					break;
				}
				node = stk.pop();
				inOrderList.add(node.data);
				node = node.right;
			}
		}
		return inOrderList;
	}

	public static void inOrderTraverse(TreeNode node, List<Integer> list) {
		if (node != null) {
			inOrderTraverse(node.left, list);
			list.add(node.data);
			inOrderTraverse(node.right, list);
		}
	}
}
