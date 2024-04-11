package com.myjava.strivers.graph.toposort;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TopologicalSortTest {
	@Test
	public void test1() {
		int[][] edges = new int[][] { { 0, 2 }, { 1, 2 }, { 3, 1 }, { 0, 4 } };
		int e = 4;
		int v = 5;
		List<Integer> result = TopologicalSort.topologicalSort(edges, e, v);
		List<Integer> expected = Arrays.asList(0, 3, 4, 1, 2);
		assertTrue(expected.size() == result.size() && expected.containsAll(result) && result.containsAll(expected));
	}
}
