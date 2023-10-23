package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://www.codingninjas.com/studio/problems/tree-traversal_981269
public class TreeTraversals {

	public static List<List<Integer>> getTreeTraversal(Node createBinaryTree) {
		List<Integer> inorder = new ArrayList<Integer>();
		List<Integer> preorder = new ArrayList<Integer>();
		List<Integer> postorder = new ArrayList<Integer>();
		inorder(createBinaryTree, inorder);
		preorder(createBinaryTree, preorder);
		postorder(createBinaryTree, postorder);

		return Arrays.asList(inorder, preorder, postorder);
	}

	private static void inorder(Node node, List<Integer> list) {
		if (node != null) {
			inorder(node.left, list);
			list.add(node.data);
			inorder(node.right, list);
		}
	}

	private static void preorder(Node node, List<Integer> list) {
		if (node != null) {
			list.add(node.data);
			preorder(node.left, list);
			preorder(node.right, list);
		}
	}

	private static void postorder(Node node, List<Integer> list) {
		if (node != null) {
			postorder(node.left, list);
			postorder(node.right, list);
			list.add(node.data);
		}
	}
}
