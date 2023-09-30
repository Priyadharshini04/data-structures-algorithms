package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestRectangleInHistogramTest {
	@Test
	public void test1()
	{
		assertEquals(10, LargestRectangleInHistogram.largestArea(new int[] {2,1,5,6,2,3}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(4, LargestRectangleInHistogram.largestArea(new int[] {2,4}));
	}
	
	@Test
	public void test3()
	{
		assertEquals(2, LargestRectangleInHistogram.largestArea(new int[] {1,1}));
	}
}
