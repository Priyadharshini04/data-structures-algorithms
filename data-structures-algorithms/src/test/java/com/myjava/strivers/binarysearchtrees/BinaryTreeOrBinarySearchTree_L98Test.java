package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class BinaryTreeOrBinarySearchTree_L98Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 1, 4, null, null, 3, 6));
		assertFalse(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, null, 6, 3, 7));
		assertFalse(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(2, 1, 3));
		assertTrue(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}
}
