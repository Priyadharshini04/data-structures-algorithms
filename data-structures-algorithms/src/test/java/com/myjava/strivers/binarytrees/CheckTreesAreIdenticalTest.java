package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

public class CheckTreesAreIdenticalTest {
	@Test
	public void test1()
	{
		TreeNode root1=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1,2,3));
		TreeNode root2=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1,2,3));
		assertTrue(new CheckTreesAreIdentical().isSameTree(root1,root2));
	}
	@Test
	public void test2()
	{
		TreeNode root1=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1,2));
		TreeNode root2=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1,null,2));
		assertFalse(new CheckTreesAreIdentical().isSameTree(root1,root2));
	}
	@Test
	public void test3()
	{
		TreeNode root1=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList());
		TreeNode root2=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(0));
		assertFalse(new CheckTreesAreIdentical().isSameTree(root1,root2));
	}
}
