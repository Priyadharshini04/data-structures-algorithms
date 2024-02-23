package com.myjava.strivers.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsConnectedGraphTest {
	@Test
	public void test1() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 } };
		assertFalse(IsConnectedGraph.detectCycle(pairs));
	}

	@Test
	public void test2() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 3 } };

		assertTrue(IsConnectedGraph.detectCycle(pairs));
	}

	@Test
	public void test3() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 } };

		assertTrue(IsConnectedGraph.detectCycle(pairs));
	}

	@Test
	public void test4() {
		int[][] pairs = new int[][] { { 1, 2 }, { 2, 3 }, { 1, 5 }, { -6, 7 }, { 7, 8 } };
		assertFalse(IsConnectedGraph.detectCycle(pairs));
	}

	@Test
	public void test5() {
		int[][] pairs = new int[][] { { 1, 2 }, { 2, 5 }, { 1, 5 }, { -6, 7 }, { 7, 8 } };
		assertTrue(IsConnectedGraph.detectCycle(pairs));
	}

	@Test
	public void test6() {
		int[][] pairs = new int[][] { { -1000, 2000 }, { 2000, 3000 }, { 3000, 1000 } };
		assertFalse(IsConnectedGraph.detectCycle(pairs));
	}
}
