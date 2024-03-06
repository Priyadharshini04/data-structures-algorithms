package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthMissingPositiveInteger_L1539Test {
	@Test
	public void test1() {
		int ans = KthMissingPositiveInteger_L1539.findKthPositive(new int[] { 2, 3, 4, 7, 11 }, 5);
		assertEquals(9, ans);
	}

	@Test
	public void test2() {
		int ans = KthMissingPositiveInteger_L1539.findKthPositive(new int[] { 1, 2, 3, 4 }, 2);
		assertEquals(6, ans);
	}

	@Test
	public void test3() {
		int ans = KthMissingPositiveInteger_L1539.findKthPositive(new int[] { 2 }, 1);
		assertEquals(1, ans);
	}
}
