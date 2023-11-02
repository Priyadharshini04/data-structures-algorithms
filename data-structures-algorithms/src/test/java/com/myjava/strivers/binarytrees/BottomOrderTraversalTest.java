package com.myjava.strivers.binarytrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BottomOrderTraversalTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 3, 4, 5, 6, 7 });
		List<Integer> expected = Arrays.asList(4, 2, 6, 3, 7);
		TreeTraversalsTest.assertCollectionEquals(expected, BottomOrderTraversal.bottomView(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 14, 14, 3, -1, 8, 8, 12, -1, 6, 17, 3, -1,
				1, 11, 10, -1, 6, 6, 13, -1, 10, 17, 7, -1, 11, 7 });
		List<Integer> expected = Arrays.asList(7, 6, 7, 13, 11, 10);
		TreeTraversalsTest.assertCollectionEquals(expected, BottomOrderTraversal.bottomView(root));
	}
}
