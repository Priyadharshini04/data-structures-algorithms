package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TotalBuySellStockTest {
	@Test
	public void test1()
	{
			assertEquals(5,TotalBuySellStock.maxProfit(new int[] {1,2,3,4,5}));
	}
}
