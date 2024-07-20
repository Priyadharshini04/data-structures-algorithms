package com.myjava.strivers.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EnergyFrog_GFGTest {
	@Test
	public void test1()
	{
		int result = EnergyFrog_GFG.getMinEnery(new int[] {10,20,30,10});
		assertEquals(20, result);
	}
	@Test
	public void test2()
	{
		int result = EnergyFrog_GFG.getMinEnery(new int[] {10,50,10});
		assertEquals(0, result);
	}
	
	@Test
	public void test3()
	{
		int result = EnergyFrog_GFG.getMinEnery(new int[] {7, 4, 4, 2, 6, 6, 3, 4});
		assertEquals(7, result);
	}
}
