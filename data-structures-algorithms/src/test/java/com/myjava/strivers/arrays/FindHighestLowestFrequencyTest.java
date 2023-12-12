package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FindHighestLowestFrequencyTest {
	@Test
	public void test1() {
		int[] result = FindHighestLowestFrequency.findFreq(new int[] { 1, 2, 3, 1, 1, 4 });
		assertArrayEquals(new int[] { 1, 2 }, result);
	}

	@Test
	public void test2() {
		int[] result = FindHighestLowestFrequency.findFreq(new int[] { 3, 10, 3, 3, 10, 10 });
		assertArrayEquals(new int[] { 3, 3 }, result);
	}

	@Test
	public void test3() {
		int[] result = FindHighestLowestFrequency.findFreq(new int[] { 8, 16, 19, 6, 1, 10, 19 });
		assertArrayEquals(new int[] { 19, 1 }, result);
	}
}
