package com.myjava.strivers.graph;

import java.util.ArrayList;
import java.util.List;

//https://www.codingninjas.com/studio/problems/detect-cycle-in-a-directed-graph-_920545?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class DetectCycleInDirectedGraph_L210 {

	public static boolean isConnected(int v, int[][] pairs) {
		List<List<Integer>> adjList = new ArrayList<List<Integer>>();
		for (int i = 0; i < v + 1; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < pairs.length; i++) {
			adjList.get(pairs[i][0]).add(pairs[i][1]);
		}
		boolean visited[] = new boolean[v + 1];
		boolean[] isConnect = new boolean[] { false };
		for (int i = 0; i < adjList.size(); i++) {
			dfs(adjList, visited, isConnect, i, i);
			if (isConnect[0])
				return true;
		}
		return false;
	}

	public static boolean isConnecteds(int v, int[][] pairs) {
		List<List<Integer>> adjList = new ArrayList<List<Integer>>();
		for (int i = 0; i < v + 1; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < pairs.length; i++) {
			adjList.get(pairs[i][0]).add(pairs[i][1]);
		}
		for (int i = 0; i < adjList.size(); i++) {
			boolean visited[] = new boolean[v + 1];
			boolean[] isConnect = new boolean[] { false };
			dfs(adjList, visited, isConnect, i, i);
			if (isConnect[0])
				return true;
		}
		return false;
	}

	private static void dfs(List<List<Integer>> adjList, boolean[] visited, boolean[] isConnected, int vertex,
			int start) {
		if (!isConnected[0]) {
			if (!visited[vertex]) {
				visited[vertex] = true;
				for (int i = 0; i < adjList.get(vertex).size(); i++) {
					int adjVal = adjList.get(vertex).get(i);
					if (!visited[adjVal]) {
						dfs(adjList, visited, isConnected, adjVal, start);
					} else if (start == adjVal) {
						isConnected[0] = true;
						return;
					}
				}
			}
		}
	}

}
