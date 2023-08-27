package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BuySellStockTest {
	@Test
	public void test1()
	{
		assertEquals(5,BuySellStock.maxProfit(new int[] {7,4,6,3,1}));
	}
}
