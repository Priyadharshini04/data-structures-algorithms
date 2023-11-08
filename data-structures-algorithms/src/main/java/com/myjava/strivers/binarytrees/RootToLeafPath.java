package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.codingninjas.com/studio/problems/all-root-to-leaf-paths-in-binary-tree._983599
public class RootToLeafPath {

	public static List<String> allRootToLeaf(TreeNode root) {
		StringBuilder sb = new StringBuilder();
		List<String> list = new ArrayList<String>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = root;
		while (node != null || !stack.isEmpty()) {
			while (node != null) {
				sb.append(node.data + " ");
				stack.push(node);
				node = node.left;
			}
			TreeNode temp = stack.peek();
			if (temp.right == null) {
				if (sb.length() > 0)
					list.add(sb.toString());
				temp = stack.pop();
				sb = new StringBuilder(sb.substring(0, sb.length() - 2));
				while (!stack.isEmpty() && temp == stack.peek().right) {
					sb = new StringBuilder(sb.substring(0, sb.length() - 2));
					temp = stack.pop();
				}
			} else {
				node = temp.right;
			}
		}
		return list;
	}

}
