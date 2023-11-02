package com.myjava.strivers.binarytrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

// https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/description/
public class VerticalOrderTraversal {
	// More space complexity. TODO: Optimize the solution.
	public List<List<Integer>> verticalTraversal(TreeNode root) {
		Queue<TreeNodeVertical> set = new PriorityQueue<TreeNodeVertical>(new TreeNodeVerticalComparator());
		List<List<Integer>> verticalOrderList = new ArrayList<List<Integer>>();
		Queue<TreeNodeVertical> bfsQue = new ArrayDeque<TreeNodeVertical>();
		Queue<TreeNode> nodeQueue = new ArrayDeque<TreeNode>();
		List<Integer> list1 = new ArrayList<Integer>();
		if (root != null) {
			bfsQue.add(new TreeNodeVertical(root, 0, 0));
			nodeQueue.add(root);
		}
		int xAxis = 1;
		while (!bfsQue.isEmpty()) {
			int level = bfsQue.size();
			while (level-- > 0) {
				TreeNodeVertical treeNodeVertical = bfsQue.poll();
				TreeNode node = nodeQueue.poll();
				set.add(treeNodeVertical);
				if (node.left != null) {
					bfsQue.offer(new TreeNodeVertical(node.left, xAxis, treeNodeVertical.yAxis - 1));
					nodeQueue.offer(node.left);
				}
				if (node.right != null) {
					bfsQue.offer(new TreeNodeVertical(node.right, xAxis, treeNodeVertical.yAxis + 1));
					nodeQueue.offer(node.right);
				}
			}
			++xAxis;
		}
		Integer lastYAxis = null;
		while (!set.isEmpty()) {
			int yAxis = set.peek().yAxis;
			if (lastYAxis != null && yAxis != lastYAxis) {
				verticalOrderList.add(list1);
				list1 = new ArrayList<Integer>();
			}
			list1.add(set.poll().node.data);
			lastYAxis = yAxis;
		}
		verticalOrderList.add(list1);
		return verticalOrderList;
	}
}
class TreeNodeVertical {
	public TreeNodeVertical(TreeNode node, int xAxis, int yAxis) {
		super();
		this.node = node;
		this.xAxis = xAxis;
		this.yAxis = yAxis;
	}

	TreeNode node;
	int xAxis;
	int yAxis;
}

class TreeNodeVerticalComparator implements Comparator<TreeNodeVertical> {

	@Override
	public int compare(TreeNodeVertical o1, TreeNodeVertical o2) {
		if (o1.yAxis - o2.yAxis == 0) {
			if (o1.xAxis - o2.xAxis == 0) {
				if (o1.node.data > o2.node.data) {
					return 1;
				} else if (o1.node.data < o2.node.data) {
					return -1;
				}
				return 0;
			} else if (o1.xAxis > o2.xAxis) {
				return 1;
			}
			return -1;
		} else if (o1.yAxis > o2.yAxis) {
			return 1;
		}
		return -1;
	}

}
// -1 less
//0 equal
//1 greater
