package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class LevelOrderTraversalTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		List<Integer> expected = Arrays.asList(3, 9, 20, 15, 7);
		List<Integer> actual = LevelOrderTraversal.levelOrderTraversal(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 38, 40, 26, 14, 24, 12, 42, -1, 13, 37, 16,
				3, -1, 19, -1, -1, -1, -1, 22, -1, 7, -1, -1, -1, -1, -1, 2, -1, -1, 18, -1, -1, 6, -1, -1 });
		List<Integer> expected = Arrays.asList(38, 40, 26, 14, 24, 12, 42, 13, 37, 16, 3, 19, 22, 7, 2, 18, 6);
		List<Integer> actual = LevelOrderTraversal.levelOrderTraversal(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7));
		List<List<Integer>> actual = LevelOrderTraversal.levelOrderTraversalL_102(root);
		TreeTraversalsTest.assertCollectionArrayEquals(expected, actual);
	}
}
