package com.myjava.strivers.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckArrayRotatedSortedTest {
	@Test
	public void test1() {
		assertTrue(CheckArrayRotatedSorted.checkRotatedAndSorted(new int[] { 5, 6, 1, 2, 3, 4 }));
	}

	@Test
	public void test2() {
		assertFalse(CheckArrayRotatedSorted.checkRotatedAndSorted(new int[] { 10, 20, 30, 14 }));
	}
	// 30 20 14 10

	@Test
	public void test3() {
		assertTrue(CheckArrayRotatedSorted.checkRotatedAndSorted(new int[] { 10, 20, 14 }));
	}
}
// 10 14 20
// 20 14 10