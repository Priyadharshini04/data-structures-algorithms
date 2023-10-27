package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class InOrderTraversalTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(1, 3, 2);
		List<Integer> actual = InOrderTraversal.inorderTraversal(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(1, 3, 2);
		List<Integer> actual = InOrderTraversal.inorderTraversalLoop(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 1, 2 });
		List<Integer> expected = Arrays.asList(1, 3, 2);
		List<Integer> actual = InOrderTraversal.inorderTraversalLoop(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 1, -1, -1, 2 });
		List<Integer> expected = Arrays.asList(1, 2, 3);
		List<Integer> actual = InOrderTraversal.inorderTraversalLoop(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}
}
