package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class NextGreatArrayCircular_LC_503Test {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {2,5,-1,5,5}, NextGreatArrayCircular_LC_503.nextGreaterElements(new int[] {1,2,5,4,3}));
	}
	
	@Test
	public void test2()
	{
		assertArrayEquals(new int[] {2,-1,2}, NextGreatArrayCircular_LC_503.nextGreaterElements(new int[] {1,2,1}));
	}
	
	@Test
	public void test3()
	{
		assertArrayEquals(new int[] {2,3,4,-1,4}, NextGreatArrayCircular_LC_503.nextGreaterElements(new int[] {1,2,3,4,3}));
	}
	
	@Test
	public void test4()
	{
		assertArrayEquals(new int[] {120,11,120,120,123,123,-1,100,100,100}, NextGreatArrayCircular_LC_503.nextGreaterElements(new int[] {100,1,11,1,120,111,123,1,-1,-100}));
	}
}
