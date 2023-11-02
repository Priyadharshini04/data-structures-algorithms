package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-right-side-view/
public class RightViewBinaryTree {

	public static List<Integer> rightSideView(TreeNode root) {
		List<Integer> results = new ArrayList<Integer>();
		Queue<TreeNode> bfs = new ArrayDeque<TreeNode>();
		if (root != null) {
			bfs.offer(root);
		}
		while (!bfs.isEmpty()) {
			TreeNode n = null;
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
			results.add(n.data);
		}
		return results;
	}

}
