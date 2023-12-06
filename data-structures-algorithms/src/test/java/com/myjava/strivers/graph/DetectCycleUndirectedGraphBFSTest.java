package com.myjava.strivers.graph;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class DetectCycleUndirectedGraphBFSTest {
	@Test
	public void test1() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 } };
		List<List<Integer>> list = convertToList(ListAdjacenyPrint.printAdjacency(pairs, 3));
		assertFalse(DetectCycleUndirectedGraphBFS.detectCycle(list, 3));
	}

	private List<List<Integer>> convertToList(int[][] prints) {
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < prints.length; i++) {
			List<Integer> arrys = new ArrayList<Integer>();
			for (int j = 0; j < prints[i].length; j++) {
				arrys.add(prints[i][j]);
			}
			list.add(arrys);
		}
		return list;
	}

	@Test
	public void test2() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 3, 4 }, { 4, 5 }, { 5, 3 } };
		List<List<Integer>> list = convertToList(ListAdjacenyPrint.printAdjacency(pairs, 6));

		assertTrue(DetectCycleUndirectedGraphBFS.detectCycle(list, 6));
	}

	@Test
	public void test3() {
		int[][] pairs = new int[][] { { 0, 1 }, { 1, 2 }, { 2, 3 }, { 3, 0 } };
		List<List<Integer>> list = convertToList(ListAdjacenyPrint.printAdjacency(pairs, 4));

		assertTrue(DetectCycleUndirectedGraphBFS.detectCycle(list, 4));
	}
}
