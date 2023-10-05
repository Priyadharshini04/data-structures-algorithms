package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaxConsequetiveOnes_L1004Test {
	@Test
	public void test1()
	{
		assertEquals(6, MaxConsequetiveOnes_L1004.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0},2));
	}
	@Test
	public void test2()
	{
		assertEquals(10, MaxConsequetiveOnes_L1004.longestOnes(new int[] {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1},3));
	}
	@Test
	public void test3()
	{
		assertEquals(6, MaxConsequetiveOnes_L1004.longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0},2));
	}
	@Test
	public void test4()
	{
		assertEquals(5, MaxConsequetiveOnes_L1004.longestOnes(new int[] {0,0,1,1,1,0,0},2));
	}

	@Test
	public void test5()
	{
		assertEquals(3, MaxConsequetiveOnes_L1004.longestOnes(new int[] {0,0,1,1,1,0,0},0));
	}
}
