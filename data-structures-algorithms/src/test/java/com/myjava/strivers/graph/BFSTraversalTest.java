package com.myjava.strivers.graph;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BFSTraversalTest {
	@Test
	public void test1() {
		List<List<Integer>> arr = Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4), Arrays.asList(5),
				Arrays.asList(), Arrays.asList());
		List<Integer> result = BFSTraversal.bfsTraversal(5, arr);
		List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 5);
		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test2() {
		int[][] pairs = {
	            {0, 1},
	            {0, 2},
	            {0, 3},
	            {1, 4},
	            {1, 7},
	            {2, 5},
	            {3, 6}
	        };
		List<List<Integer>> indexValuePairs = createAdjacencyDirected(pairs);
		List<Integer> result = BFSTraversal.bfsTraversal(8, indexValuePairs);
		List<Integer> expected = Arrays.asList(0, 1, 2, 3, 4, 7, 5, 6);
		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}

	@Test
	public void test3() {
		int[][] pairs = { { 9, 22 }, { 24, 19 }, { 24, 9 }, { 30, 7 }, { 14, 10 }, { 30, 2 }, { 20, 8 }, { 16, 6 },
				{ 15, 30 }, { 26, 29 }, { 23, 28 }, { 6, 4 }, { 26, 11 }, { 4, 28 }, { 25, 5 }, { 8, 27 }, { 24, 30 },
				{ 17, 23 }, { 4, 9 }, { 27, 23 }, { 10, 10 }, { 22, 7 }, { 17, 15 }, { 25, 3 }, { 21, 15 }, { 15, 0 },
				{ 23, 16 }, { 27, 6 }, { 18, 11 }, { 26, 19 }, { 18, 1 }, { 22, 11 }, { 28, 2 }, { 22, 21 }, { 27, 9 },
				{ 29, 19 }, { 2, 19 }, { 3, 11 }, { 10, 27 }, { 10, 22 }, { 11, 7 }, { 10, 8 }, { 24, 5 }, { 13, 24 },
				{ 21, 27 }, { 23, 22 }, { 11, 30 }, { 1, 2 }, { 27, 18 }, { 17, 8 }, { 17, 4 }, { 4, 30 }, { 24, 0 },
				{ 8, 6 }, { 9, 13 }, { 30, 5 }, { 13, 3 }, { 24, 4 }, { 15, 6 }, { 17, 3 }, { 3, 29 }, { 26, 25 },
				{ 5, 11 }, { 21, 13 }, { 9, 16 }, { 3, 2 }, { 26, 22 }, { 3, 24 }, { 20, 14 }, { 29, 10 }, { 19, 10 },
				{ 13, 27 } };
		List<List<Integer>> list = createAdjacencyDirected(pairs);
		List<Integer> result = BFSTraversal.bfsTraversal(list.size(), list);
		List<Integer> expected = Arrays.asList(0);
		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}
	
	public List<List<Integer>> createAdjacencyDirected(int[][] pairs)
	{
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		int[][] indexValuePairs = ListAdjacenyPrint.printAdjacencyDirected(pairs, 31);
		for (int i = 0; i < indexValuePairs.length; i++) {
			ArrayList<Integer> arrys = new ArrayList<Integer>();
			for (int j = 0; j < indexValuePairs[i].length; j++) {
				arrys.add(indexValuePairs[i][j]);
			}
			list.add(arrys);
		}
		return list;
	}
}
