package com.myjava.strivers.binarysearchtrees;

import java.util.Stack;

import com.myjava.strivers.binarytrees.TreeNode;

// https://leetcode.com/problems/binary-search-tree-iterator/
public class BinarySearchTreeIterator_L173 {
	TreeNode node;
	Stack<TreeNode> stack;

	// SC: O(h)
	BinarySearchTreeIterator_L173(TreeNode root) {
		node = root;
		stack = new Stack<TreeNode>();
		while (node != null) {
			stack.push(node);
			node = node.left;
		}
	}

	// TC: O(h)
	public int next() {
		TreeNode temp = null;
		if (!stack.isEmpty()) {
			temp = stack.pop();
			if (temp.right != null) {
				node = temp.right;
				while (node != null) {
					stack.push(node);
					node = node.left;
				}
			}
		}
		return temp != null ? temp.data : -1;
	}
	// TC: O(1)
	public boolean hasNext() {
		return !stack.isEmpty();
	}

}
