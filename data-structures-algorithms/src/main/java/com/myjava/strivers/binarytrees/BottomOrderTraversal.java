package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.TreeMap;
import java.util.TreeSet;

// https://www.codingninjas.com/studio/problems/bottom-view-of-binary-tree_893110?utm_source=striver
public class BottomOrderTraversal {

	public static List<Integer> bottomView(TreeNode root) {
		Map<Integer, Integer> resultMap = new TreeMap<Integer, Integer>();
		List<Integer> result = new ArrayList<Integer>();
		Queue<TreeNodeVertical> bfs = new ArrayDeque<TreeNodeVertical>();
		if (root != null) {
			bfs.offer(new TreeNodeVertical(root, 0, 0));
		}
		int xAxis = 0;
		while (!bfs.isEmpty()) {
			TreeNodeVertical tnv = bfs.poll();
			resultMap.put(tnv.yAxis, tnv.node.data);
			if (tnv.node.left != null) {
				bfs.offer(new TreeNodeVertical(tnv.node.left, xAxis, tnv.yAxis - 1));
			}
			if (tnv.node.right != null) {
				bfs.offer(new TreeNodeVertical(tnv.node.right, xAxis, tnv.yAxis + 1));
			}
			xAxis++;
		}
		for (Entry<Integer, Integer> data : resultMap.entrySet()) {
			result.add(data.getValue());
		}
		return result;
	}
}

class TreeNodeVerticalBottomView implements Comparator<TreeNodeVertical> {
	@Override
	public int compare(TreeNodeVertical o1, TreeNodeVertical o2) {
		if (o1.yAxis > o2.yAxis) {
			return 1;
		} else if (o1.yAxis < o2.yAxis) {
			return -1;
		}
		return 0;
	}

}