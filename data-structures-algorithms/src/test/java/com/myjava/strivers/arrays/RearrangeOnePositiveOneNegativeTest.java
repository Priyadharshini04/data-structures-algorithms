package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RearrangeOnePositiveOneNegativeTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[] { 3, -2, 1, -5, 2, -4 },
				RearrangeOnePositiveOneNegative.rearrangeArray(new int[] { 3, 1, -2, -5, 2, -4 }));
	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] { 3, -2, 1, -5, 2, -4 },
				RearrangeOnePositiveOneNegative.rearrangeArrayOptimized(new int[] { 3, 1, -2, -5, 2, -4 }));
	}
}
