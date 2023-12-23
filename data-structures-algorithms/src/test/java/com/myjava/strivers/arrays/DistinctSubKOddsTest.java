package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DistinctSubKOddsTest {
	@Test
	public void test1() {
		assertEquals(4, DistinctSubKOdds.distinctSubKOdds(new int[] { 3, 2, 3 }, 1));
	}

	@Test
	public void test2() {
		assertEquals(4, DistinctSubKOdds.distinctSubKOdds(new int[] { 2, 1, 1, 1, 4 }, 2));
	}

	@Test
	public void test3() {
		assertEquals(2, DistinctSubKOdds.distinctSubKOdds(new int[] { 1, 3, 1 }, 2));
	}

	@Test
	public void test4() {
		assertEquals(2, DistinctSubKOdds.distinctSubKOdds(new int[] { 1, 1, 2, 1, 1 }, 3));
	}
}
