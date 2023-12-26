package com.myjava.strivers.binarysearchtrees;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class InsertBSTTest {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop
				.createBinaryTreeWithList(Arrays.asList(40, 20, 60, 10, 30, 50, 70, null, null, 25));
		InsertBST.insertIntoBST(root, 25);
	}
}
