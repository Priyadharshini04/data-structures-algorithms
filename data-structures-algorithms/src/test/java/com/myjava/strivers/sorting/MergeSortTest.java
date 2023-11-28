package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test1() {
		int[] arr= {5,2,4,6,1,3};
		MergeSort.mergeSort(arr,0,arr.length-1);
		assertArrayEquals(new int[] {1,2,3,4,5,6}, arr);
	}
}
