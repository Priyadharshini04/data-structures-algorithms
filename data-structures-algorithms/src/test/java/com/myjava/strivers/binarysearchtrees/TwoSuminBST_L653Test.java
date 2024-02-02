package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class TwoSuminBST_L653Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, 7));
		assertTrue(TwoSuminBST_L653.findTarget(root, 9));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, 7));
		assertFalse(TwoSuminBST_L653.findTarget(root, 28));
	}
}
