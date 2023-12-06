package com.myjava.strivers.graph;

import java.util.ArrayList;
import java.util.List;

public class ListAdjacenyPrint {

	public static int[][] printAdjacency(int[][] arr, int n) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			list.add(arrList);
		}
		for (int i = 0; i < arr.length; i++) {
			int firstidx = arr[i][0];
			int secondIdx = arr[i][1];
			list.get(firstidx).add(secondIdx);
			list.get(secondIdx).add(firstidx);
		}
		int[][] result = new int[list.size()][];
		for (int i = 0; i < list.size(); i++) {
		//	list.get(i).add(0, i);
			result[i] = new int[list.get(i).size()];
			for (int j = 0; j < list.get(i).size(); j++) {
				result[i][j] = list.get(i).get(j);
			}
		}
		return result;
	}

	public static int[][] printAdjacencyDirected(int[][] arr, int n) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < n; i++) {
			ArrayList<Integer> arrList = new ArrayList<Integer>();
			list.add(arrList);
		}
		for (int i = 0; i < arr.length; i++) {
			int firstidx = arr[i][0];
			int secondIdx = arr[i][1];
			list.get(firstidx).add(secondIdx);
		}
		int[][] result = new int[list.size()][];
		for (int i = 0; i < list.size(); i++) {
			result[i] = new int[list.get(i).size()];
			for (int j = 0; j < list.get(i).size(); j++) {
				result[i][j] = list.get(i).get(j);
			}
		}
		return result;
	}

}
