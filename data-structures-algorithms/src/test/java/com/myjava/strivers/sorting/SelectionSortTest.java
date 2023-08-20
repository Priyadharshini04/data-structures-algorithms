package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void test1() {
		int[] arr=new int[]{2,13, 4,1,3,6,28};
		SelectionSort.selectionSort(arr);
		assertArrayEquals(new int[] {1,2,3,4,6,13,28}, arr);
	}
}
