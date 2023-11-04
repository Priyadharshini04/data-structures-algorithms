package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void test1() {
		int[] oldarr={4,3,8,4,6,5};
		QuickSort.sortQuick(oldarr, 0, 5);
	    assertArrayEquals(new int[] {3,4,4,5,6,8}, oldarr);
	}
	
	@Test
	public void test2() {
		int[] oldarr={4,3,8,4,6,5};
		QuickSort.quickSort(oldarr, 0, oldarr.length-1);
	    assertArrayEquals(new int[] {3,4,4,5,6,8}, oldarr);
	}
}
