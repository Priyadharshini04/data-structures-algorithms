package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TimeToBurnTreeTest {
	@Test
	public void test1() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 1, 2, 3, 4, -1, -1, 5 });
		assertEquals(3, TimeToBurnTree.timeToBurnTree(root, 2));
	}
}
