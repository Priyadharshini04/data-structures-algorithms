package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/description/
public class AllNodesDistanceK_L863 {

	public static List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
		List<Integer> result = new ArrayList<Integer>();
		HashMap<TreeNode, TreeNode> map = new HashMap<TreeNode, TreeNode>();
		HashMap<TreeNode, Boolean> visited = new HashMap<TreeNode, Boolean>();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root != null) {
			queue.offer(root);
			map.put(root, null);
			visited.put(root, false);
		}
		while (!queue.isEmpty()) {
			int level = queue.size();
			while (level-- > 0) {
				TreeNode node = queue.poll();
				if (node.left != null) {
					map.put(node.left, node);
					visited.put(node.left, false);
					queue.offer(node.left);
				}
				if (node.right != null) {
					map.put(node.right, node);
					visited.put(node.right, false);
					queue.offer(node.right);
				}
			}
		}
		int i = 0;
		if (target != null)
			queue.offer(target);
		while (i <= k && !queue.isEmpty()) {
			int level = queue.size();
			while (level-- > 0) {
				TreeNode node = queue.poll();
				visited.put(node, true);
				if (i == k) {
					result.add(node.data);
				} else {
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
			}
			i++;
		}
		return result;
	}

}
