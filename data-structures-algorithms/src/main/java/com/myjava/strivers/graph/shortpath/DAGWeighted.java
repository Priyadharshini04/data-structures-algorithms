package com.myjava.strivers.graph.shortpath;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class DAGWeighted {

	// TC: O(V+E) SC: O(V+E)+O(V)+O(V)
	public static int[] shortestPathInDAG(int v, int[][] edges) {
		List<List<NodeWithDistance>> list = new ArrayList<>();
		int[] result = new int[v];
		for (int i = 0; i < v; i++) {
			list.add(new ArrayList<>());
			result[i] = -1;
		}
		for (int i = 0; i < edges.length; i++) {
			list.get(edges[i][0]).add(new NodeWithDistance(edges[i][1], edges[i][2]));
		}
		result[0] = 0;
		Stack<NodeWithDistance> topoSort = new Stack<NodeWithDistance>();
		boolean[] visited = new boolean[v];
		for (int i = 0; i < v; i++) {
			if (!visited[i]) {
				dfs(new NodeWithDistance(0, 0), visited, topoSort, list);
			}
		}
		while (!topoSort.isEmpty() && topoSort.peek().val != 0) {
			topoSort.pop();
		}
		while (!topoSort.isEmpty()) {
			NodeWithDistance vertex = topoSort.pop();
			int vertexVal = vertex.val;
			for (int i = 0; i < list.get(vertexVal).size(); i++) {
				int currDistance = result[vertexVal] + list.get(vertexVal).get(i).distance;
				if (result[list.get(vertexVal).get(i).val] == -1
						|| result[list.get(vertexVal).get(i).val] > currDistance) {
					result[list.get(vertexVal).get(i).val] = currDistance;
				}
			}

		}
		return result;
	}

	private static void dfs(NodeWithDistance vertex, boolean[] visited, Stack<NodeWithDistance> topoSort,
			List<List<NodeWithDistance>> list) {
		if (!visited[vertex.val]) {
			visited[vertex.val] = true;
			for (int i = 0; i < list.get(vertex.val).size(); i++) {
				NodeWithDistance childVertex = list.get(vertex.val).get(i);
				if (!visited[childVertex.val]) {
					dfs(childVertex, visited, topoSort, list);
				}
			}
			topoSort.push(vertex);
		}
	}

	// TC: O(V+E) SC: O(V+E)+O(V)+O(V)
	public static int[] shortestPathInDAGs(int v, int[][] edges) {
		List<List<NodeWithDistance>> list = new ArrayList<>();
		int[] result = new int[v];
		for (int i = 0; i < v; i++) {
			list.add(new ArrayList<>());
			result[i] = -1;
		}
		for (int i = 0; i < edges.length; i++) {
			list.get(edges[i][0]).add(new NodeWithDistance(edges[i][1], edges[i][2]));
		}
		result[0] = 0;
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.offer(0);
		while (!queue.isEmpty()) {
			int node = queue.poll();
			int distance = result[node];
			for (int i = 0; i < list.get(node).size(); i++) {
				NodeWithDistance childNode = list.get(node).get(i);
				int currDistance = distance + childNode.distance;
				if (result[childNode.val] == -1 || result[childNode.val] >= currDistance) {
					result[childNode.val] = currDistance;
					queue.offer(childNode.val);
				}
			}
		}
		return result;
	}

}

class NodeWithDistance {

	int val;
	int distance;

	public NodeWithDistance(int val, int distance) {
		this.val = val;
		this.distance = distance;
	}
}