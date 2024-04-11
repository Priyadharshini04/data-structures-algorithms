package com.myjava.strivers.graph.shortpath;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class MinimumSpanningTreeTest {
	@Test
	public void test1()
	{
		ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
        edges.add(new ArrayList<>(Arrays.asList(0, 1, 3)));
        edges.add(new ArrayList<>(Arrays.asList(0, 3, 5)));
        edges.add(new ArrayList<>(Arrays.asList(1, 2, 1)));
        edges.add(new ArrayList<>(Arrays.asList(2, 3, 8)));
        int totalWeight =  MinimumSpanningTree.minimumSpanningTree(edges,4);
        assertEquals(9, totalWeight);
	}
}
