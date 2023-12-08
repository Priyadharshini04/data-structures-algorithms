package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RequirementsOfUniqueBinaryTreeTest {
	/*
	 * PreOrder-1 Inorder- 2 PostOrder -3. Can't construct a unique binary tree with
	 * PreOrder and postorder. Possible to construct a unique BT with InOrder with
	 * PreOrder/PostOrder.
	 */
	@Test
	public void test1() {
		assertTrue(RequirementsOfUniqueBinaryTree.uniqueBinaryTree(1, 2));
	}
	@Test
	public void test2() {
		assertFalse(RequirementsOfUniqueBinaryTree.uniqueBinaryTree(1, 3));
	}
	@Test
	public void test3() {
		assertFalse(RequirementsOfUniqueBinaryTree.uniqueBinaryTree(2, 2));
	}
	@Test
	public void test4() {
		assertTrue(RequirementsOfUniqueBinaryTree.uniqueBinaryTree(3, 2));
	}
}
