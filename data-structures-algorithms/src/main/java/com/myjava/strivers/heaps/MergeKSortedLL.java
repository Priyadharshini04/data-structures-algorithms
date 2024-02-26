package com.myjava.strivers.heaps;

import java.util.Comparator;
import java.util.PriorityQueue;

import com.myjava.strivers.linkedlist.Node;

// https://leetcode.com/problems/merge-k-sorted-lists/
public class MergeKSortedLL {

	public static Node mergeKLists(Node[] list) {
		Node resultHead = null;
//		Comparator<TreeNode> comparator = new Comparator<TreeNode>() {
//
//			@Override
//			public int compare(TreeNode o1, TreeNode o2) {
//				return o1.data - o2.data;
//			}
//		};
		PriorityQueue<Node> pq1 = new PriorityQueue<Node>((a, b) -> a.data - b.data);
		for (int i = 0; i < list.length; i++) {
			Node head = list[i];
			while (head != null) {
				pq1.offer(head);
				head = head.next;
			}
		}
		Node tailNode = null;
		while (!pq1.isEmpty()) {
			if (resultHead == null) {
				resultHead = new Node(pq1.poll().data);
				tailNode = resultHead;
			} else {
				Node temp = new Node(pq1.poll().data);
				tailNode.next = temp;
				tailNode = temp;
			}
		}
		return resultHead;
	}
}
