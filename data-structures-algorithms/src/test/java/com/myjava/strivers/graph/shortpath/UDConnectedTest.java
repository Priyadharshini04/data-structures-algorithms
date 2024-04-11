package com.myjava.strivers.graph.shortpath;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class UDConnectedTest {
	@Test
	public void test1() {
		int[][] edges = { { 0, 1, 5 }, { 0, 2, 8 }, { 1, 2, 9 }, { 1, 3, 2 }, { 2, 3, 6 } };
		List<Integer> result = UDConnected.dijkstra(edges, 4, 5, 0);
		List<Integer> expected = Arrays.asList(0, 5, 8, 7);
		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(expected));
	}

	@Test
	public void test2() {
		int[][] edges = { { 0, 1, 7 }, { 0, 2, 1 }, { 0, 3, 2 }, { 1, 2, 3 }, { 1, 3, 5 }, { 1, 4, 1 }, { 3, 4, 7 } };
		List<Integer> result = UDConnected.dijkstra(edges, 5, 5, 0);
		List<Integer> expected = Arrays.asList(0, 4, 1, 2, 5);
		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(expected));
	}
}
