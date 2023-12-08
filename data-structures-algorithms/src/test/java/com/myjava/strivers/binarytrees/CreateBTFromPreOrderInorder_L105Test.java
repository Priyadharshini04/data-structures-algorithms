package com.myjava.strivers.binarytrees;

import java.util.Arrays;

import org.junit.Test;

public class CreateBTFromPreOrderInorder_L105Test {
	@Test
	public void test1() {
		int[] preOrder = new int[] { 3, 9, 20, 15, 7 };
		int[] inOrder = new int[] { 9, 3, 15, 20, 7 };
		TreeNode result = CreateBTFromPreOrderInorder_L105.buildTree(preOrder, inOrder);
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(3, 9, 20, 15, 7),
				PreOrderTraverse.preorderTraversal(result));
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(9, 3, 15, 20, 7),
				InOrderTraversal.inorderTraversal(result));

	}

	@Test
	public void test2() {
		int[] preOrder = new int[] { 3, 9, 1, 20, 15, 7 };
		int[] inOrder = new int[] { 1, 9, 3, 15, 20, 7 };
		TreeNode result = CreateBTFromPreOrderInorder_L105.buildTree(preOrder, inOrder);
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(3, 9, 1, 20, 15, 7),
				PreOrderTraverse.preorderTraversal(result));
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(1, 9, 3, 15, 20, 7),
				InOrderTraversal.inorderTraversal(result));

	}
}
