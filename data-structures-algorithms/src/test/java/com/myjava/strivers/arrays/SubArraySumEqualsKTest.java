package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubArraySumEqualsKTest {
	@Test
	public void test1() {
		assertEquals(2,SubArraySumEqualsK.subarraySum(new int[] { 1, 2, 3 }, 3));
	}
	
	@Test
	public void test2() {
		assertEquals(3,SubArraySumEqualsK.subarraySum(new int[] { 1, -1, 0 }, 0));
	}
	
	@Test
	public void test3() {
		assertEquals(9,SubArraySumEqualsK.subarraySum(new int[] { -1, 0, 1, 1, -1, -1, 0 }, 0));
	}
}
