package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class StackSpanTest {
	@Test
	public void test1() {
		int[] ans = StackSpan.calculateSpan(new int[] { 100, 80, 60, 70, 60, 75, 85 });
		int[] exp = new int[] { 1, 1, 1, 2, 1, 4, 6 };
		assertArrayEquals(ans, exp);
	}

	@Test
	public void test2() {
		int[] ans = StackSpan.calculateSpan(new int[] { 68, 735, 101, 770, 525, 279 });
		int[] exp = new int[] { 1, 2, 1, 4, 1, 1 };
		// 1 2 1 4 1 1
		assertArrayEquals(exp, ans);
	}
}
