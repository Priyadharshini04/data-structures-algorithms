package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class MaximumPathSumTest {
	@Test
	public void test1()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTreeWithNull(new int[] {-10,9,20,-1,-1,15,7});
		assertEquals(42, new MaximumPathSum().maxPathSum(root));
	}
	@Test
	public void test2()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTree(new int[] {-3});
		assertEquals(-3, new MaximumPathSum().maxPathSum(root));
	}
	@Test
	public void test3()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTree(new int[] {-2,-1});
		assertEquals(-1, new MaximumPathSum().maxPathSum(root));
	}
	@Test
	public void test4()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTreeWithNull(new int[] {-10,9,20,-1,-1,-15,7});
		assertEquals(27, new MaximumPathSum().maxPathSum(root));
	}
	@Test
	public void test5()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTree(new int[] {2,-1,-2});
		assertEquals(2, new MaximumPathSum().maxPathSum(root));
	}
	@Test
	public void test6()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1,-2,-3,1,3,-2,null,-1));
		assertEquals(3, new MaximumPathSum().maxPathSum(root));
	}
	@Test
	public void test7()
	{
		TreeNode root=BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(9,6,-3,null,null,-6,2,null,null,2,null,-6,-6,-6));
		assertEquals(16, new MaximumPathSum().maxPathSum(root));
	}
}
