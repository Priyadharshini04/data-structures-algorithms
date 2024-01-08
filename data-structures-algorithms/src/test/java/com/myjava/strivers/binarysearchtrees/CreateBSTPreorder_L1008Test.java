package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeNode;

public class CreateBSTPreorder_L1008Test {
	@Test
	public void test1() {
		TreeNode root = CreateBSTPreorder_L1008.bstFromPreorder(new int[] { 8, 5, 1, 7, 10, 12 });
		assertTrue(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}

	@Test
	public void test2() {
		TreeNode root = CreateBSTPreorder_L1008.bstFromPreorder(new int[] { 8, 5, 1, 7, 10, 12, 11 });
		assertTrue(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}

	@Test
	public void test3() {
		TreeNode root = CreateBSTPreorder_L1008.bstFromPreorder(new int[] { 1, 3 });
		assertTrue(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}

	@Test
	public void test4() {
		TreeNode root = CreateBSTPreorder_L1008.bstFromPreorder(new int[] { 2, 8, 6, 19 });
		assertTrue(BinaryTreeOrBinarySearchTree_L98.isValidBST(root));
	}
}
