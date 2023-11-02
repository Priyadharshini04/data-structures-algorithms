package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class SymmetricTreeTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 2, 3, 4, 4, 3));
		assertTrue(new SymmetricTree().isSymmetric(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 2, null, 3, null, 3));
		assertFalse(new SymmetricTree().isSymmetric(root));
	}
}
