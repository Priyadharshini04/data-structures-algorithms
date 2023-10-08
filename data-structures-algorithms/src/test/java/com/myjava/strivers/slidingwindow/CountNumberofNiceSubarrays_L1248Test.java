package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountNumberofNiceSubarrays_L1248Test {
	@Test
	public void test1()
	{
		assertEquals(2, CountNumberofNiceSubarrays_L1248.numberOfSubarrays(new int[] {1,1,2,1,1},3));
	}
	
	@Test
	public void test2()
	{
		assertEquals(0, CountNumberofNiceSubarrays_L1248.numberOfSubarrays(new int[] {2,4,6},1));
	}
	
	@Test
	public void test3()
	{
		assertEquals(16, CountNumberofNiceSubarrays_L1248.numberOfSubarrays(new int[] {2,2,2,1,2,2,1,2,2,2},2));
	}
}
