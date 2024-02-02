package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import com.myjava.strivers.binarytrees.BinaryTreeLoop;
import com.myjava.strivers.binarytrees.TreeNode;

public class BinarySearchTreeIterator_L173Test {
	@Test
	public void test1() {
		TreeNode root = BinaryTreeLoop.createBinaryTreeWithList(Arrays.asList(7, 3, 15, null, null, 9, 20));
		BinarySearchTreeIterator_L173 binarySearch = new BinarySearchTreeIterator_L173(root);
		assertEquals(3, binarySearch.next());
		assertEquals(7, binarySearch.next());
		assertTrue(binarySearch.hasNext());
		assertEquals(9, binarySearch.next());
		assertTrue(binarySearch.hasNext());
		assertEquals(15, binarySearch.next());
		assertTrue(binarySearch.hasNext());
		assertEquals(20, binarySearch.next());
		assertFalse(binarySearch.hasNext());
	}
}
