package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HeightOfBTTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 3, -1, -1, 4 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree(root));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree(root));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2 });
		assertEquals(2, new HeightOfBT().heightOfBinaryTree(root));
	}

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 3, -1, -1, 4 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree_loop(root));
	}

	@Test
	public void test5() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree_loop(root));
	}

	@Test
	public void test6() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2 });
		assertEquals(2, new HeightOfBT().heightOfBinaryTree_loop(root));
	}
	
	@Test
	public void test7() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 3, -1, -1, 4 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree_levelRecursion(root));
	}

	@Test
	public void test8() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree_levelRecursion(root));
	}

	@Test
	public void test9() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2 });
		assertEquals(2, new HeightOfBT().heightOfBinaryTree_levelRecursion(root));
	}
	
	@Test
	public void test10() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 3, -1, -1, 4 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree_level(root));
	}

	@Test
	public void test11() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 3, 9, 20, -1, -1, 15, 7 });
		assertEquals(3, new HeightOfBT().heightOfBinaryTree_level(root));
	}

	@Test
	public void test12() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2 });
		assertEquals(2, new HeightOfBT().heightOfBinaryTree_level(root));
	}
}
