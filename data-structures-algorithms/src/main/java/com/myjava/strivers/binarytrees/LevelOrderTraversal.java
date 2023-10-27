package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

	public static List<Integer> levelOrderTraversal(TreeNode root) {
		List<Integer> list1 = new ArrayList<Integer>();
		Queue<TreeNode> bfsQueue = new ArrayDeque<TreeNode>();
		bfsQueue.offer(root);
		while (!bfsQueue.isEmpty()) {
			TreeNode n = bfsQueue.poll();
			if (n != null) {
				list1.add(n.data);
				if (n.left != null)
					bfsQueue.offer(n.left);
				if (n.right != null)
					bfsQueue.offer(n.right);
			}
		}
		return list1;
	}

	public static List<List<Integer>> levelOrderTraversalL_102(TreeNode root) {
		List<List<Integer>> levelOrderList = new ArrayList<List<Integer>>();
		Queue<TreeNode> bfsQueue = new ArrayDeque<TreeNode>();
		if (root != null)
			bfsQueue.offer(root);
		while (!bfsQueue.isEmpty()) {
			int level = bfsQueue.size();
			List<Integer> list1 = new ArrayList<Integer>();
			for (int i = 0; i < level; i++) {
				if (bfsQueue.peek().left != null)
					bfsQueue.offer(bfsQueue.peek().left);
				if (bfsQueue.peek().right != null)
					bfsQueue.offer(bfsQueue.peek().right);
				list1.add(bfsQueue.poll().data);
			}
			levelOrderList.add(list1);
		}
		return levelOrderList;
	}
}
