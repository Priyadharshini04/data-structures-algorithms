package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
// https://www.codingninjas.com/studio/problems/left-view-of-binary-tree_625707
public class LeftViewBinaryTree {
	public static void printLeftView(TreeNode root) {
		List<Integer> results = new ArrayList<Integer>();
		Queue<TreeNode> bfs = new ArrayDeque<TreeNode>();
		if (root != null) {
			bfs.offer(root);
		}
		while (!bfs.isEmpty()) {
			TreeNode n = bfs.peek();
			System.out.print(n.data + " ");
			int level = bfs.size();
			while (level-- > 0) {
				n = bfs.poll();
				if (n.left != null) {
					bfs.offer(n.left);
				}
				if (n.right != null) {
					bfs.add(n.right);
				}
			}
		}
	}
}
