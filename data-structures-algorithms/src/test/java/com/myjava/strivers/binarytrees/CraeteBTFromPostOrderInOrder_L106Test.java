package com.myjava.strivers.binarytrees;

import java.util.Arrays;

import org.junit.Test;

public class CraeteBTFromPostOrderInOrder_L106Test {
	@Test
	public void test1() {
		int[] postOrder = new int[] { 9, 15, 7, 20, 3 };
		int[] inOrder = new int[] { 9, 3, 15, 20, 7 };
		TreeNode result = CraeteBTFromPostOrderInOrder_L106.buildTree(postOrder, inOrder);
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(9, 15, 7, 20, 3),
				PostOrderTraverse.postOrderTraverse(result));
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(9, 3, 15, 20, 7),
				InOrderTraversal.inorderTraversal(result));

	}

	@Test
	public void test2() {
		int[] postOrder = new int[] { 1, 9, 15, 7, 20, 3 };
		int[] inOrder = new int[] { 1, 9, 3, 15, 20, 7 };
		TreeNode result = CraeteBTFromPostOrderInOrder_L106.buildTree(postOrder, inOrder);
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(1, 9, 15, 7, 20, 3),
				PostOrderTraverse.postOrderTraverse(result));
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(1, 9, 3, 15, 20, 7),
				InOrderTraversal.inorderTraversal(result));

	}

	@Test
	public void test3() {
		int[] inOrder = new int[] { 1, 2, 3, 4 };
		int[] postOrder = new int[] { 1, 4, 3, 2 };
		TreeNode result = CraeteBTFromPostOrderInOrder_L106.buildTree(postOrder, inOrder);
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(1, 4, 3, 2),
				PostOrderTraverse.postOrderTraverse(result));
		TreeTraversalsTest.assertCollectionEquals(Arrays.asList(1, 2, 3, 4 ), InOrderTraversal.inorderTraversal(result));

	}
}
