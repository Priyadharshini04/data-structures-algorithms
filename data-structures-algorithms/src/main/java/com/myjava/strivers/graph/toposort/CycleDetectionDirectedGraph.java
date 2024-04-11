package com.myjava.strivers.graph.toposort;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public class CycleDetectionDirectedGraph {

	public static boolean detectCycleInDirectedGraph(List<List<Integer>> adjList, int n) {
		int[] degrees = new int[n + 1];
		//boolean[] visited = new boolean[n + 1];
		for (int i = 0; i < adjList.size(); i++) {
			for (int j = 0; j < adjList.get(i).size(); j++) {
				degrees[adjList.get(i).get(j)]++;
			}
		}
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for (int i = 0; i < degrees.length; i++) {
			if (degrees[i] == 0) {
				queue.offer(i);
			}
		}
		int count = 0;
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			if (vertex<adjList.size()) {
				count++;
				for (int i = 0; i < adjList.get(vertex).size(); i++) {
					int currVertex = adjList.get(vertex).get(i);
					degrees[currVertex]--;
					if (degrees[currVertex] == 0 ) {
						queue.offer(currVertex);
					}
				}
			}
		}
		return count != adjList.size();
	}

}
