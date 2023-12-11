package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myjava.strivers.binarytrees.CreateBinaryTree;
import com.myjava.strivers.binarytrees.TreeNode;

public class FindFloorTest {
	@Test
	public void test1() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 8, 5, 10, 2, 6, -1, -1, -1, -1, -1, 7, -1, -1 });
		assertEquals(2, FindFloor.findFloor(root, 4));
	}

	@Test
	public void test2() {
		TreeNode root = CreateBinaryTree.createBinaryTree(new int[] { 8, 5, 10, 2, 6, -1, -1, -1, -1, -1, 7, -1, -1 });
		assertEquals(7, FindFloor.findFloor(root, 7));
	}
}
