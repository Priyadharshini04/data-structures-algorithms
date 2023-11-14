package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxSpendingTest {
	@Test
	public void test1() {
		assertEquals(386, new MaxSpending().maxSpending(new int[][] { { 10, 8, 6, 4, 2 }, { 9, 7, 5, 3, 2 } }));
	}

	@Test
	public void test2() {
		assertEquals(285, new MaxSpending().maxSpending(new int[][] { { 8, 5, 2 }, { 6, 4, 1 }, { 9, 7, 3 } }));
	}
}
