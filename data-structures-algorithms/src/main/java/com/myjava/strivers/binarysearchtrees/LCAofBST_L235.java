package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

// https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/description/
public class LCAofBST_L235 {

	// Finding LCA using max and min of BST.
	public static TreeNode lowestCommonAncestor(TreeNode node, TreeNode p, TreeNode q) {
		int max = Math.max(p.data, q.data);
		int min = Math.min(p.data, q.data);
		while (node != null) {
			if (node.data > max) {
				return lowestCommonAncestor(node.left, p, q);
			} else if (node.data < min) {
				return lowestCommonAncestor(node.right, p, q);
			} else
				return node;
		}
		return null;
	}

	// Finding LCA using preorder of BT.
	public static TreeNode lowestCommonAncestors(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null) {
			return null;
		}
		if ((root != null && (root == p || root == q))) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left != null && right != null)
			return root;
		else if (left != null)
			return left;
		else
			return right;
	}

}
