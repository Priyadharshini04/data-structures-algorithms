package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckBTisBalancedTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		assertTrue(new CheckBTisBalanced().isBalanced(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 2, 3, 3, -1, -1, 4, 4 });
		assertFalse(new CheckBTisBalanced().isBalanced(root));
	}
	
	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		assertTrue(new CheckBTisBalanced().isBalanced_optimised(root));
	}

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 2, 3, 3, -1, -1, 4, 4 });
		assertFalse(new CheckBTisBalanced().isBalanced_optimised(root));
	}
}
