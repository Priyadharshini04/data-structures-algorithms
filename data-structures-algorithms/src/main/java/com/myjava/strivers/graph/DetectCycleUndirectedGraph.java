package com.myjava.strivers.graph;

import java.util.List;

public class DetectCycleUndirectedGraph {

	public static boolean detectCycle(List<List<Integer>> list, int v) {
		for (int i = 0; i < v; i++) {
			boolean[] cycle = new boolean[1];
			depthFirstSearch(new boolean[v], list, i, i, cycle, 0);
			if (cycle[0]) {
				return true;
			}
		}
		return false;
	}

	// level plays a important role in undirected graph cyclic detection.
	public static void depthFirstSearch(boolean[] visited, List<List<Integer>> list, int v, int start, boolean[] cycle,
			int level) {
		if (!cycle[0]) {
			if (!visited[v]) {
				visited[v] = true;
				for (int i = 0; i < list.get(v).size(); i++) {
					if (!visited[list.get(v).get(i)]) {
						depthFirstSearch(visited, list, list.get(v).get(i), start, cycle, level + 1);
					} else if (start == list.get(v).get(i) && level > 1) {
						cycle[0] = true;
					}
				}
			}
		}
	}

}
