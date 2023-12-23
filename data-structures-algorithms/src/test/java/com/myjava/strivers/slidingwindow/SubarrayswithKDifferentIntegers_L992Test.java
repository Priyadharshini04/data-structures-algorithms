package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubarrayswithKDifferentIntegers_L992Test {
	@Test
	public void test1() {
		int result = SubarrayswithKDifferentIntegers_L992.subarraysWithKDistinct(new int[] { 1, 2, 1, 2, 3 }, 2);
		assertEquals(7, result);
	}
}
