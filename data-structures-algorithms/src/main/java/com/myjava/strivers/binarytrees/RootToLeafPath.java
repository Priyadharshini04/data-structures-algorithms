package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// https://www.codingninjas.com/studio/problems/all-root-to-leaf-paths-in-binary-tree._983599
public class RootToLeafPath {
	static List<Integer> sb = new ArrayList<Integer>();

	public static List<String> allRootToLeaf(TreeNode root) {
		List<String> list = new ArrayList<String>();

		if (root == null) {
			return list;
		}
		if (isLeaf(root)) {
			list.add(String.valueOf(root.data));
			return list;
		}

		// allRootToLeaf(list, root);
		return allRootToLeafs(root);
	}

	public static void allRootToLeaf(List<String> list, TreeNode node) {
		if (node != null) {
			sb.add(node.data);
			if (isLeaf(node)) {
				StringBuilder sb1 = new StringBuilder();
				for (int i = 0; i < sb.size(); i++) {
					sb1.append(sb.get(i) + " ");
				}
				list.add(String.valueOf(sb1));
				if (sb.size() > 1)
					sb.remove(sb.size() - 1);
			} else {
				allRootToLeaf(list, node.left);
				allRootToLeaf(list, node.right);
				if (sb.size() > 1)
					sb.remove(sb.size() - 1);
			}
		}
	}

	public static boolean isLeaf(TreeNode node) {
		if (node != null && node.left == null && node.right == null) {
			return true;
		}
		return false;
	}

	public static List<String> allRootToLeafs(TreeNode root) {
		List<String> result = new ArrayList<String>();
		TreeNode node = root;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		List<Integer> list = new ArrayList<Integer>();
		while (node != null || !stk.isEmpty()) {
			if (node != null) {
				list.add(node.data);
				stk.push(node);
				node = node.left;
			} else {
				TreeNode temp = stk.peek();
				if (temp.right != null) {
					node = temp.right;
				} else {
					temp = stk.pop();
					if (isLeaf(temp)) {
						StringBuilder sb = new StringBuilder();
						for (int i = 0; i < list.size(); i++) {
							sb.append(list.get(i) + " ");
						}
						result.add(String.valueOf(sb));
					}
					if (list.size() > 0)
						list.remove(list.size() - 1);
					while (!stk.isEmpty() && temp == stk.peek().right) {
						temp = stk.pop();
						if (list.size() > 0)
							list.remove(list.size() - 1);
					}
				}
			}
		}
		return result;
	}

}
