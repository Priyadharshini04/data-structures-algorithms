package com.myjava.strivers.graph.toposort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class CycleDetectionDirectedGraphTest {
	@Test
	public void test1() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 3 } };
		List<List<Integer>> adjList = adjList(pairs, 6);
		boolean result = CycleDetectionDirectedGraph.detectCycleInDirectedGraph(adjList, 5);
		assertTrue(result);
	}

	@Test
	public void test2() {
		int[][] pairs = new int[][] { { 1, 0 }, { 1, 2 }, { 0, 2 } };
		List<List<Integer>> adjList = adjList(pairs, 3);
		assertFalse(CycleDetectionDirectedGraph.detectCycleInDirectedGraph(adjList, 2));
	}

	@Test
	public void test3() {
		int[][] pairs = new int[][] { { 1, 2 }, { 4, 5 }, { 5, 9 }, { 5, 10 }, { 5, 1 }, { 5, 3 }, { 6, 7 } };
		List<List<Integer>> adjList = adjList(pairs, 11);
		assertFalse(CycleDetectionDirectedGraph.detectCycleInDirectedGraph(adjList, 10));
	}

	@Test
	public void test4() {
		int[][] pairs = new int[][] { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 } };
		List<List<Integer>> adjList = adjList(pairs, 6);
		assertFalse(CycleDetectionDirectedGraph.detectCycleInDirectedGraph(adjList, 5));
	}

	public List<List<Integer>> adjList(int[][] pairs, int v) {
		List<List<Integer>> adjList = new ArrayList<List<Integer>>();
		for (int i = 0; i < v; i++) {
			adjList.add(new ArrayList<Integer>());
		}
		for (int i = 0; i < pairs.length; i++) {
			adjList.get(pairs[i][0]).add(pairs[i][1]);
		}
		return adjList;
	}

}
