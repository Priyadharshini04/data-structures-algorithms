package com.myjava.strivers.graph.shortpath;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class DAGWeightedTest {
	@Test
	public void test1() {
		int[] result = DAGWeighted.shortestPathInDAG(3, new int[][] { { 0, 1, 2 }, { 1, 2, 3 }, { 0, 2, 6 } });
		int[] expected = new int[] { 0, 2, 5 };
		assertArrayEquals(expected, result);
	}

	@Test
	public void test2() {
		int[] result = DAGWeighted.shortestPathInDAG(3, new int[][] { { 2, 0, 4 }, { 0, 1, 3 }, { 2, 1, 2 } });
		int[] expected = new int[] { 0, 3, -1 };
		assertArrayEquals(expected, result);
	}
}
