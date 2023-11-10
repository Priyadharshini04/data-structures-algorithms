package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxProductSubArrayTest {
	@Test
	public void test1() {
		assertEquals(6, MaxProductSubArray.maxProduct(new int[] { 2, 3, -2, 4 }));
	}

	@Test
	public void test2() {
		assertEquals(0, MaxProductSubArray.maxProduct(new int[] { -2, 0, -1 }));
	}

	@Test
	public void test3() {
		assertEquals(6, MaxProductSubArray.maxProduct(new int[] { -2, 0, -1, 3, 2 }));
	}

	@Test
	public void test4() {
		assertEquals(6, MaxProductSubArray.maxProduct(new int[] { -3, -1, -1, -2 }));
	}

	@Test
	public void test5() {
		assertEquals(24, MaxProductSubArray.maxProduct(new int[] { 2, -5, -2, -4, 3 }));
	}

	@Test
	public void test6() {
		assertEquals(-2, MaxProductSubArray.maxProduct(new int[] { -2 }));
	}

	@Test
	public void test7() {
		assertEquals(1, MaxProductSubArray.maxProduct(new int[] { -3, 0, 1, -2 }));
	}

	@Test
	public void test8() {
		assertEquals(6, MaxProductSubArray.maxProduct(new int[] { -1, -2, -3, 0 }));
	}
}
