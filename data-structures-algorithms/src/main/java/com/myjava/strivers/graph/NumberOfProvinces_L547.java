package com.myjava.strivers.graph;

import java.util.ArrayList;
import java.util.Stack;

public class NumberOfProvinces_L547 {
	// Less time complexity without adjacent list.
	public static int findCircleNum(int[][] isConnected) {
		int v = isConnected.length;
		boolean visit[] = new boolean[v];
		int provinces = 0;

		for (int i = 0; i < v; i++) {
			if (!visit[i]) {
				provinces++;
				DFS(isConnected, visit, i);
			}
		}
		return provinces;
	}

	public static void DFS(int[][] isConnected, boolean visit[], int node) {
		visit[node] = true;

		for (int neighbour = 0; neighbour < isConnected.length; neighbour++) {
			if (isConnected[node][neighbour] == 1 && !visit[neighbour]) {
				DFS(isConnected, visit, neighbour);
			}
		}
	}

	public static int findCircleNums(int[][] isConnected) {
		int count = 0;
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		boolean visited[] = new boolean[isConnected.length];
		Stack<Integer> stk = new Stack<Integer>();

		for (int i = 0; i < isConnected.length; i++) {
			list.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < isConnected.length; i++) {
			for (int j = 0; j < isConnected[i].length; j++) {
				if (isConnected[i][j] == 1 && i != j) {
					list.get(i).add(j);
				}
			}
		}
		for (int i = 0; i < isConnected.length; i++) {
			if (!visited[i]) {
				stk.push(i);
				count++;
				while (!stk.isEmpty()) {
					int j = stk.pop();
					if (!visited[j]) {
						visited[j] = true;
						for (int k = 0; k < list.get(j).size(); k++) {
							if (!visited[list.get(j).get(k)]) {
								stk.push(list.get(j).get(k));
							}
						}
					}
				}
			}
		}
		return count;
	}
}
