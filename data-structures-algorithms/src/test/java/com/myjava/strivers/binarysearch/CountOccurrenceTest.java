package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountOccurrenceTest {
	@Test
	public void test1()
	{
		assertEquals(2,CountOccurence.findOccurrence(new int[] {1,1,1,2,2,3,3},3));
	}
	
	@Test
	public void test2()
	{
		assertEquals(2,CountOccurence.findOccurrence(new int[] {1,1,1,2,2,3,3,4,4},2));
	}
	
	@Test
	public void test3()
	{
		assertEquals(6,CountOccurence.findOccurrence(new int[] {2,4,10,10,10,10,10,10,11,12,14,14,17,19,19},10)); 
	}
}
