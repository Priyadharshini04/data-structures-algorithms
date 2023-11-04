package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://leetcode.com/problems/binary-tree-inorder-traversal/description/
public class InOrderTraversal {

	public static List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> inOrderList = new ArrayList<Integer>();
		inOrderTraverse(root, inOrderList);
		return inOrderList;
	}

	public static List<Integer> inorderTraversalLoop(TreeNode root) {
		List<Integer> inOrderList = new ArrayList<Integer>();
		TreeNode node=root;
		Stack<TreeNode> stack=new Stack<>();
		while(node!=null || !stack.isEmpty())
		{
			// traverse till left most node
			while(node!=null)
			{
				stack.push(node);
				node=node.left;
			}
			TreeNode lastNode=stack.pop();
			inOrderList.add(lastNode.data);
			node=lastNode.right;
		}
		return inOrderList;
	}

	public static void inOrderTraverse(TreeNode node, List<Integer> list) {
		if (node != null) {
			inOrderTraverse(node.left, list);
			list.add(node.data);
			inOrderTraverse(node.right, list);
		}
	}
}
