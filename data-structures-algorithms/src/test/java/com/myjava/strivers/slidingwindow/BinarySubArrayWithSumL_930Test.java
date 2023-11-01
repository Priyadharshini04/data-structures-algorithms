package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BinarySubArrayWithSumL_930Test {
	@Test
	public void test1()
	{
		assertEquals(4, BinarySubArrayWithSumL_930.numSubarraysWithSum(new int[] {1,0,1,0,1}, 2));
	}
	
	@Test
	public void test2()
	{
		assertEquals(15, BinarySubArrayWithSumL_930.numSubarraysWithSum(new int[] {0,0,0,0,0}, 0));
	}
	
	@Test
	public void test3()
	{
		assertEquals(4, BinarySubArrayWithSumL_930.numSubarraysWithSum(new int[] {0,1,0,1,0}, 2));
	}
	
	@Test
	public void test4()
	{
		assertEquals(8, BinarySubArrayWithSumL_930.numSubarraysWithSum(new int[] {0,1,0,1,0}, 1));
	}
	
	@Test
	public void test5()
	{
		assertEquals(3, BinarySubArrayWithSumL_930.numSubarraysWithSum(new int[] {0,1,0,1,0}, 0));
	}
}
