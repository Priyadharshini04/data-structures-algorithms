package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-level-order-traversal/
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

	public static List<List<Integer>> levelOrderTraversal_recursion(TreeNode root) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> bfsQueue = new ArrayDeque<TreeNode>();
		if (root != null) {
			bfsQueue.add(root);
			levelOrder(bfsQueue, result);
		}
		return result;
	}

	public static void levelOrder(Queue<TreeNode> bfs, List<List<Integer>> result) {
		if (!bfs.isEmpty()) {
			int level = bfs.size();
			List<Integer> list = new ArrayList<Integer>();
			while (level-- > 0) {
				TreeNode node = bfs.poll();
				list.add(node.data);
				if (node.left != null) {
					bfs.add(node.left);
				}
				if (node.right != null) {
					bfs.add(node.right);
				}
			}
			result.add(list);
			levelOrder(bfs, result);
		}
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
