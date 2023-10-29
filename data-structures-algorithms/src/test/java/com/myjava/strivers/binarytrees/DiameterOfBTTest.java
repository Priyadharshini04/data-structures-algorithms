package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiameterOfBTTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop
				.createBinaryTreeWithNull(new int[] { 1, 2, 3, -1, -1, 4, 6, 5, -1, -1, 7, 9, -1, -1, 8 });
		assertEquals(6, new DiameterOfBT().diameterOfBinaryTree(root));
	}
}
