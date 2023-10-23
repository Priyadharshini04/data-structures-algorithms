package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Sort012Test {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {0,0,1,1,2,2}, Sort012.sortColors(new int[] {2,0,2,1,1,0}));
	}
	
	@Test
	public void test2()
	{
		assertArrayEquals(new int[] {0,1,2}, Sort012.sortColors(new int[] {2,0,1}));
	}
}
