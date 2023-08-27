package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CheckArrayIsSortedTest {
	@Test
	public void test1()
	{
		assertEquals(1, CheckArrayIsSorted.isSorted(5, new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(0,  CheckArrayIsSorted.isSorted(5, new int[] {1,2,4,3,5}));
	}
}
