package com.myjava.strivers.binarytrees;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
public class CraeteBTFromPostOrderInOrder_L106 {

	public static TreeNode buildTree(int[] postOrder, int[] inOrder) {
		Map<Integer, Integer> imap = new HashMap<Integer, Integer>();

		for (int i = 0; i < inOrder.length; i++) {
			imap.put(inOrder[i], i);
		}
		return getSubTree(inOrder, postOrder, 0, inOrder.length - 1, 0, postOrder.length - 1, imap);
	}

	public static TreeNode getSubTree(int[] inOrder, int[] postOrder, int inStart, int inEnd, int postStart,
			int postEnd, Map<Integer, Integer> imap) {
		if (inStart > inEnd || postStart > postEnd) {
			return null;
		}
		TreeNode root = new TreeNode(postOrder[postEnd]);
		int inRoot = imap.get(postOrder[postEnd]);
		int leftSub = inRoot - inStart;
		root.left = getSubTree(inOrder, postOrder, inStart, inRoot - 1, postStart, postStart + leftSub - 1, imap);
		root.right = getSubTree(inOrder, postOrder, inRoot + 1, inEnd, postStart + leftSub, postEnd - 1, imap);
		return root;
	}
}
