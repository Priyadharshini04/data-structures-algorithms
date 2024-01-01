package com.myjava.strivers.heaps;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class KFrequentElementsTest {
	@Test
	public void test1() {
		int[] result = KFrequentElements.topKFrequent(new int[] { 1, 1, 1, 2, 2, 3 }, 2);
		assertArrayEquals(new int[] { 1, 2 }, result);
	}

	@Test
	public void test2() {
		int[] result = KFrequentElements.topKFrequent(new int[] { 1 }, 1);
		assertArrayEquals(new int[] { 1 }, result);
	}

	@Test
	public void test3() {
		int[] result = KFrequentElements.topKFrequent(new int[] { 1, 2 }, 1);
		assertArrayEquals(new int[] { 1, 2 }, result);
	}

	@Test
	public void test4() {
		int[] result = KFrequentElements.topKFrequent(new int[] { 1, 2 }, 2);
		assertArrayEquals(new int[] { 1, 2 }, result);
	}

	@Test
	public void test5() {
		int[] result = KFrequentElements.topKFrequent(new int[] { -1, -1 }, 1);
		assertArrayEquals(new int[] { -1 }, result);
	}

	@Test
	public void test6() {
		int[] result = KFrequentElements.topKFrequent(new int[] { 3, 0, 1, 0 }, 1);
		assertArrayEquals(new int[] { 0 }, result);
	}
}
