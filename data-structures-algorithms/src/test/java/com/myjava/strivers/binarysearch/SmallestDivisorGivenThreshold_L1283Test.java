package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SmallestDivisorGivenThreshold_L1283Test {
	@Test
	public void test1() {
		int ans = SmallestDivisorGivenThreshold_L1283.smallestDivisor(new int[] { 1, 2, 5, 9 }, 6);
		assertEquals(5, ans);
	}
}
