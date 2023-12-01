package com.myjava.strivers.graph;

import java.util.ArrayList;
import java.util.List;

public class MatrixAdjacencyPrint {

	public static int[][] printAdjacency(int[][] arr, int n) {
		int[][] adjMat = new int[n][n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < 1; j++) {
				adjMat[arr[i][j]][arr[i][j + 1]] += 1;
				adjMat[arr[i][j + 1]][arr[i][j]] += 1;
			}
		}
		List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		for (int i = 0; i < adjMat.length; i++) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(i);
			for (int j = 0; j < adjMat[i].length; j++) {
				for (int k = 0; k < adjMat[i][j]; k++) {
					list.add(j);
				}
			}
			if (list.size() > 0)
				resultList.add(list);
		}
		int[][] result = new int[resultList.size()][];
		for (int i = 0; i < resultList.size(); i++) {
			result[i] = new int[resultList.get(i).size()];
			for (int j = 0; j < resultList.get(i).size(); j++) {
				result[i][j] = resultList.get(i).get(j);
			}
		}
		return result;
	}

}
