package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class StartEndPositionTest {
	
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {3,5}, StartEndPosition.findStartandEndPosition(new int[] {5,7,7,8,8,8,10},8));
	}
	
	@Test
	public void test2()
	{
		assertArrayEquals(new int[] {-1,-1}, StartEndPosition.findStartandEndPosition(new int[] {5,7,7,8,8,8,10},4));
	}
	
	@Test
	public void test3()
	{
		assertArrayEquals(new int[] {0,0}, StartEndPosition.findStartandEndPosition(new int[] {5,7,7,8,8,8,10},5));
	}
	
	@Test
	public void test4()
	{
		assertArrayEquals(new int[] {3,4}, StartEndPosition.findStartandEndPosition(new int[] {5,7,7,8,8,10},8));
	}
	
	@Test
	public void test5()
	{
		assertArrayEquals(new int[] {0,3}, StartEndPosition.findStartandEndPosition(new int[] {1,1,1,1,2},1));
	}
	
	@Test
	public void test6()
	{
		assertArrayEquals(new int[] {1,4}, StartEndPosition.findStartandEndPosition(new int[] {1,2,2,2,2},2));
	}
}
