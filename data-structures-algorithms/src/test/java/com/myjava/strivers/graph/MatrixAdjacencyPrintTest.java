package com.myjava.strivers.graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MatrixAdjacencyPrintTest {
	@Test
	public void test1() {
		int[][] arr = new int[][] { { 2, 1 }, { 2, 0 } };
		int[][] result = MatrixAdjacencyPrint.printAdjacency(arr, 3);
		int[][] expected = new int[][] { { 0, 2 }, { 1, 2 }, { 2, 0, 1 } };
		assertArrayEquals(expected, result);
	}

	@Test
	public void test2() {
		int[][] arr = new int[][] { { 2, 1 }, { 2, 0 } };
		int[][] result = MatrixAdjacencyPrint.printAdjacency(arr, 3);
		int[][] expected = new int[][] { { 0, 2 }, { 1, 2 }, { 2, 0, 1 } };
		assertArrayEquals(expected, result);
	}

	@Test
	public void test3() {
		int[][] arr = new int[][] { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 0, 4 }, { 0, 5 }, { 0, 6 }, { 0, 7 }, { 1, 2 },
				{ 1, 3 }, { 1, 4 }, { 1, 5 }, { 1, 5 }, // Note: there seems to be a duplicate pair (1, 5)
				{ 1, 7 }, { 2, 3 }, { 2, 4 }, { 2, 5 }, { 2, 6 }, { 2, 7 }, { 3, 4 }, { 3, 5 }, { 3, 6 }, { 3, 7 },
				{ 4, 5 }, { 4, 6 }, { 4, 7 }, { 5, 6 }, { 5, 7 }, { 6, 7 } };
		int[][] result = MatrixAdjacencyPrint.printAdjacency(arr, 8);
		int[][] expected = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7 }, { 1, 0, 2, 3, 4, 5, 5, 7 },
				{ 2, 0, 1, 3, 4, 5, 6, 7 }, { 3, 0, 1, 2, 4, 5, 6, 7 }, { 4, 0, 1, 2, 3, 5, 6, 7 },
				{ 5, 0, 1, 1, 2, 3, 4, 6, 7 }, { 6, 0, 2, 3, 4, 5, 7 }, { 7, 0, 1, 2, 3, 4, 5, 6 } };
		assertArrayEquals(expected, result);
	}
}
