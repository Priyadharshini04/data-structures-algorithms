package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MissingNumberInArrayTest {
	@Test
	public void test1()
	{
	  assertEquals(5, MissingNumberInArray.missingNumber(new int[] {40,43,42,18,6,13,19,8,44,4,12,22,31,30,10,16,3,17,25,7,41,21,48,26,32,27,49,15,1,20,35,46,11,23,2,0,38,28,37,9,39,47,36,45,24,34,29,14,33}));
	}
	
	@Test
	public void test2()
	{
	  assertEquals(5, MissingNumberInArray.missingNumberOptimized(new int[] {40,43,42,18,6,13,19,8,44,4,12,22,31,30,10,16,3,17,25,7,41,21,48,26,32,27,49,15,1,20,35,46,11,23,2,0,38,28,37,9,39,47,36,45,24,34,29,14,33}));
	}
}
