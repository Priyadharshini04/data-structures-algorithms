package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumAverageSubarrayI_L643Test {
	@Test
	public void test1()
	{
		//assertEquals(double expected, double actual, double delta)
		assertEquals(12.75000, MaximumAverageSubarrayI_L643.findMaxAverage(new int[] {1,12,-5,-6,50,3},4),0.00001);
	}
}
