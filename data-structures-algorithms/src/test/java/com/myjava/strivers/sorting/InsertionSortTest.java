package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class InsertionSortTest {

	@Test
	public void test1() {
		int[] arr=new int[]{2,13, 4,1,3,6,28};
		InsertionSort.insertionSort(arr, 7);
		assertArrayEquals(new int[] {1,2,3,4,6,13,28}, arr);
	}
}
