package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumSubSequenceSubArrayTest {
	@Test
	public void test1() {
		assertEquals(2, MinimumSubSequenceSubArray.minimumSubarray(4, -9, 5, new int[] { 1, -5, 5, -10 }));
	}

	@Test
	public void test2() {
		assertEquals(2, MinimumSubSequenceSubArray.minimumSubarray(6, -3, 4, new int[] { -3, 6, 3, 2, -5, -10 }));
	}

	@Test
	public void test3() {
		assertEquals(5, MinimumSubSequenceSubArray.minimumSubarray(6, -7, 9, new int[] { -3, 6, 3, 2, -5, -10 }));
	}
}
