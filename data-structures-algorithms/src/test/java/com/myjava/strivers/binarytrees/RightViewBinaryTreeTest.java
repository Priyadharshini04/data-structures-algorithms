package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RightViewBinaryTreeTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(
				Arrays.asList(1, 2, 3, 4, 5, null, 6, null, 7, null, null, 8, null, 9, null, null, 11));
		List<Integer> expected = Arrays.asList(1, 3, 6, 8, 11);
		TreeTraversalsTest.assertCollectionEquals(expected, RightViewBinaryTree.rightSideView(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 3, 4));
		List<Integer> expected = Arrays.asList(1, 3, 4);
		TreeTraversalsTest.assertCollectionEquals(expected, RightViewBinaryTree.rightSideView(root));
	}
}
