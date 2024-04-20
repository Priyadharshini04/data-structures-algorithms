package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

//https://leetcode.com/problems/recover-binary-search-tree/description/
public class RecoverBST_L99 {

	public static TreeNode recover(TreeNode root) {
		checkValidBSTandSwap(root, root, null, null, new boolean[] { false });
		return root;
	}

	public static TreeNode checkValidBSTandSwap(TreeNode root, TreeNode node, TreeNode min, TreeNode max,
			boolean[] isSwapped) {
		return null;
	}

	// Won't work.
	public static TreeNode checkValidBSTandSwaps(TreeNode root, TreeNode node, TreeNode min, TreeNode max,
			boolean[] isSwapped) {
		if (node == null) {
			return null;
		}
		if (min != null && node.data < min.data) {
			return node;
		}
		if (max != null && node.data > max.data) {
			return node;
		}
		TreeNode leftNode = checkValidBSTandSwap(root, node.left, min, node, isSwapped);
		TreeNode rightNode = checkValidBSTandSwap(root, node.right, node, max, isSwapped);
		if (leftNode != null && rightNode != null) {
			int temp = leftNode.data;
			leftNode.data = rightNode.data;
			rightNode.data = temp;
			isSwapped[0] = true;
		} else if (leftNode != null) {
			if (!isValid(node.data, leftNode.data, node.right != null ? node.right.data : Integer.MAX_VALUE)) {
				int temp = node.data;
				node.data = leftNode.data;
				leftNode.data = temp;
				isSwapped[0] = true;
			} else {
				return leftNode;
			}
		} else if (rightNode != null) {
			if (!isValid(node.data, node.left != null ? node.left.data : Integer.MIN_VALUE, rightNode.data)) {
				int temp = node.data;
				node.data = rightNode.data;
				rightNode.data = temp;
				isSwapped[0] = true;
			} else {
				return rightNode;
			}
		}
		return null;
	}

	public static boolean isValid(int a, int min, int max) {
		if (a < min) {
			return false;
		}
		if (a > max) {
			return false;
		}
		return true;
	}
}
