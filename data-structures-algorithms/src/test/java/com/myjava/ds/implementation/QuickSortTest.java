package com.myjava.ds.implementation;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {
	@Test
	public void test1() {
		int[] arr = new int[] { 5, 1, 4, 3, 10, 6, 4, 2 };
		QuickSort.sort(arr);
		assertArrayEquals(new int[] { 1, 2, 3, 4, 4, 5, 6, 10 }, arr);
	}

	@Test
	public void test2() {
		int[] arr = new int[] { 4, 3, 8, 4, 6, 5 };
		QuickSort.sort(arr);
		assertArrayEquals(new int[] { 3, 4, 4, 5, 6, 8 }, arr);
	}
}
