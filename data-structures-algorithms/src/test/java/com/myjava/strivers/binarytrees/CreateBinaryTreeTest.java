package com.myjava.strivers.binarytrees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Test;

public class CreateBinaryTreeTest {
	@Test
	public void test1() {
		TreeNode n1 = CreateBinaryTree.createBinaryTree(new int[] { 11, 22, 3, 54, 15, 23, 21 });
		assertEquals(11, n1.data);
		assertEquals(22, n1.left.data);
		assertEquals(3, n1.right.data);

		assertEquals(54, n1.left.left.data);
		assertEquals(15, n1.left.right.data);

		assertEquals(23, n1.right.left.data);
		assertEquals(21, n1.right.right.data);
		
		assertNull(n1.right.left.left);
		assertNull(n1.right.left.right);
		
		assertNull(n1.right.right.left);
		assertNull(n1.right.right.right);
	}
	
	@Test
	public void test2() {
		TreeNode n1 = CreateBinaryTree.createBinaryTree(new int[] { 1,2,3,4,5,6,7,8,9,10,11,12,13,14 });
	}
	
}
