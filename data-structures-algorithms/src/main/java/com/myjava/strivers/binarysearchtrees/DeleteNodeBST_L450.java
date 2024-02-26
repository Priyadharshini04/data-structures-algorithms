package com.myjava.strivers.binarysearchtrees;

import com.myjava.strivers.binarytrees.TreeNode;

//https://leetcode.com/problems/delete-node-in-a-bst/description/
public class DeleteNodeBST_L450 {
	public static TreeNode deleteNode(TreeNode root, int key) {
		TreeNode node = root;
		TreeNode parent = null;
		boolean isLeft = true;
		while (node != null) {
			if (node.data == key)
				break;
			else if (node.data < key) {
				isLeft = false;
				parent = node;
				node = node.right;
			} else {
				isLeft = true;
				parent = node;
				node = node.left;
			}
		}
		if (node == null)
			return root;
		if (node.left == null && node.right == null) {
			if (parent == null)
				return null;
			else if (isLeft)
				parent.left = null;
			else
				parent.right = null;
			return root;
		} else if (node.left != null) {
			TreeNode node1 = null;
			if (parent == null) {
				root = root.left;
				node1 = root;
			} else {
				if (isLeft) {
					parent.left = node.left;
					node1 = node.left;

				} else {
					parent.right = node.left;
					node1 = node.left;
				}
			}
			while (node1 != null && node1.right != null) {
				node1 = node1.right;
			}
			node1.right = node.right;
		} else {
			if (parent == null) {
				root = root.right;
			} else {
				if (isLeft) {
					parent.left = node.right;
				} else {
					parent.right = node.right;
				}
			}
		}
		return root;
	}

	public static TreeNode deleteNodes(TreeNode root, int key) {
		TreeNode node = root;
		TreeNode parent = root;
		// finding the node for the given key.
		while (node != null) {
			if (node.data == key)
				break;

			parent = node;
			if (node.data < key) {
				node = node.right;
			} else {
				node = node.left;
			}
		}
		if (node == null)
			return root;
		// if leaf node then directly delete it.
		if (node.right == null && node.left == null) {
			if (root == node)
				return null;
			else if (node.data < parent.data)
				parent.left = null;
			else
				parent.right = null;
		}
		// 1.assign left or right of the founded node to the parent node based on null
		// check
		// 2.edge case if founded node itself is a root node then assign root with left
		// or
		// right
		// 3. if left and right both are available then replace left to the founded node
		// place and link right to the right most of new node.
		// 4. point 3 will work for right as well but in the vice versa way
		else {
			if (node.left == null) {
				if (node == root)
					root = root.right;
				else if (node.data < parent.data)
					parent.left = node.right;
				else
					parent.right = node.right;
			} else if (node.right == null) {
				if (node == root)
					root = root.left;
				else if (node.data < parent.data)
					parent.left = node.left;
				else
					parent.right = node.left;
			} else {
				TreeNode temp = node.left;
				if (node == root) {
					root = root.left;
					temp = root;
				} else if (node.data < parent.data) {
					parent.left = node.left;
					temp = parent.left;
				} else {
					parent.right = node.left;
					temp = parent.right;
				}
				while (temp != null && temp.right != null) {
					temp = temp.right;
				}
				temp.right = node.right;
			}
		}

		return root;

	}
}
