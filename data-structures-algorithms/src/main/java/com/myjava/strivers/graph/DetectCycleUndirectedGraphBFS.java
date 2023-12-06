package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class DetectCycleUndirectedGraphBFS {

	public static boolean detectCycle(List<List<Integer>> list, int v) {
		Queue<PairWithParent> queue = new ArrayDeque<>();
		for (int i = 0; i < v; i++) {
			queue.offer(new PairWithParent(i, -1));
			boolean visited[] = new boolean[v];
			while (!queue.isEmpty()) {
				PairWithParent pair = queue.poll();
				visited[pair.node] = true;
				for (int k = 0; k < list.get(pair.node).size(); k++) {
					if (!visited[list.get(pair.node).get(k)]) {
						queue.offer(new PairWithParent(list.get(pair.node).get(k), pair.node));
					} else if (list.get(pair.node).get(k) != pair.parent) {
						return true;
					}
				}
			}
		}
		return false;
	}

}

class PairWithParent {
	int node;
	int parent;

	public PairWithParent(int node, int parent) {
		super();
		this.node = node;
		this.parent = parent;
	}

}