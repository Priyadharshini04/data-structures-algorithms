package com.myjava.strivers.graph.shortpath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class UGUnitWeight {

	// TC: O(V+E) SC: O(V+E)+O(V)+O(V)
	public static int[] shortestPath(int[][] edges, int des, int n) {
		List<List<Integer>> adjList = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			adjList.add(new ArrayList<>());
		}
		for (int i = 0; i < edges.length; i++) {
			if (edges[i][1] == des) {
				adjList.get(edges[i][0]).add(edges[i][1]);

			} else {
				adjList.get(edges[i][0]).add(edges[i][1]);
			}
			if (edges[i][0] == des) {
				adjList.get(edges[i][1]).add(edges[i][0]);
			} else {
				adjList.get(edges[i][1]).add(edges[i][0]);
			}
		}
		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(des);
		int[] result = new int[n];
		for (int i = 0; i < result.length; i++) {
			result[i] = -1;
		}
		result[des]=0;
		while (!queue.isEmpty()) {
			int node = queue.poll();
		
			int distance = result[node] + 1;
			for (int i = 0; i < adjList.get(node).size(); i++) {
			
				if (result[adjList.get(node).get(i)] == -1 || distance <= result[adjList.get(node).get(i)]) {
					result[adjList.get(node).get(i)] = distance;
					queue.offer(adjList.get(node).get(i));
				}
			}
		}
		return result;
	}

}

//class NodeWithDistance {
//	int val;
//	int distance = -1;
//
//	public NodeWithDistance(int val) {
//		super();
//		this.val = val;
//	}
//
//	public NodeWithDistance(int val, int distance) {
//		super();
//		this.val = val;
//		this.distance = distance;
//	}
//
//}