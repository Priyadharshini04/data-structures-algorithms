package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MergeOverlappingIntervals_L56Test {
	@Test
	public void test1() {
		int[][] result = MergeOverlappingIntervals_L56.merge(new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } });

		assertArrayEquals(new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } }, result);
	}

	@Test
	public void test2() {
		int[][] result = MergeOverlappingIntervals_L56.merge(new int[][] { { 1, 4 }, { 2, 3 } });

		assertArrayEquals(new int[][] { { 1, 4 } }, result);
	}
}
