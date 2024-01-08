package com.myjava.strivers.binarysearchtrees;

import java.util.Stack;

import com.myjava.strivers.binarytrees.TreeNode;

// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/description/
public class CreateBSTPreorder_L1008 {

	// Solve it using upper bound or maxium
	public static TreeNode bstFromPreorder(int[] preorder) {
		return formBST(Integer.MAX_VALUE, preorder, new int[] { 0 });
	}

	public static TreeNode formBST(int upperBound, int[] preorder, int[] i) {
		if (i[0] >= preorder.length || preorder[i[0]] > upperBound)
			return null;
		TreeNode root = new TreeNode(preorder[i[0]++]);
		root.left = formBST(root.data, preorder, i);
		root.right = formBST(upperBound, preorder, i);
		return root;
	}

	// TC: O(N*N) SC: O(N)+O(N)
	public static TreeNode bstFromPreorders(int[] preorder) {
		TreeNode root = null;
		Stack<TreeNode> stk1 = new Stack<>();
		Stack<TreeNode> stk2 = new Stack<>();
		for (int i = 0; i < preorder.length; i++) {
			TreeNode node = new TreeNode(preorder[i]);
			if (root == null) {
				root = node;
				stk1.push(root);
			} else {
				while (!stk1.isEmpty() && stk1.peek().data < preorder[i]) {
					stk2.push(stk1.pop());
				}
				if (!stk1.isEmpty() && stk1.peek().left == null) {
					stk1.peek().left = node;
					stk1.push(stk1.peek().left);
				} else {
					while (!stk2.isEmpty() && stk2.peek().data > preorder[i] && stk2.peek().left != null) {
						stk1.push(stk2.pop());
					}
					if (!stk2.isEmpty() && stk2.peek().data > preorder[i] && stk2.peek().left == null) {
						TreeNode node1 = stk2.pop();
						node1.left = node;
						stk2.push(node1.left);
						stk2.push(node1);
					} else if (!stk2.isEmpty() && stk2.peek().data < preorder[i] && stk2.peek().right == null) {
						stk2.peek().right = node;
						stk2.push(stk2.peek().right);
					}
				}

			}
		}
		return root;
	}

}
