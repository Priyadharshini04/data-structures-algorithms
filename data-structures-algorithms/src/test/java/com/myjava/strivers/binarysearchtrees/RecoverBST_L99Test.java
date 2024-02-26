package com.myjava.strivers.binarysearchtrees;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.CreateBinaryTree;
import com.myjava.strivers.binarytrees.TreeNode;
import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class RecoverBST_L99Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(1, 3, null, null, 2));
		TreeNode ansRoot = RecoverBST_L99.recover(root);
		TreeNode expectedRoot = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(3, 1, null, null, 2));

		SearchBSTTest.assertTreeNode(expectedRoot, ansRoot);
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(2, 3, 1));
		TreeNode ansRoot = RecoverBST_L99.recover(root);
		TreeNode expectedRoot = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(2, 1, 3));

		SearchBSTTest.assertTreeNode(expectedRoot, ansRoot);
	}
}
