package com.myjava.strivers.binarytrees;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PostOrderTraverseTest {
	@Test
	public void test1()
	{
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(3,2,1);
		List<Integer> actual = PostOrderTraverse.postOrderTraverse(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}
	
	@Test
	public void test2()
	{
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(3,2,1);
		List<Integer> actual = PostOrderTraverse.postOrderTraverse_loop(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}
	@Test
	public void test3()
	{
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, -1, 2, 3 });
		List<Integer> expected = Arrays.asList(3,2,1);
		List<Integer> actual = PostOrderTraverse.postOrderTraverse_loop_singleStack(root);
		TreeTraversalsTest.assertCollectionEquals(expected, actual);
	}
	
}
