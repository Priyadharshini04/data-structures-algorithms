package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class KthSmallestElement_L230Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(3, 1, 4, null, 2));
		assertEquals(1, KthSmallestElement_L230.kthSmallest(root, 1));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, null, 1));
		assertEquals(3, KthSmallestElement_L230.kthSmallest(root, 3));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, null, 1));
		assertEquals(6, KthSmallestElement_L230.kthSmallest(root, 6));
	}
}
