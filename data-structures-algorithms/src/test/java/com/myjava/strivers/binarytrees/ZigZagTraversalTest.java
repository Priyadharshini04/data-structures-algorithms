package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ZigZagTraversalTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(3, 9, 20, null, null, 15, 7));
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(20, 9), Arrays.asList(15, 7));
		List<List<Integer>> actual = ZigZagTraversal.zigzagLevelOrder(root);
		TreeTraversalsTest.assertCollectionArrayEquals(expected, actual);
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 3, 4, null, null, 5));
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(3, 2), Arrays.asList(4, 5));
		List<List<Integer>> actual = ZigZagTraversal.zigzagLevelOrder(root);
		TreeTraversalsTest.assertCollectionArrayEquals(expected, actual);
	}
}
