package com.myjava.strivers.graph.shortpath;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinaryMatrixTest {
	@Test
	public void test1() {
		int grid[][] = new int[][] { { 0, 0, 0 }, { 1, 1, 0 }, { 1, 1, 0 } };
		assertEquals(4, BinaryMatrix.shortestPathBinaryMatrix(grid));
	}

	@Test
	public void test2() {
		int grid[][] = new int[][] { { 0, 1 }, { 1, 0 } };
		assertEquals(2, BinaryMatrix.shortestPathBinaryMatrix(grid));
	}
}
