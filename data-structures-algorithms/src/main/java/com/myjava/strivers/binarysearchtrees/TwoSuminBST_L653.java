package com.myjava.strivers.binarysearchtrees;

import java.util.HashMap;

import com.myjava.strivers.binarytrees.TreeNode;

public class TwoSuminBST_L653 {
	static boolean isPresent = false;

	// TC:
	public static boolean findTarget(TreeNode root, int k) {
		isTargetPresent(root, k, new HashMap<Integer, Integer>());
		return isPresent;
	}

	public static void isTargetPresent(TreeNode node, int k, HashMap<Integer, Integer> map) {
		if (isPresent)
			return;
		if (node != null) {
			if (map.containsKey(k - node.data)) {
				isPresent = true;
				return;
			}
			map.put(node.data, map.getOrDefault(node.data, 0) + 1);
			isTargetPresent(node.left, k, map);
			isTargetPresent(node.right, k, map);
		}
	}
}
