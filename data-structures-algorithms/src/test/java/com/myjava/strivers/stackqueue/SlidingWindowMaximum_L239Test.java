package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SlidingWindowMaximum_L239Test {
	@Test
	public void test1() {
		int[] result = SlidingWindowMaximum_L239.maxSlidingWindow(new int[] { 1, 3, -1, -3, 5, 3, 6, 7 }, 3);
		assertArrayEquals(new int[] { 3, 3, 5, 5, 6, 7 }, result);
	}

	@Test
	public void test2() {
		int[] result = SlidingWindowMaximum_L239.maxSlidingWindow(new int[] { 1, 3, 1, 2, 0, 5 }, 3);
		assertArrayEquals(new int[] { 3, 3, 2, 5 }, result);
	}
}
