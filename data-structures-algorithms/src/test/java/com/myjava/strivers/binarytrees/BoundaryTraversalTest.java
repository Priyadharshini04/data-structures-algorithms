package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BoundaryTraversalTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop
				.createBinaryTreeWithNull(new int[] { 10, 5, 20, 3, 8, 18, 25, -1, -1, 7, -1, -1, -1, -1, -1, -1, -1 });
		List<Integer> expected = Arrays.asList(10, 5, 3, 7, 18, 25, 20);
		TreeTraversalsTest.assertCollectionEquals(expected, BoundaryTraversal.traverseBoundary(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 100, 50, 150, 25, 75, 140, 200, -1, 30, 70,
				80, -1, -1, -1, -1, -1, 35, -1, -1, -1, -1, -1, -1 });
		List<Integer> expected = Arrays.asList(100, 50, 25, 30, 35, 70, 80, 140, 200, 150);
		TreeTraversalsTest.assertCollectionEquals(expected, BoundaryTraversal.traverseBoundary(root));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(
				new int[] { 32, 20, 31, 38, 22, 19, 18, 33, 12, 44, 41, 10, 27, -1, 37, -1, 7, -1, -1, -1, -1, 43, -1,
						1, -1, -1, 23, -1, -1, -1, -1, -1, -1, 21, 29, 30, -1, 5, -1, -1, -1, -1, -1, -1, -1 });
		List<Integer> expected = Arrays.asList(32, 20, 38, 33, 7, 12, 44, 43, 5, 29, 30, 37, 18, 31);
		TreeTraversalsTest.assertCollectionEquals(expected, BoundaryTraversal.traverseBoundary(root));
	}

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(
				new int[] { 27, 16, 33, 14, 15, -1, -1, 17, 34, 10, 37, 21, -1, -1, 44, 13, -1, 22, 38, 45, 11, 31, -1,
						-1, -1, -1, -1, -1, 47, -1, 20, -1, -1, -1, 43, 39, -1, -1, -1, -1, -1, 36, -1, -1, -1 });
		List<Integer> expected = Arrays.asList(27, 16, 14, 17, 21, 45, 20, 11, 43, 13, 22, 36, 33);
		TreeTraversalsTest.assertCollectionEquals(expected, BoundaryTraversal.traverseBoundary(root));
	}
}
