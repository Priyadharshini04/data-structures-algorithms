package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RainWaterTrapTest {
	@Test
	public void test1()
	{
		assertEquals(6, RainWaterTrap.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(9, RainWaterTrap.trap(new int[] {4,2,0,3,2,5}));
	}
}
