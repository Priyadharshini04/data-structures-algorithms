package com.myjava.strivers.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RottenOranges_L994Test {
	@Test
	public void test1() {
		int[][] grid = new int[][] { { 2, 1, 1 }, { 1, 1, 0 }, { 0, 1, 1 } };
		assertEquals(4, RottenOranges_L994.orangesRotting(grid));
	}

	@Test
	public void test2() {
		int[][] grid = new int[][] { { 0 } };
		assertEquals(0, RottenOranges_L994.orangesRotting(grid));
	}
}
