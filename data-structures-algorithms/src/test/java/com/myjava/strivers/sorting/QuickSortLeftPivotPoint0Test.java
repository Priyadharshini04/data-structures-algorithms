package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;


public class QuickSortLeftPivotPoint0Test {

	@Test
	public void test1() {
		int[] oldarr={4,3,8,4,6,5};
		QuickSortLeftPivotPoint0.quickSort(oldarr, 0, 5);
		assertArrayEquals(new int[] {3,4,4,5,6,8}, oldarr);
	}
}
