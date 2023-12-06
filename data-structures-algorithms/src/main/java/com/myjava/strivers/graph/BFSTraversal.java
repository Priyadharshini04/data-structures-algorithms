package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BFSTraversal {

	public static List<Integer> bfsTraversal(int n, List<List<Integer>> adj) {
		List<Integer> list = new ArrayList<Integer>();
		Queue<Integer> queue = new ArrayDeque<Integer>();
		boolean visited[] = new boolean[n+1];
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
