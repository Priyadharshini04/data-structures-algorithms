package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KokoEatingBananas_L875Test {
	@Test
	public void test1() {
		int minSpeed = KokoEatingBananas_L875.minSpeed(new int[] { 3, 6, 7, 11 }, 8);
		assertEquals(4, minSpeed);
	}

	@Test
	public void test2() {
		int minSpeed = KokoEatingBananas_L875.minSpeed(new int[] { 312884470 }, 968709470);
		assertEquals(1, minSpeed);
	}
}
