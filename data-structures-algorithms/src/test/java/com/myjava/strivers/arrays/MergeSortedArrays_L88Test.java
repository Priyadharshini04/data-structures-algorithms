package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeSortedArrays_L88Test {
	@Test
	public void test1() {
		int[] a = new int[] { 4, 5, 6, 0, 0, 0 };
		int[] b = new int[] { 1, 2, 3 };
		int[] exp = new int[] { 1, 2, 3, 4, 5, 6 };
		MergeSortedArrays_L88.merge(a, b);
		assertArrayEquals(exp, a);
	}

	@Test
	public void test2() {
		int[] a = new int[] { 1, 2, 3, 0, 0, 0 };
		int[] b = new int[] { 2, 5, 6 };
		int[] exp = new int[] { 1, 2, 2, 3, 5, 6 };
		MergeSortedArrays_L88.merge(a, b);
		assertArrayEquals(exp, a);
	}
}
