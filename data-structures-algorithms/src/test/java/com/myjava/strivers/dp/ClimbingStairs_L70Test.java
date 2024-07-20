package com.myjava.strivers.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ClimbingStairs_L70Test {
	@Test
	public void test1()
	{
		int result  = ClimbingStairs_L70.climb(5);
		assertEquals(8, result);
	}
}
