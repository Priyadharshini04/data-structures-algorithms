package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindPeakElementTest {
	
	@Test
	public void test1()
	{
		assertEquals(5, FindPeakElement.find(new int[] {1,2,1,3,5,6,4}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(2, FindPeakElement.find(new int[] {1,2,3,1}));
	}
	
	@Test
	public void test3()
	{
		assertEquals(4, FindPeakElement.find(new int[] {1,2,3,4,5}));
	}
	
	@Test
	public void test4()
	{
		assertEquals(0, FindPeakElement.find(new int[] {1}));
	}
	
	@Test
	public void test5()
	{
		assertEquals(3, FindPeakElement.find(new int[] {1,2,3,4,3,2}));
	}
	
	@Test
	public void test6()
	{
		assertEquals(1, FindPeakElement.find(new int[] {3,4,3,2,1}));
	}

}
