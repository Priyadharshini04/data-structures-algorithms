package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleElementTest {
	@Test
	public void test1()
	{
		assertEquals(2, SingleElement.find(new int[] {1,1,2,3,3,4,4,8,8}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(10, SingleElement.find(new int[] {3,3,7,7,10,11,11}));
	}
	
	@Test
	public void test3()
	{
		assertEquals(2, SingleElement.find(new int[] {1,1,2}));
	}
	
	@Test
	public void test4()
	{
		assertEquals(1, SingleElement.find(new int[] {1,2,2,3,3}));
	}
	
	@Test
	public void test5()
	{
		assertEquals(10, SingleElement.find(new int[] {7,7,10,11,11,12,12}));
	}
	
	
	
}
