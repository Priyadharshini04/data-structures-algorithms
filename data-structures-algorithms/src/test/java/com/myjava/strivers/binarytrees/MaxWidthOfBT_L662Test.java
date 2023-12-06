package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaxWidthOfBT_L662Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 3, 2, 5, 3, null, 9));
		assertEquals(4, MaxWidthOfBT_L662.widthOfBinaryTree(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 3, 2, 5, null, null, 9, 6, null, 7));
		assertEquals(7, MaxWidthOfBT_L662.widthOfBinaryTree(root));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 3, 2, 5));
		assertEquals(2, MaxWidthOfBT_L662.widthOfBinaryTree(root));
	}

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 1, 1, 1, 1, 1, 1, null, null, null, 1,
				null, null, null, null, 2, 2, 2, 2, 2, 2, 2, null, 2, null, null, 2, null, 2));
		assertEquals(8, MaxWidthOfBT_L662.widthOfBinaryTree(root));
	}

	@Test
	public void test5() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, null, 1));
		assertEquals(1, MaxWidthOfBT_L662.widthOfBinaryTree(root));
	}
}
