package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSuccessiveElementsTest{
	@Test
	public void test1()
	{
		assertEquals(5, LongestSuccessiveElements.longestSuccessiveElements(new int[] {5,8,3,2,1,4}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(3, LongestSuccessiveElements.longestSuccessiveElements(new int[] {147,25,56,168,106,124,137,117,15,45,189,92,74,46,63,20,198,20,78,73,111,90,152,49,6,121,70,158,3,135,148,11,155,166,45,187,83,39,36,14,35,70,142,149,182,96,134,192,105,42,16,118,137,107,50,5,186,101,96,18,166,168,200,28,178,23,53,20,135,23,16,103}));
	}
}
