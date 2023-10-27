package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PreOrderTraverseTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(1,2,3);
		List<Integer> actual = PreOrderTraverse.preorderTraversal(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}
	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(1,2,3);
		List<Integer> actual = PreOrderTraverse.preorderTraversal_loop(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}
}
