package com.myjava.strivers.binarysearchtrees;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsValidBSTTest {
	@Test
	public void test1() {
		assertTrue(IsValidBST.isValidBST(new int[] { 1, 2, 3, 4, 5 }));
	}

	@Test
	public void test2() {
		assertFalse(IsValidBST.isValidBST(new int[] { 1, 2, 1, 4 }));
	}

	@Test
	public void test3() {
		assertFalse(IsValidBST.isValidBST(new int[] { 7, 28, 31, 32, 37, 38, 44, 47, 47 }));
	}
}
