package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class CountNodes_L222Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 2, 3, 4, 5, 6));
		assertEquals(6, CountNodes_L222.countNodes(root));
	}
}
