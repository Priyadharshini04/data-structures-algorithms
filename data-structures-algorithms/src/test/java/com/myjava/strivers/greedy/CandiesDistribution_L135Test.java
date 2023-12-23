package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CandiesDistribution_L135Test {
	@Test
	public void test1() {
		assertEquals(21, CandiesDistribution_L135.candy(new int[] { 6, 5, 4, 3, 2, 1 }));
	}

	@Test
	public void test2() {
		assertEquals(5, CandiesDistribution_L135.candy(new int[] { 1, 0, 2 }));
	}
}
