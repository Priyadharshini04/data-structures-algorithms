package com.myjava.strivers.sorting;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class QuickSortTest {

	@Test
	public void main() {
		int[] oldarr={4,3,8,4,6,5};
		QuickSort.sortQuick(oldarr, 0, 5);
	    assertArrayEquals(new int[] {3,4,4,5,6,8}, oldarr);
	}
}
