package com.myjava.strivers.graph;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class DFSTraversalTest {
	private ArrayList<Integer> result;

	@Test
	public void test1() {
		ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
		pairs.add(new ArrayList<>(List.of(0, 2)));
		pairs.add(new ArrayList<>(List.of(0, 1)));
		pairs.add(new ArrayList<>(List.of(1, 2)));
		pairs.add(new ArrayList<>(List.of(3, 4)));
		ArrayList<ArrayList<Integer>> result = DFSTraversal.depthFirstSearch(5, 4, pairs);
		ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
		expected.add(new ArrayList<Integer>(List.of(0, 1, 2)));
		expected.add(new ArrayList<Integer>(List.of(3, 4)));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

	@Test
	public void test2() {
		ArrayList<ArrayList<Integer>> pairs = new ArrayList<>();
		pairs.add(new ArrayList<>(List.of(0, 2)));
		pairs.add(new ArrayList<>(List.of(0, 3)));
		pairs.add(new ArrayList<>(List.of(0,1)));
		pairs.add(new ArrayList<>(List.of(2,4)));
		result = DFSTraversal.dfsOfGraph(5, pairs);
		ArrayList<Integer> expected = new ArrayList<>(List.of(0, 2, 4, 3, 1));
		assertTrue(expected.size() == result.size() && expected.containsAll(result) && result.containsAll(expected));
	}
}
