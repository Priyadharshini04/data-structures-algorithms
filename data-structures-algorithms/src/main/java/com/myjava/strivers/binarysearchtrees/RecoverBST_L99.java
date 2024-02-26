package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

//https://leetcode.com/problems/recover-binary-search-tree/description/
public class RecoverBST_L99 {

	public static TreeNode recover(TreeNode root) {
		checkValidBSTandSwap(root, root, null, null);
		return root;
	}

	public static void checkValidBSTandSwap(TreeNode root, TreeNode node, TreeNode leftMax, TreeNode rightMin) {
		if (node == null) {
			return;
		}

		if (leftMax != null && node.data > leftMax.data) {
			int temp = node.data;
			node.data = leftMax.data;
			leftMax.data = temp;
			checkValidBSTandSwap(root, leftMax.right, null, leftMax);
		}
		if (rightMin != null && node.data < rightMin.data) {
			int temp = node.data;
			node.data = rightMin.data;
			rightMin.data = temp;
			checkValidBSTandSwap(root, rightMin.left, rightMin, null);
		}
		checkValidBSTandSwap(root, node.left, node, rightMin);
		checkValidBSTandSwap(root, node.right, leftMax, node);
	}
}
