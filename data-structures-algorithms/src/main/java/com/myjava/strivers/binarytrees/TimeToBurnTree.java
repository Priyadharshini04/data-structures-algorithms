package com.myjava.strivers.binarytrees;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

// https://www.codingninjas.com/studio/problems/time-to-burn-tree_1469067
public class TimeToBurnTree {

	public static int timeToBurnTree(TreeNode root, int start) {
		int timeToBurn = 0;
		HashMap<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
		HashMap<TreeNode, Boolean> visited = new HashMap<TreeNode, Boolean>();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		TreeNode startNode = null;
		if (root != null) {
			queue.offer(root);
			map.put(root, null);
			visited.put(root, false);
		}
		while (!queue.isEmpty()) {
			int level = queue.size();
			while (level-- > 0) {
				TreeNode node = queue.poll();
				if (node.data == start) {
					startNode = node;
				}
				if (node.left != null) {
					queue.offer(node.left);
					map.put(node.left, node);
					visited.put(node.left, false);
				}
				if (node.right != null) {
					queue.offer(node.right);
					map.put(node.right, node);
					visited.put(node.right, false);
				}
			}
		}
		if (startNode != null) {
			queue.offer(startNode);
		}
		while (!queue.isEmpty()) {
			int level = queue.size();
			while (level-- > 0) {
				TreeNode node = queue.poll();
				visited.put(node, true);
				if (map.get(node) != null && !visited.get(map.get(node))) {
					queue.offer(map.get(node));
				}
				if (node.left != null && !visited.get(node.left)) {
					queue.offer(node.left);
				}
				if (node.right != null && !visited.get(node.right)) {
					queue.offer(node.right);
				}
			}
			++timeToBurn;
		}
		return timeToBurn>0?timeToBurn-1:0;
	}

}
