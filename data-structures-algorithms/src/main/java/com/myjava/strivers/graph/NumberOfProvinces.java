package com.myjava.strivers.graph;

import java.util.Stack;

public class NumberOfProvinces {

	public static int findNumOfProvincesLoop(int[][] roads, int n) {
		int countProvinces = 0;
		boolean[] visited = new boolean[n];
		Stack<Integer> stk = new Stack<Integer>();
		for (int k = 0; k < n; k++) {
			if (!visited[k]) {
				stk.push(k);
				countProvinces++;
				while (!stk.isEmpty()) {
					int i = stk.pop();
					if (!visited[i]) {
						visited[i] = true;
						for (int j = 0; j < n; j++) {
							if (roads[i][j] == 1 && !visited[j]) {
								stk.push(j);
							}
						}
					}
				}
			}
		}
		return countProvinces;
	}

	public static int findNumOfProvinces(int[][] roads, int n) {
		int countProvinces[] = new int[1];
		boolean[] visited = new boolean[n];
		for (int i = 0; i < n; i++) {
			if (!visited[i]) {
				countProvinces[0] += 1;
				traversal(visited, roads, i, countProvinces,n);
			}
		}
		return countProvinces[0];
	}

	static void traversal(boolean[] visited, int[][] roads, int i, int countProvinces[],int n) {
		if (!visited[i]) {
			visited[i]=true;
			for(int j=0;j<n;j++)
			{
				if(!visited[j] && roads[i][j]==1)
				{
					traversal(visited,roads,j,countProvinces,n);
				}
			}
		}
	}

	// not works.
	public static int findNumOfProvince(int[][] roads, int n) {
		int countProvinces = 0;
		boolean[] counted = new boolean[n];
		for (int i = 0; i < roads.length; i++) {
			if (!counted[i]) {
				boolean isAlreadyCounted = false;
				int count = 0;
				for (int j = 0; j < roads[i].length; j++) {
					if (roads[i][j] == 1 && i != j) {
						if (!isAlreadyCounted && !counted[j])
							++count;
						else if (isAlreadyCounted && counted[j])
							count = 0;
						counted[j] = true;
						isAlreadyCounted = true;
					}
				}
				if (roads[i][i] == 1 && !isAlreadyCounted) {
					++countProvinces;
				} else {
					countProvinces += count >= 0 ? count : 0;
				}
			}
		}
		return countProvinces;
	}

}
