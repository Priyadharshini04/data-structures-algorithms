package com.myjava.strivers.heaps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class HandOfStraightsTest {
	@Test
	public void test1() {
		assertTrue(HandOfStraights.isNStraightHand(new int[] { 1, 2, 3, 6, 2, 3, 4, 7, 8 }, 3));
	}

	@Test
	public void test2() {
		assertTrue(HandOfStraights.isNStraightHand(new int[] { 1, 2, 3, 2, 3, 4, 2, 3, 4, 6, 7, 8 }, 3));
	}

	@Test
	public void test3() {
		assertFalse(HandOfStraights.isNStraightHand(new int[] { 8, 10, 12 }, 3));
	}
}
