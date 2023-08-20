package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySearchIndexTest {

	@Test
	public void test1() {
		assertEquals(4, BinarySearchIndex.searchRecursive(new int[] { -1, 0, 3, 5, 9, 12 }, 9, 0, 5));

	}

	@Test
	public void test2() {
		assertEquals(1, BinarySearchIndex.searchRecursive(new int[] { 2, 5 }, 5, 0, 1));
	}
	
	@Test
	public void test3() {
		assertEquals(4, BinarySearchIndex.search(new int[] { -1, 0, 3, 5, 9, 12 }, 9));

	}

	@Test
	public void test4() {
		assertEquals(1, BinarySearchIndex.search(new int[] { 2, 5 }, 5));
	}
}
