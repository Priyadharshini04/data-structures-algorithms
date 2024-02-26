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

	@Test
	public void test4() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithNull(
				new int[] { 35, -1, 29, 41, -1, 13, 19, 9, 39, 47, 7, -1, -1, -1, -1, -1, -1, -1, -1, 35 });
		DeleteNodeBST_L450.deleteNode(root, 35);
	}

	@Test
	public void test5() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(4, null, 7, 6, 8, 5, null, null, 9));
		DeleteNodeBST_L450.deleteNode(root, 7);
	}
}
