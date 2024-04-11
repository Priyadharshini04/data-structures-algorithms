package com.myjava.strivers.graph.shortpath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import com.myjava.strivers.graph.WeightedVertex;

public class MinimumSpanningTree {

	public static int minimumSpanningTree(ArrayList<ArrayList<Integer>> edges, int v) {
		List<List<WeightedVertex>> adjList = new ArrayList<>();
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		for (int i = 0; i < v; i++) {
			adjList.add(new ArrayList<WeightedVertex>());
			set1.add(i);
		}
		for (int i = 0; i < edges.size(); i++) {
			int vertexOne = edges.get(i).get(0);
			int vertexTwo = edges.get(i).get(1);
			int weight = edges.get(i).get(2);
			adjList.get(vertexOne).add(new WeightedVertex(vertexTwo, weight));
			adjList.get(vertexTwo).add(new WeightedVertex(vertexOne, weight));
		}
		int totalWeight = 0;
		for (int i = 0; i < v; i++) {
			if (set1.contains(i)) {
				set2.add(i);
				set1.remove(i);
				WeightedVertex wv = null;
				for (int j = 0; j < adjList.get(j).size(); j++) {
					int currWeight = adjList.get(i).get(j).getWeight();
					if ((wv == null || wv.getWeight() > currWeight)) {
						wv = adjList.get(i).get(j);
					}
				}
				totalWeight += (wv == null || !set1.contains(wv.getVal())) ? 0 : wv.getWeight();
			}
		}
		return totalWeight;
	}

}
