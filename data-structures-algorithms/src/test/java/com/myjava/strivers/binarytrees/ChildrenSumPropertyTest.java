package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ChildrenSumPropertyTest {
	@Test
	public void test1() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 5, 3, 2, 3 });
		assertTrue(ChildrenSumProperty.isParentSum(root));
	}

	@Test
	public void test2() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 7, 3, 4, 3, -1, 2, 3 });
		assertFalse(ChildrenSumProperty.isParentSum(root));
	}
}
