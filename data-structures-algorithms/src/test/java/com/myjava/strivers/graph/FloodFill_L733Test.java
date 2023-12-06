package com.myjava.strivers.graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FloodFill_L733Test {
	@Test
	public void test1() {
		int[][] image = new int[][] { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
		int[][] result = FloodFill_L733.floodFill(image, 1, 1, 2);
		int[][] expected = new int[][] { { 2, 2, 2 }, { 2, 2, 0 }, { 2, 0, 1 } };

		assertArrayEquals(expected, result);
	}

	@Test
	public void test2() {
		int[][] image = new int[][] { { 2, 0, 0 }, { 1, 0, 0 } };
		int[][] result = FloodFill_L733.floodFill(image, 0, 0, 2);
		int[][] expected = new int[][] { { 2, 0, 0 }, { 1, 0, 0 } };

		assertArrayEquals(expected, result);
	}

	@Test
	public void test3() {
		int[][] image = new int[][] { { 2, 0, 0 }, { 1, 0, 0 } };
		int[][] result = FloodFill_L733.floodFill(image, 1, 1, 2);
		int[][] expected = new int[][] { { 2, 2, 2 }, { 1, 2, 2 } };

		assertArrayEquals(expected, result);
	}
}
