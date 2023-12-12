package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FrequencyMostFrequentElement_L1838Test {
	@Test
	public void test1() {
		int maxFre = FrequencyMostFrequentElement_L1838.maxFrequency(new int[] { 1, 2, 4 }, 5);
		assertEquals(3, maxFre);
	}

	@Test
	public void test2() {
		int maxFre = FrequencyMostFrequentElement_L1838.maxFrequency(new int[] { 1, 1, 1, 1, 10 }, 1);
		assertEquals(4, maxFre);
	}
}
