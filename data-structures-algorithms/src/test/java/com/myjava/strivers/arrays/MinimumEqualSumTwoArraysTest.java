package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumEqualSumTwoArraysTest {
	@Test
	public void test1() {
		assertEquals(179,
				new MinimumEqualSumTwoArrays().minSum(
						new int[] { 8, 13, 15, 18, 0, 18, 0, 0, 5, 20, 12, 27, 3, 14, 22, 0 },
						new int[] { 29, 1, 6, 0, 10, 24, 27, 17, 14, 13, 2, 19, 2, 11 }));
	}

	@Test
	public void test2() {
		assertEquals(-1, new MinimumEqualSumTwoArrays().minSum(new int[] { 9, 5 },
				new int[] { 15, 12, 5, 21, 4, 26, 27, 9, 6, 29, 0, 18, 16, 0, 0, 0, 20 }));
	}

	@Test
	public void test3() {
		assertEquals(-1, new MinimumEqualSumTwoArrays().minSum(new int[] { 0, 0, 10, 10, 12, 0, 13, 6, 0, 2, 10 },
				new int[] { 24, 5, 12, 22 }));
	}
	
	@Test
	public void test4() {
		assertEquals(169, new MinimumEqualSumTwoArrays().minSum(new int[] { 20,0,18,11,0,0,0,0,0,0,17,28,0,11,10,0,0,15,29 },
				new int[] { 16,9,25,16,1,9,20,28,8,0,1,0,1,27 }));
	}
	
	@Test
	public void test5() {
		assertEquals(12, new MinimumEqualSumTwoArrays().minSum(new int[] { 3,2,0,1,0 },
				new int[] { 6,5,0 }));
	}
}
