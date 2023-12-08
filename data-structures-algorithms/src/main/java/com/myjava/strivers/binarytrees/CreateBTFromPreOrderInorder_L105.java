package com.myjava.strivers.binarytrees;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

// https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/description/
public class CreateBTFromPreOrderInorder_L105 {
	// Optimized.
	private int i = 0;
	private int p = 0;

	public TreeNode buildTreeOptimized(int[] preorder, int[] inorder) {
		return build(preorder, inorder, Integer.MIN_VALUE);
	}

	private TreeNode build(int[] preorder, int[] inorder, int stop) {
		if (p >= preorder.length) {
			return null;
		}
		if (inorder[i] == stop) {
			++i;
			return null;
		}

		TreeNode node = new TreeNode(preorder[p++]);
		node.left = build(preorder, inorder, node.data);
		node.right = build(preorder, inorder, stop);
		return node;
	}

	// Better solution but not optimized.
	public static TreeNode buildTree(int[] preOrder, int[] inOrder) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < inOrder.length; i++) {
			map.put(inOrder[i], i);
		}
		TreeNode root = buildSubTree(preOrder, inOrder, 0, preOrder.length - 1, 0, inOrder.length - 1, map);
		return root;
	}

	public static TreeNode buildSubTree(int[] preOrder, int[] inOrder, int preOrderStart, int preOrderEnd,
			int inOrderStart, int inOrderEnd, Map<Integer, Integer> map) {
		if (preOrderStart > preOrderEnd || inOrderStart > inOrderEnd) {
			return null;
		}
		TreeNode root = new TreeNode(preOrder[preOrderStart]);
		int inRoot = map.get(root.data);
		int leftSub = inRoot - inOrderStart;
		root.left = buildSubTree(preOrder, inOrder, preOrderStart + 1, preOrderStart + leftSub, inOrderStart,
				inRoot - 1, map);
		root.right = buildSubTree(preOrder, inOrder, preOrderStart + leftSub + 1, preOrderEnd, inRoot + 1, inOrderEnd,
				map);
		return root;
	}

	// Not works.
	public static TreeNode buildTrees(int[] preOrder, int[] inOrder) {
		TreeNode root = null;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		if (preOrder.length > 0) {
			root = new TreeNode(preOrder[0]);
			stk.push(root);
		}
		int p = 1, i = 0;
		while (p < preOrder.length && i < inOrder.length && !stk.isEmpty()) {
			if (stk.peek().data != inOrder[i]) {
				if (stk.peek().left == null) {
					stk.peek().left = new TreeNode(preOrder[p++]);
					stk.push(stk.peek().left);
				} else if (stk.peek().right == null) {
					stk.peek().right = new TreeNode(preOrder[p++]);
					stk.push(stk.peek().right);
				} else {
					stk.pop();
					i++;
				}
			} else {
				if ((stk.peek().left == null && stk.peek().right == null)
						|| (stk.peek().left != null && stk.peek().right != null)) {
					stk.pop();
				}
				i++;
			}
		}
		return root;
	}

}
