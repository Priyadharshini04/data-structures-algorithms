package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class BinaryTreePreOrderTraversal_L144Test {
	@Test
	public void test1() {
		List<Integer> expected = Arrays.asList(1, 2, 3);
		TreeNode root=new TreeNode(1);
		root.left=null;
		root.right=new TreeNode(2);
		root.right.left=new TreeNode(3);
		List<Integer> actual = BinaryTreePreOrderTraversal_L144.preorderTraversal(root);
		assertTrue(expected.size() == actual.size() && expected.containsAll(actual) && actual.containsAll(expected));
	}
}
