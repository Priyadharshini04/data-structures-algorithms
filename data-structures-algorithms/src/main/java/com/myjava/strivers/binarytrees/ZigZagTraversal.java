package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
public class ZigZagTraversal {

	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> levelOrderList = new ArrayList<List<Integer>>();
		Queue<TreeNode> level = new ArrayDeque<TreeNode>();
		if (root != null) {
			level.offer(root);
		}
		int i = 0;
		while (!level.isEmpty()) {
			int levelCnt = level.size();
			List<Integer> list1 = new ArrayList<Integer>();
			while (levelCnt-- > 0) {
				TreeNode node = level.poll();
				if (node.left != null) {
					level.offer(node.left);
				}
				if (node.right != null) {
					level.offer(node.right);
				}
				if (i % 2 == 0)
					list1.add(node.data);
				else
					list1.add(0, node.data);

			}
			// Initially it was solved using stack since stack consumes extra memory
			// re-factored like this. even instead of reversing the list try to add values
			// at the front.
//			if (i % 2 != 0) {
//				Collections.reverse(list1);
//			}
			levelOrderList.add(list1);
			i++;
		}
		return levelOrderList;
	}

}
