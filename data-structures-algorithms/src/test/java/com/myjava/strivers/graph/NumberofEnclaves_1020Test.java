package com.myjava.strivers.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberofEnclaves_1020Test {
	@Test
	public void test1() {
		int[][] grid = new int[][] { { 0, 0, 0, 0 }, { 1, 0, 1, 0 }, { 0, 1, 1, 0 }, { 0, 0, 0, 0 } };
		int res = NumberofEnclaves_1020.numEnclaves(grid);
		assertEquals(3, res);
	}

	@Test
	public void test2() {
		int[][] grid = new int[][] { { 0, 1, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 1, 0 }, { 0, 0, 0, 0 } };
		int res = NumberofEnclaves_1020.numEnclaves(grid);
		assertEquals(0, res);
	}
}
