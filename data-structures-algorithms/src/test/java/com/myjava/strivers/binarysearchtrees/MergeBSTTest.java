package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class MergeBSTTest {
	@Test
	public void test1() {
		TreeNode root1 = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 2, 1, 3 });
		TreeNode root2 = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 4 });

		List<Integer> result = MergeBST.mergeBST(root1, root2);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4);
		assertTrue(result.size() == expected.size() && expected.containsAll(result) && result.containsAll(expected));
	}

	@Test
	public void test2() {
		TreeNode root1 = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 4, 2, 7, -1, 3 });
		TreeNode root2 = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 5, 1, 7 });

		List<Integer> result = MergeBST.mergeBST(root1, root2);
		List<Integer> expected = Arrays.asList(1, 2, 3, 4, 5, 7, 7);
		assertTrue(result.size() == expected.size() && expected.containsAll(result) && result.containsAll(expected));
	}
}
