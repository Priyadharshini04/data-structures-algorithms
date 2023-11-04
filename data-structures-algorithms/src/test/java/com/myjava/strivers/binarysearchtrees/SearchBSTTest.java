package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Stack;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class SearchBSTTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(4, 2, 7, 1, 3));
		TreeNode expected = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(2, 1, 3));
		assertTreeNode(expected, SearchBST.search(root, 2));
	}

	public static void assertTreeNode(TreeNode expected, TreeNode actual) {
		Stack<TreeNode> expectedstk = new Stack<TreeNode>();
		Stack<TreeNode> actualstk = new Stack<TreeNode>();
		while (expected != null || !expectedstk.isEmpty()) {
			while (expected != null) {
				expectedstk.push(expected);
				actualstk.push(actual);
				assertEquals(expected.data, actual.data);
				expected = expected.left;
				actual = actual.left;
			}
			expected = expectedstk.pop().right;
			actual = actualstk.pop().right;
		}
	}

}
