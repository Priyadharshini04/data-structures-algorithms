package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codingninjas.com/studio/problems/tree-traversal_981269
public class TreeTraversals {

	public static List<List<Integer>> getTreeTraversal(TreeNode createBinaryTree) {
		List<Integer> inorder = new ArrayList<Integer>();
		List<Integer> preorder = new ArrayList<Integer>();
		List<Integer> postorder = new ArrayList<Integer>();
		inorder(createBinaryTree, inorder);
		preorder(createBinaryTree, preorder);
		postorder(createBinaryTree, postorder);

		return Arrays.asList(inorder, preorder, postorder);
	}

	private static void inorder(TreeNode treeNode, List<Integer> list) {
		if (treeNode != null) {
			inorder(treeNode.left, list);
			list.add(treeNode.data);
			inorder(treeNode.right, list);
		}
	}

	private static void preorder(TreeNode treeNode, List<Integer> list) {
		if (treeNode != null) {
			list.add(treeNode.data);
			preorder(treeNode.left, list);
			preorder(treeNode.right, list);
		}
	}

	private static void postorder(TreeNode treeNode, List<Integer> list) {
		if (treeNode != null) {
			postorder(treeNode.left, list);
			postorder(treeNode.right, list);
			list.add(treeNode.data);
		}
	}
}
