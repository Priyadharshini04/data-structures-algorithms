package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class FindMinTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 8, 5, -1, 3, 6 });
		assertEquals(3, FindMin.findMin(root));
	}
}
