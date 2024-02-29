package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MinimumNumberOfDaysToMakeBouquets_L1482Test {
	@Test
	public void test1() {
		int minWaitingDays = MinimumNumberOfDaysToMakeBouquets_L1482.minDays(new int[] { 1, 10, 3, 10, 2 }, 3, 1);
		assertEquals(3, minWaitingDays);
	}

	@Test
	public void test2() {
		int minWaitingDays = MinimumNumberOfDaysToMakeBouquets_L1482.minDays(new int[] { 1, 10, 3, 10, 2 }, 3, 2);
		assertEquals(-1, minWaitingDays);
	}

	@Test
	public void test3() {
		int minWaitingDays = MinimumNumberOfDaysToMakeBouquets_L1482.minDays(new int[] { 7, 7, 7, 7, 12, 7, 7 }, 2, 3);
		assertEquals(12, minWaitingDays);
	}

	@Test
	public void test4() {
		int minWaitingDays = MinimumNumberOfDaysToMakeBouquets_L1482
				.minDays(new int[] { 5, 37, 55, 92, 22, 52, 31, 62, 99, 64, 92, 53, 34, 84, 93, 50, 28 }, 8, 2);
		assertEquals(93, minWaitingDays);
	}

	@Test
	public void test5() {
		int minWaitingDays = MinimumNumberOfDaysToMakeBouquets_L1482.minDays(
				new int[] { 81, 23, 10, 90, 68, 43, 81, 10, 92, 65, 47, 57, 51, 74, 61, 79, 18, 52, 74, 90 }, 2, 7);
		assertEquals(90, minWaitingDays);
	}
}
