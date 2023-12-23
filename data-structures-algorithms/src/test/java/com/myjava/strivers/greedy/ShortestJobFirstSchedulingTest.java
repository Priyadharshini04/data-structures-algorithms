package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ShortestJobFirstSchedulingTest {
	@Test
	public void test1() {
		float result = ShortestJobFirstScheduling.sjf(new int[] { 0, 0, 0 }, new int[] { 3, 1, 2 });
		float expected = 1.33f;
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void test2() {
		float result = ShortestJobFirstScheduling.sjf(new int[] { 12, 29, 25, 22, 4, 24, 29, 10, 11 },
				new int[] { 26, 11, 14, 3, 21, 6, 28, 29, 7 });
		float expected = 32.89f;
		assertEquals(expected, result, 0.01);
	}

	@Test
	public void test3() {
		float result = ShortestJobFirstScheduling.sjf(new int[] { 0, 1 }, new int[] { 3, 3 });
		float expected = 1.00f;
		assertEquals(expected, result, 0.001);
	}
}
