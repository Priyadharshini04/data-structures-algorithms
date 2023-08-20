package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class MergeSortTest {

	@Test
	public void test1() {
		int[] arr= {2,13,4 ,1,3,6,28};
		MergeSort.mergeSort(arr,0,arr.length-1);
		assertArrayEquals(new int[] {1,2,3,4,6,13,28}, arr);
	}
}
