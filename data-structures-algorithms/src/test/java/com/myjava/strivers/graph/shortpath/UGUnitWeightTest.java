package com.myjava.strivers.graph.shortpath;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class UGUnitWeightTest {
	@Test
	public void test1() {
		int[][] edges = new int[][] { { 0, 1 }, { 1, 4 }, { 2, 3 }, { 2, 4 }, { 3, 4 } };
		int[] result = UGUnitWeight.shortestPath(edges, 1, 5);
		int[] expected = new int[] { 1, 0, 2, 2, 1 };
		assertArrayEquals(expected, result);
	}

	@Test
	public void test2() {
		int[][] edges = new int[][] { { 0, 1 }, { 1, 4 }, { 2, 3 }, { 2, 4 } };
		int[] result = UGUnitWeight.shortestPath(edges, 1, 5);
		int[] expected = new int[] { 1, 0, 2, 3, 1 };
		assertArrayEquals(expected, result);
	}
}
