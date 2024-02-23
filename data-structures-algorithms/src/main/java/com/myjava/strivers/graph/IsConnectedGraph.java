package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class IsConnectedGraph {

	public static boolean detectCycle(int[][] list, int n) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();
		Map<Integer, Boolean> visited = new HashMap<Integer, Boolean>();

		for (int i = 0; i < list.length; i++) {
			List<Integer> connecedNodeList;
			if (map.containsKey(list[i][0])) {
				connecedNodeList = map.get(list[i][0]);

			} else {
				visited.put(list[i][0], false);
				connecedNodeList = new LinkedList<Integer>();
			}
			connecedNodeList.add(list[i][1]);
			map.put(list[i][0], connecedNodeList);
			connecedNodeList = null;
			if (map.containsKey(list[i][1])) {
				connecedNodeList = map.get(list[i][1]);

			} else {
				connecedNodeList = new LinkedList<Integer>();
				visited.put(list[i][1], false);
			}
			connecedNodeList.add(list[i][0]);
			map.put(list[i][1], connecedNodeList);
		}
		for (Map.Entry<Integer, List<Integer>> maps : map.entrySet()) {
			if (!visited.get(maps.getKey())) {
				Queue<PairWithParentVer> queue = new ArrayDeque<>();
				queue.offer(new PairWithParentVer(maps.getKey(), null));
				while (!queue.isEmpty()) {
					PairWithParentVer node = queue.poll();
					if (!visited.get(node.vertex)) {
						visited.put(node.vertex, true);
						for (int i = 0; i < map.get(node.vertex).size(); i++) {
							if (!visited.get(map.get(node.vertex).get(i)))
								queue.offer(new PairWithParentVer(map.get(node.vertex).get(i), node.vertex));
							else if (!node.parent.equals(map.get(node.vertex).get(i)))
								return true;

						}
					}
				}

			}
		}
		return false;
	}

	public static boolean detectCycle(int[][] list) {
		Map<Integer, List<Integer>> map = new HashMap<Integer, List<Integer>>();

		for (int i = 0; i < list.length; i++) {
			List<Integer> connecedNodeList;
			if (map.containsKey(list[i][0])) {
				connecedNodeList = map.get(list[i][0]);

			} else {
				connecedNodeList = new LinkedList<Integer>();
			}
			connecedNodeList.add(list[i][1]);
			map.put(list[i][0], connecedNodeList);
			connecedNodeList = null;
			if (map.containsKey(list[i][1])) {
				connecedNodeList = map.get(list[i][1]);

			} else {
				connecedNodeList = new LinkedList<Integer>();
			}
			connecedNodeList.add(list[i][0]);
			map.put(list[i][1], connecedNodeList);
		}

		for (Map.Entry<Integer, List<Integer>> maps : map.entrySet()) {
			Set<Integer> visited = new HashSet<Integer>();
			boolean[] isConnected = new boolean[] { false };
			dfs(map, maps.getKey(), visited, maps.getKey(), 0, isConnected);
			if (isConnected[0])
				return true;
		}
		return false;
	}

	public static void dfs(Map<Integer, List<Integer>> map, Integer vertex, Set<Integer> visited, Integer start,
			int level, boolean[] isConnected) {
		if (!isConnected[0]) {
			if (!visited.contains(vertex)) {
				visited.add(vertex);
				for (int i = 0; i < map.get(vertex).size(); i++) {
					if (!visited.contains(map.get(vertex).get(i))) {
						dfs(map, map.get(vertex).get(i), visited, start, level + 1, isConnected);
					} else if (start == map.get(vertex).get(i) && level > 1) {
						isConnected[0] = true;
					}
				}
			}
		}
	}
}

class PairWithParentVer {
	Integer vertex;
	Integer parent;

	public PairWithParentVer(Integer vertex, Integer parent) {
		super();
		this.vertex = vertex;
		this.parent = parent;
	}
}