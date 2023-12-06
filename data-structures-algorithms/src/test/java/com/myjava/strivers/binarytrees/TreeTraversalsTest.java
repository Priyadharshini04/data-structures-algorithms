package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TreeTraversalsTest {
	@Test
	public void test1() {
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(5, 3, 2, 1, 7, 4, 6),
				Arrays.asList(1, 3, 5, 2, 4, 7, 6), Arrays.asList(5, 2, 3, 7, 6, 4, 1));
		assertCollectionArrayEquals(expected,
				TreeTraversals.getTreeTraversal(CreateBinaryTree.createBinaryTree(new int[] { 1, 3, 4, 5, 2, 7, 6 })));
	}

	public static void assertCollectionArrayEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertCollectionEquals(expected.get(i), actual.get(i));
		}
	}

	public static void assertCollectionArrayEquals(ArrayList<ArrayList<Integer>> expected,
			ArrayList<ArrayList<Integer>> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertCollectionEquals(expected.get(i), actual.get(i));
		}
	}

	public static void assertCollectionEquals(List<Integer> expected, List<Integer> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

	public static void assertCollectionEquals(ArrayList<Integer> expected, ArrayList<Integer> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
