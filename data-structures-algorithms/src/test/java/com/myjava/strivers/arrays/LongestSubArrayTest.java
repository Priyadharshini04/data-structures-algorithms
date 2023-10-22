package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubArrayTest {
	@Test
	public void test1() {
		assertEquals(1, LongestSubArray.findLong(new int[] { 1, 2, 1, 3 }, 2));
		assertEquals(21, LongestSubArray.findLong(new int[] { 0, 2, 5, 3, 3, 4, 4, 3, 0, 5, 5, 4, 4, 4, 3, 2, 0, 2, 3,
				1, 3, 0, 4, 3, 1, 4, 5, 2, 4, 3, 1, 4, 5, 0, 3, 4, 0 }, 52));
		assertEquals(6, LongestSubArray.findLong(new int[] { -1, 0, 1, 1, -1, -1, 0 }, 0));
		assertEquals(5, LongestSubArray.findLong(new int[] { 0, 1, 1, 2, 0, 3 }, 4));

		assertEquals(19,
				LongestSubArray.findLong(new int[] { 3, 2, 2, 0, 1, 2, 1, 0, 1, 0, 3, 3, 5, 4, 5, 4, 5, 1, 4, 1, 3, 1,
						1, 4, 3, 2, 3, 2, 0, 0, 1, 2, 4, 5, 0, 1, 0, 2, 2, 0, 3, 1, 0, 0, 3, 5, 4, 4, 3, 3, 4, 3, 0, 3,
						4, 1, 1, 0, 0, 2 }, 28));
		assertEquals(2, LongestSubArray.findLong(new int[] { 8, 15, 17, 0, 11 }, 17));
	}
	
	@Test
	public void test2() {
		assertEquals(1, LongestSubArray.findLongBetter(new int[] { 1, 2, 1, 3 }, 2));
		assertEquals(21, LongestSubArray.findLongBetter(new int[] { 0, 2, 5, 3, 3, 4, 4, 3, 0, 5, 5, 4, 4, 4, 3, 2, 0, 2, 3,
				1, 3, 0, 4, 3, 1, 4, 5, 2, 4, 3, 1, 4, 5, 0, 3, 4, 0 }, 52));
		assertEquals(6, LongestSubArray.findLongBetter(new int[] { -1, 0, 1, 1, -1, -1, 0 }, 0));
		assertEquals(5, LongestSubArray.findLongBetter(new int[] { 0, 1, 1, 2, 0, 3 }, 4));

		assertEquals(19,
				LongestSubArray.findLongBetter(new int[] { 3, 2, 2, 0, 1, 2, 1, 0, 1, 0, 3, 3, 5, 4, 5, 4, 5, 1, 4, 1, 3, 1,
						1, 4, 3, 2, 3, 2, 0, 0, 1, 2, 4, 5, 0, 1, 0, 2, 2, 0, 3, 1, 0, 0, 3, 5, 4, 4, 3, 3, 4, 3, 0, 3,
						4, 1, 1, 0, 0, 2 }, 28));
		assertEquals(2, LongestSubArray.findLongBetter(new int[] { 8, 15, 17, 0, 11 }, 17));
	}
	
	@Test
	public void test3() {
		assertEquals(1, LongestSubArray.findLongOpti(new int[] { 1, 2, 1, 3 }, 2));
		assertEquals(1, LongestSubArray.findLongOpti(new int[] { 12,13,14,15,16,17,27,2 }, 2));
		assertEquals(21, LongestSubArray.findLongOpti(new int[] { 0, 2, 5, 3, 3, 4, 4, 3, 0, 5, 5, 4, 4, 4, 3, 2, 0, 2, 3,
				1, 3, 0, 4, 3, 1, 4, 5, 2, 4, 3, 1, 4, 5, 0, 3, 4, 0 }, 52));
		assertEquals(6, LongestSubArray.findLongOpti(new int[] { -1, 0, 1, 1, -1, -1, 0 }, 0));
		assertEquals(5, LongestSubArray.findLongOpti(new int[] { 0, 1, 1, 2, 0, 3 }, 4));

		assertEquals(19,
				LongestSubArray.findLongOpti(new int[] { 3, 2, 2, 0, 1, 2, 1, 0, 1, 0, 3, 3, 5, 4, 5, 4, 5, 1, 4, 1, 3, 1,
						1, 4, 3, 2, 3, 2, 0, 0, 1, 2, 4, 5, 0, 1, 0, 2, 2, 0, 3, 1, 0, 0, 3, 5, 4, 4, 3, 3, 4, 3, 0, 3,
						4, 1, 1, 0, 0, 2 }, 28));
		assertEquals(2, LongestSubArray.findLongOpti(new int[] { 8, 15, 17, 0, 11 }, 17));
	}
	
	@Test
	public void test4() {
		assertEquals(1, LongestSubArray.longestSubarrayWithSumK(new int[] { 1, 2, 1, 3 }, 2));
		assertEquals(21, LongestSubArray.longestSubarrayWithSumK(new int[] { 0, 2, 5, 3, 3, 4, 4, 3, 0, 5, 5, 4, 4, 4, 3, 2, 0, 2, 3,
				1, 3, 0, 4, 3, 1, 4, 5, 2, 4, 3, 1, 4, 5, 0, 3, 4, 0 }, 52));
//		assertEquals(6, LongestSubArray.longestSubarrayWithSumK(new int[] { -1, 0, 1, 1, -1, -1, 0 }, 0));
		assertEquals(5, LongestSubArray.longestSubarrayWithSumK(new int[] { 0, 1, 1, 2, 0, 3 }, 4));

		assertEquals(19,
				LongestSubArray.longestSubarrayWithSumK(new int[] { 3, 2, 2, 0, 1, 2, 1, 0, 1, 0, 3, 3, 5, 4, 5, 4, 5, 1, 4, 1, 3, 1,
						1, 4, 3, 2, 3, 2, 0, 0, 1, 2, 4, 5, 0, 1, 0, 2, 2, 0, 3, 1, 0, 0, 3, 5, 4, 4, 3, 3, 4, 3, 0, 3,
						4, 1, 1, 0, 0, 2 }, 28));
		assertEquals(2, LongestSubArray.longestSubarrayWithSumK(new int[] { 8, 15, 17, 0, 11 }, 17));
	}
}
