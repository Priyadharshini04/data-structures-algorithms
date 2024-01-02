package com.myjava.strivers.binarysearchtrees;

import java.util.ArrayList;
import java.util.List;

import com.myjava.strivers.binarytrees.TreeNode;

// https://leetcode.com/problems/validate-binary-search-tree/description/
public class BinaryTreeOrBinarySearchTree_L98 {

	// Min time complexity O(n) SC: O(n)
	public static boolean isValidBST(TreeNode root) {
		return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private static boolean helper(TreeNode root, long leftVal, long rightVal) {
		if (root == null)
			return true;

		if (root.data >= rightVal || root.data <= leftVal)
			return false;

		return helper(root.left, leftVal, root.data) && helper(root.right, root.data, rightVal);
	}

	// TC O(n)+O(n) SC O(n)+O(n)
	public static boolean isValidBSTs(TreeNode root) {
		List<Integer> list = new ArrayList<Integer>();
		isValidBSTs(root, list);
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) > list.get(i + 1)) {
				return false;
			}
		}
		return true;
	}

	public static void isValidBSTs(TreeNode node, List<Integer> list) {
		if (node != null) {
			isValidBSTs(node.left, list);
			list.add(node.data);
			isValidBSTs(node.right, list);
		}
	}
}
