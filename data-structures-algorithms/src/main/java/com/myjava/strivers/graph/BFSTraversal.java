package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {
	// TC: O(N)+O(2E for undirected graph E for directed graph) SC: O(3N)
	public static List<Integer> bfsTraversalRecursion(int n, List<List<Integer>> adj) {
		List<Integer> list = new ArrayList<Integer>();
		boolean visited[] = new boolean[n + 1];
		bfsTraversalRecursionHelper(list, visited, adj, 0);
		return list;

	}

	private static void bfsTraversalRecursionHelper(List<Integer> list, boolean[] visited, List<List<Integer>> adj,
			int node) {
		if ( !visited[node]) {
			list.add(node);
			visited[node] = true;
			for (int i = 0; adj.size() > node && i < adj.get(node).size(); i++) {
				int node2 = adj.get(node).get(i);
				if (!visited[node2]) {
					bfsTraversalRecursionHelper(list, visited, adj, node2);
				}
			}
		}
	}

	public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj) {
		List<Integer> list = new ArrayList<Integer>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		boolean visited[] = new boolean[n + 1];
		queue.add(0);
		while (!queue.isEmpty()) {
			int l = queue.poll();
			if (!visited[l]) {
				list.add(l);
				visited[l] = true;
				for (int i = 0; l < adj.size() && i < adj.get(l).size(); i++) {
					if (!visited[adj.get(l).get(i)]) {
						queue.offer(adj.get(l).get(i));
					}
				}
			}

		}
		return list;

	}

	// if connected nodes given instead of a alist
	public static List<Integer> bfsTraversals(int n, List<List<Integer>> adj) {
		List<Integer> list = new ArrayList<Integer>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		boolean visited[] = new boolean[n + 1];
		for (int i = 0; i < adj.size(); i++) {
			if (adj.get(i).size() > 0) {
				queue.add(adj.get(i).get(0));
				break;
			}
		}
		while (!queue.isEmpty()) {
			int l = queue.poll();
			if (!visited[l]) {
				list.add(l);
				visited[l] = true;
				for (int i = 0; i < adj.size(); i++) {
					if (!visited[adj.get(i).get(1)]) {
						queue.offer(adj.get(i).get(1));
					}
				}
			}

		}
		return list;
	}
}
