package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfSubArrayMinTest {
	@Test
	public void test1()
	{
		assertEquals(17, SumOfSubArrayMin.sumSubarrayMin(new int[] {3,1,2,4}));
	}
}
