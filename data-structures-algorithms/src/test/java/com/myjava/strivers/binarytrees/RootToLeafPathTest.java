package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class RootToLeafPathTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 1, 2, 3, 4, 5, -1, -1, -1, -1, -1, -1 });
		List<String> expected = Arrays.asList("1 2 4 ", "1 2 5 ", "1 3 ");
		List<String> actual = RootToLeafPath.allRootToLeaf(root);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(new int[] { 47, 40, -1, 45, -1, -1, 55, -1, -1 });
		List<String> expected = Arrays.asList("47 40 45 55 ");
		List<String> actual = RootToLeafPath.allRootToLeaf(root);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(
				new int[] { 25, 23, 38, 25, -1, 39, 27, -1, -1, 29, -1, -1, 17, -1, -1, 5, -1, -1, 9, -1, -1 });
		List<String> expected = Arrays.asList("25 23 25 ", "25 38 27 17 5 9 ", "25 38 39 29 ");
		List<String> actual = RootToLeafPath.allRootToLeaf(root);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}
}
