package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class TwoSumTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {0,2}, TwoSum.twoSum(new int[] {2,11,7,15},9));
	}
	@Test
	public void test2()
	{
		assertArrayEquals(new int[] {0,2}, TwoSum.twoSum(new int[] {2,7,2,15},4));
	}
}
