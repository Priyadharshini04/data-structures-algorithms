package com.myjava.strivers.graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class _01Matrix_L542Test {
	@Test
	public void test1() {
		int[][] mat = new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
		int[][] result = _01Matrix_L542.updateMatrix(mat);
		assertArrayEquals(new int[][] { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } }, result);
	}

	@Test
	public void test2() {
		int[][] mat = new int[][] { { 0, 1, 0 }, { 1, 1, 1 }, { 1, 1, 1 } };
		int[][] result = _01Matrix_L542.updateMatrix(mat);
		assertArrayEquals(new int[][] { { 0, 1, 0 }, { 1, 2, 1 }, { 2, 3, 2 } }, result);
	}

	@Test
	public void test3() {
		int[][] mat = new int[][] { { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } };
		int[][] result = _01Matrix_L542.updateMatrix(mat);
		assertArrayEquals(new int[][] { { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 }, { 0, 1, 0 } }, result);
	}
}
