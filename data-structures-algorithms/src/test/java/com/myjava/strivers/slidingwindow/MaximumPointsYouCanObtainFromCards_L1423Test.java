package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumPointsYouCanObtainFromCards_L1423Test {
	@Test
	public void test1() {
		assertEquals(12, MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 1, 2, 3, 4, 5, 6, 1 }, 3));
	}

	@Test
	public void test2() {
		assertEquals(4, MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 2, 2, 2 }, 2));
	}

	@Test
	public void test3() {
		assertEquals(55, MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 9, 7, 7, 9, 7, 7, 9 }, 7));
	}

	@Test
	public void test4() {
		assertEquals(248, MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 100, 40, 17, 9, 73, 75 }, 3));
	}

	@Test
	public void test5() {
		assertEquals(232,
				MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 11, 49, 100, 20, 86, 29, 72 }, 4));
	}

	@Test
	public void test6() {
		assertEquals(103, MaximumPointsYouCanObtainFromCards_L1423.maxScore(
				new int[] { 56, 27, 75, 44, 38, 78, 12, 43, 2, 57, 71, 30, 78, 38, 60, 81, 61, 7, 23, 85, 28, 41, 47 },
				2));
	}

	@Test
	public void test7() {
		assertEquals(580, MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 57, 62, 46, 22, 9, 23, 14, 24,
				33, 10, 80, 95, 6, 54, 52, 12, 70, 7, 33, 98, 74, 17, 61, 20, 81 }, 11));
	}

	@Test
	public void test8() {
		assertEquals(536,
				MaximumPointsYouCanObtainFromCards_L1423.maxScore(new int[] { 96, 90, 41, 82, 39, 74, 64, 50, 30 }, 8));
	}
}
