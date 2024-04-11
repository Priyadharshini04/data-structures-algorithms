package com.myjava.strivers.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DetectCycleInDirectedGraph_L210Test {
	@Test
	public void test1() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 3 } };
		assertTrue(DetectCycleInDirectedGraph_L210.isConnected(6, pairs));
	}

	@Test
	public void test2() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 1 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 3 } };
		assertTrue(DetectCycleInDirectedGraph_L210.isConnected(6, pairs));
	}

	@Test
	public void test3() {
		int[][] pairs = new int[][] { { 1, 0 }, { 1, 2 }, { 0, 2 } };
		assertFalse(DetectCycleInDirectedGraph_L210.isConnected(3, pairs));
	}
}
