package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CoinsChangeLeetCode_L322Test {
	@Test
	public void test1() {
		assertEquals(3, CoinsChangeLeetCode_L322.coinChange(new int[] { 1, 2, 5 }, 11));
	}

	@Test
	public void test2() {
		assertEquals(-1, CoinsChangeLeetCode_L322.coinChange(new int[] { 2 }, 3));
	}

	@Test
	public void test3() {
		assertEquals(20, CoinsChangeLeetCode_L322.coinChange(new int[] { 186, 419, 83, 408 }, 6249));
	}
}
