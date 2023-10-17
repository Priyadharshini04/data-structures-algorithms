package com.myjava.strivers.heaps;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NearlyKSortedTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[] { 2, 3, 5, 6, 8, 9, 10 },
				NearlyKSorted.nearlySorted(new int[] { 6, 5, 3, 2, 8, 10, 9 }, 3));
	}
}
