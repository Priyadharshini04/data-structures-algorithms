package com.myjava.strivers.binarysearchtrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

import com.myjava.strivers.binarytrees.TreeNode;

public class PredecessorSuccessor {

	// TC: O(h)+O(h) SC: O(1)
	public static List<Integer> predecessorSuccessor(TreeNode root, int key) {
		int successsor = -1;
		TreeNode node = root;
		while (node != null) {
			if (node.data <= key) {
				node = node.right;
			} else {
				if (node.data > key)
					successsor = node.data;
				node = node.left;
			}
		}

		int predecessor = -1;
		node = root;
		while (node != null) {
			if (node.data >= key) {
				node = node.left;
			} else {
				if (node.data < key)
					predecessor = node.data;
				node = node.right;
			}
		}
		return Arrays.asList(predecessor, successsor);
	}

	// Don't try to find with one always divide the problem and try to solve it.
	public static List<Integer> predecessorSuccessors(TreeNode root, int key) {
		List<Integer> list = new ArrayList<Integer>();
		if (root.data == key) {
			return Arrays.asList(-1, root.right != null ? root.right.data : -1);
		}
		TreeNode node = root;
		Stack<TreeNode> prev = new Stack<TreeNode>();
		while (node != null) {
			if (node.data == key) {
				break;
			}
			prev.push(node);
			if (node.data > key) {
				node = node.left;
			} else {
				node = node.right;
			}
		}
		if (node != null) {
			if (node.left != null) {
				list.add(node.left.data);
			} else {
				list.add(-1);
			}
			if (node.right != null) {
				list.add(node.right.data);
			} else {
				if (!prev.isEmpty()) {
					list.add(prev.pop().data);
				} else {
					list.add(-1);
				}
			}
		} else {
			if (!prev.isEmpty() && prev.peek().data < key) {
				TreeNode min = prev.pop();
				list.add(min.data);
				if (min.right != null) {
					list.add(min.right.data);
				} else if (!prev.isEmpty() && prev.peek().data > key) {
					list.add(prev.pop().data);
				} else {
					list.add(-1);
				}
			} else {
				if (!prev.isEmpty() && prev.peek().data > key) {
					list.add(-1);
					list.add(prev.peek().data);
				}
			}
		}
		return list;
	}
}
