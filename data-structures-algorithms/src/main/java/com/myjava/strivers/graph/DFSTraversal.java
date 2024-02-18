package com.myjava.strivers.graph;

import java.util.ArrayList;
import java.util.Stack;

public class DFSTraversal {

	public static ArrayList<Integer> dfsOfGraphRec(int v, ArrayList<ArrayList<Integer>> adj) {
		ArrayList<Integer> result = new ArrayList<>();
		boolean visited[] = new boolean[v];
		dfsOfGraphRecHelp(v, adj, result, visited, 0);
		return result;
	}

	private static void dfsOfGraphRecHelp(int v, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> result,
			boolean[] visited, int node) {
		if (!visited[node]) {
			visited[node] = true;
			result.add(node);
			for (int i = 0; node < v && i < adj.get(node).size(); i++) {
				int node2 = adj.get(node).get(i);
				if (!visited[node2]) {
					dfsOfGraphRecHelp(v, adj, result, visited, node2);
				}
			}
		}
	}

	public static ArrayList<ArrayList<Integer>> depthFirstSearch(int v, int e, ArrayList<ArrayList<Integer>> pairs) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		boolean visisted[] = new boolean[v];
		Stack<Integer> stk = new Stack<Integer>();

		ArrayList<ArrayList<Integer>> adjacents = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < v; i++) {
			adjacents.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < pairs.size(); i++) {
			int firstInd = pairs.get(i).get(0);
			int secondInd = pairs.get(i).get(1);
			adjacents.get(firstInd).add(secondInd);
			adjacents.get(secondInd).add(firstInd);
		}

		for (int i = 0; i < v; i++) {
			if (!visisted[i] && adjacents.get(i).size() > 0) {
				stk.push(i);
				ArrayList<Integer> list = new ArrayList<Integer>();
				while (!stk.isEmpty()) {
					int j = stk.pop();
					if (!visisted[j]) {
						list.add(j);
						visisted[j] = true;
						for (int k = 0; k < adjacents.get(j).size(); k++) {
							if (!visisted[adjacents.get(j).get(k)])
								stk.push(adjacents.get(j).get(k));
						}
					}
				}
				result.add(list);
			}
		}
		return result;
	}

	public static ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> pairs) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		boolean visisted[] = new boolean[v];
		Stack<Integer> stk = new Stack<Integer>();

		// If adjacents provided then no need to find adjacents here.
		ArrayList<ArrayList<Integer>> adjacents = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < v; i++) {
			adjacents.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < pairs.size(); i++) {
			int firstInd = pairs.get(i).get(0);
			int secondInd = pairs.get(i).get(1);
			adjacents.get(firstInd).add(secondInd);
			adjacents.get(secondInd).add(firstInd);
		}

		for (int i = 0; i < v; i++) {
			if (!visisted[i] && adjacents.get(i).size() > 0) {
				stk.push(i);
				while (!stk.isEmpty()) {
					int j = stk.pop();
					if (!visisted[j]) {
						result.add(j);
						visisted[j] = true;
						for (int k = adjacents.get(j).size() - 1; k >= 0; k--) {
							if (!visisted[adjacents.get(j).get(k)])
								stk.push(adjacents.get(j).get(k));
						}
					}
				}
			}
		}
		return result;
	}

}
