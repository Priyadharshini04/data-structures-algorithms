package com.myjava.strivers.graph.toposort;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {

	public static List<Integer> topologicalSort(int[][] edges, int e, int v) {
		List<Integer> result = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			list.add(new ArrayList<Integer>());
		}
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				dfs(i, list, visited, stack);
			}
		}
		while (!stack.isEmpty()) {
			result.add(stack.pop());
		}
		return result;
	}

	private static void dfs(int i, List<List<Integer>> list, boolean[] visited, Stack<Integer> stack) {
		if (!visited[i]) {
			for (int j = 0; i < list.get(i).size(); j++) {
				if (!visited[list.get(i).get(j)]) {
					dfs(list.get(i).get(j), list, visited, stack);
				}
			}
			stack.push(i);
		}

	}

	public static List<Integer> topologicalSortBFS(int[][] edges, int e, int v) {
		List<Integer> result = new ArrayList<Integer>();
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[] indegrees = new int[v];
		for (int i = 0; i < v; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < edges.length; i++) {
			list.get(edges[i][0]).add(edges[i][1]);
			indegrees[edges[i][1]]++;
		}
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for (int i = 0; i < indegrees.length; i++) {
			if (indegrees[i] == 0) {
				queue.add(i);
			}
		}
		while (!queue.isEmpty()) {
			int vertex = queue.poll();
			result.add(vertex);
			for (int i = 0; i < list.get(vertex).size(); i++) {
				int currVertex = list.get(vertex).get(i);
				indegrees[currVertex]--;
				if (indegrees[currVertex] == 0) {
					queue.offer(currVertex);
				}
			}
		}
		return result;
	}

}
