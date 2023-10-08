package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FruitsAndBasketsTest {
	@Test
	public void test1()
	{
		assertEquals(4, FruitsAndBaskets.findMaxFruits(new int[] {1,1,2,3,3,3}));
	}
	@Test
	public void test2()
	{
		assertEquals(2, FruitsAndBaskets.findMaxFruits(new int[] {1,2,3,4}));
	}
	@Test
	public void test3()
	{
		assertEquals(3, FruitsAndBaskets.findMaxFruits(new int[] {1,1,2,3}));
	}
	@Test
	public void test4()
	{
		assertEquals(4, FruitsAndBaskets.findMaxFruits(new int[] {10,8,25,3,23,3,3,28,2,24,7,2,22,12,18,16,1,16,6,1,6,20,10,3,3,10,25,5,14}));
	}
	@Test
	public void test5()
	{
		assertEquals(3, FruitsAndBaskets.findMaxFruits(new int[] {20,11,4,32,4,34,37,14,16,15,15,19,12,30,28,31,0,32,0,7,7,33,0,2,6,10,1,11,9,25,3,29,6,6,0,14,8,29}));
	}
}
