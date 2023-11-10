package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinLenSubArray_L209Test {
	@Test
	public void test1() {
		assertEquals(1, MinLenSubArray_L209.minSubArrayLen(7, new int[] { 2, 3, 1, 0, 7, 0 }));
	}

	@Test
	public void test2() {
		assertEquals(1, MinLenSubArray_L209.minSubArrayLen(7, new int[] { 2, 3, 1, 1, 7, 1 }));
	}

	@Test
	public void test3() {
		assertEquals(2, MinLenSubArray_L209.minSubArrayLen(7, new int[] { 2, 3, 1, 4, 3, 0 }));
	}

	@Test
	public void test4() {
		assertEquals(0, MinLenSubArray_L209.minSubArrayLen(40, new int[] { 2, 3, 1, 4, 3, 0 }));
	}
}
