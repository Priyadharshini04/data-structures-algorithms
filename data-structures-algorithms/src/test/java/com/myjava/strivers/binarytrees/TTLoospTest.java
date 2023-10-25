package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TTLoospTest {
	@Test
	public void test1() {
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(5, 3, 2, 1, 7, 4, 6),
				Arrays.asList(1, 3, 5, 2, 4, 7, 6), Arrays.asList(5, 2, 3, 7, 6, 4, 1));
		assertCollectionArrayEquals(expected,
				TTLoosp.getTreeTraversals(BinaryTreeLoop.createBinaryTree(new int[] { 1, 3, 4, 5, 2, 7, 6 })));
	}

	@Test
	public void test2() {
		List<List<Integer>> expected = Arrays.asList(
				Arrays.asList(266, 101, 101, 101, 266, 62, 62, 165, 103, 103, 266, 266, 266, 266),
				Arrays.asList(266, 266, 266, 266, 266, 266, 101, 101, 101, 165, 62, 62, 103, 103),
				Arrays.asList(101,101,101,62,62,103,103,165,266,266,266,266,266,266));
		TreeNode root=BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 266, 266, -1, 266, -1, 266, -1, 266, -1, -1, 266,
				101, 165, 101, -1, 62, 103, 101, -1, 62, -1, 103, -1, -1, -1, -1, -1, -1, -1 });
		assertCollectionArrayEquals(expected,
				TTLoosp.getTreeTraversals(root));
	}

	private void assertCollectionArrayEquals(List<List<Integer>> expected, List<List<Integer>> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertTrue(expected.get(i).size() == actual.get(i).size() && expected.get(i).containsAll(actual.get(i))
					&& actual.get(i).containsAll(expected.get(i)));
		}
	}
}
