package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SumOfSubArrayRangesTest {
	@Test
	public void test1()
	{
		assertEquals(59, SumOfSubArrayRanges.subArrayRanges(new int[] {4,-2,-3,4,1}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(4, SumOfSubArrayRanges.subArrayRanges(new int[] {1,2,3}));
	}
}
