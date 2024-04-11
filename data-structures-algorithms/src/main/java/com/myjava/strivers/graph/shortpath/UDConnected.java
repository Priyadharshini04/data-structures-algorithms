package com.myjava.strivers.graph.shortpath;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

import com.myjava.strivers.graph.WeightedVertex;

//https://www.naukri.com/code360/problems/dijkstra's-shortest-path_985358?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class UDConnected {
	public static List<Integer> dijkstra(int[][] edge, int vertices, int edges, int source) {
		List<Integer> result = new ArrayList<Integer>();
		List<List<WeightedVertex>> adjList = new ArrayList<>();
		int[] parent = new int[vertices];
		int[] weight = new int[vertices];

		for (int i = 0; i < vertices; i++) {
			adjList.add(new ArrayList<WeightedVertex>());
			weight[i] = -1;
			result.add(-1);
		}
		for (int i = 0; i < edge.length; i++) {
			adjList.get(edge[i][0]).add(new WeightedVertex(edge[i][1], edge[i][2]));
			adjList.get(edge[i][1]).add(new WeightedVertex(edge[i][0], edge[i][2]));

		}

		PriorityQueue<WeightedVertex> pq = new PriorityQueue<WeightedVertex>((a, b) -> a.getWeight() - b.getWeight());
		WeightedVertex wpp = new WeightedVertex(source, 0);
		pq.add(wpp);
		weight[source] = 0;
		parent[source] = source;
		result.set(source, 0);

		while (!pq.isEmpty()) {
			wpp = pq.poll();
			for (int i = 0; i < adjList.get(wpp.getVal()).size(); i++) {
				WeightedVertex wv = adjList.get(wpp.getVal()).get(i);
				if (weight[wv.getVal()] == -1 || weight[wv.getVal()] > wv.getWeight() + wpp.getWeight()) {
					pq.offer(new WeightedVertex(wv.getVal(), wv.getWeight() + wpp.getWeight()));
					weight[wv.getVal()] = wv.getWeight() + wpp.getWeight();
					parent[wv.getVal()] = wpp.getVal();
				}
			}
		}
		for (int i = 0; i < vertices; i++) {
			if (source == i)
				continue;
			result.set(i, weight[i]);
		}
		return result;
	}
}