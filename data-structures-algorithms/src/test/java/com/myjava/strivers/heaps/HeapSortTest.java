package com.myjava.strivers.heaps;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class HeapSortTest {
	@Test
	public void test1() {
		int[] arr = new int[] { 20, 8, 19, 7, 1 };
		assertArrayEquals(new int[] { 1, 7, 8, 19, 20 }, HeapSort.sort(arr));
	}
}
