package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculateMinPlatformsTest {
	@Test
	public void test1() {
		int result = CalculateMinPlatforms.findPlatform(new int[] { 900, 940, 950, 1100, 1500, 1800 },
				new int[] { 910, 1200, 1120, 1130, 1900, 2000 });
		assertEquals(3, result);
	}

	@Test
	public void test2() {
		int result = CalculateMinPlatforms.findPlatform(new int[] { 940, 900, 950, 1100, 1500, 1800 },
				new int[] { 1200, 910, 1120, 1130, 1900, 2000 });
		assertEquals(3, result);
	}

	@Test
	public void test3() {
		int result = CalculateMinPlatforms.findPlatform(new int[] { 100, 200, 300, 400 },
				new int[] { 200, 300, 400, 500 });
		assertEquals(2, result);
	}

	@Test
	public void test4() {
		int result = CalculateMinPlatforms.findPlatform(new int[] { 900, 940 }, new int[] { 910, 1200 });
		assertEquals(1, result);
	}
}
