package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// https://www.codingninjas.com/studio/problems/top-view-of-binary-tree_799401
public class TopViewBinaryTree {

	public static List<Integer> getTopView(TreeNode root) {
		List<Integer> topView = new ArrayList<Integer>();
		Queue<TreeNodeVertical> levelQ = new ArrayDeque<TreeNodeVertical>();
		if (root != null) {
			levelQ.offer(new TreeNodeVertical(root, 0, 0));
			topView.add(root.data);
		}
		int leftMin = 0;
		int rightMax = 0;
		int i = 1;
		while (!levelQ.isEmpty()) {
			int level = levelQ.size();
			while (level-- > 0) {
				TreeNodeVertical tnv = levelQ.poll();
				if (tnv.yAxis < leftMin) {
					leftMin = tnv.yAxis;
					topView.add(0, tnv.node.data);
				}
				if (tnv.yAxis > rightMax) {
					rightMax = tnv.yAxis;
					topView.add(tnv.node.data);
				}
				if (tnv.node.left != null) {
					levelQ.offer(new TreeNodeVertical(tnv.node.left, i, tnv.yAxis - 1));
				}
				if (tnv.node.right != null) {
					levelQ.offer(new TreeNodeVertical(tnv.node.right, i, tnv.yAxis + 1));
				}
			}
		}
		return topView;
	}

}