package com.myjava.strivers.binarysearchtrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import com.myjava.strivers.binarytrees.TreeNode;

public class MergeBST {

	public static List<Integer> mergeBST(TreeNode root1, TreeNode root2) {
		TreeNode node1 = root1;
		TreeNode node2 = root2;
		Stack<TreeNode> stk1 = new Stack<TreeNode>();
		Stack<TreeNode> stk2 = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		while ((node1 != null || node2 != null) || (!stk1.isEmpty()) || !stk2.isEmpty()) {
			if (node1 != null || node2 != null) {
				if (node1 != null) {
					stk1.push(node1);
					node1 = node1.left;
				}
				if (node2 != null) {
					stk2.push(node2);
					node2 = node2.left;
				}
			} else {
				TreeNode temp = null;
				if (!stk1.isEmpty()) {
					if (!stk2.isEmpty()) {
						if (stk1.peek().data < stk2.peek().data) {
							temp = stk1.pop();
							list.add(temp.data);
							if (temp.right != null) {
								node1 = temp.right;
							}
						} else {
							temp = stk2.pop();
							list.add(temp.data);
							if (temp.right != null) {
								node2 = temp.right;
							}
						}
					} else {
						temp = stk1.pop();
						list.add(temp.data);
						if (temp.right != null) {
							node1 = temp.right;
						}
					}
				} else if (!stk2.isEmpty()) {
					temp = stk2.pop();
					list.add(temp.data);
					if (temp.right != null) {
						node2 = temp.right;
					}
				}
			}

		}
		return list;
	}

}
