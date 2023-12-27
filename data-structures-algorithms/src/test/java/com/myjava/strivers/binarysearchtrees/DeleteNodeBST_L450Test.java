package com.myjava.strivers.binarysearchtrees;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class DeleteNodeBST_L450Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, 7));
		DeleteNodeBST_L450.deleteNode(root, 3);
	}

	@Test
	public void test2() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, 7));
		DeleteNodeBST_L450.deleteNode(root, 8);
	}

	@Test
	public void test3() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(5, 3, 6, 2, 4, null, 7));
		DeleteNodeBST_L450.deleteNode(root, 5);
	}
}
