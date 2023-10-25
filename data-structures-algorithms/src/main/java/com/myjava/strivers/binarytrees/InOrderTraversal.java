package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class InOrderTraversal {

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> inOrderList = new ArrayList<Integer>();
		inOrderTraverse(root, inOrderList);
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
