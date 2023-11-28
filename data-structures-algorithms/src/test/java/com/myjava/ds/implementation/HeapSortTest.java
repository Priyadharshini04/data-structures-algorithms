package com.myjava.ds.implementation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {
	@Test
	public void test1() {
		int[] arr = new int[] { 5, 2, 10, 1, 4, 4, 3 };
		assertArrayEquals(new int[] { 1, 2, 3, 4, 4, 5, 10 }, HeapSort.sort(arr));
	}

	@Test
	public void test2() {
		int[] arr = new int[] { -1, 2, -8, -10 };
		assertArrayEquals(new int[] { -10,-8,-1,2 }, HeapSort.sort(arr));
	}
}
