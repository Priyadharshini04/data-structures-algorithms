package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class VerticalOrderTraversalTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(3, 9, 20, null, null, 15, 7));
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(9), Arrays.asList(3, 15), Arrays.asList(20),
				Arrays.asList(7));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, new VerticalOrderTraversal().verticalTraversal(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6),
				Arrays.asList(3), Arrays.asList(7));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, new VerticalOrderTraversal().verticalTraversal(root));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(3, 1, 4, 0, 2, 2));
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(0), Arrays.asList(1), Arrays.asList(3, 2, 2),
				Arrays.asList(4));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, new VerticalOrderTraversal().verticalTraversal(root));
	}
}
