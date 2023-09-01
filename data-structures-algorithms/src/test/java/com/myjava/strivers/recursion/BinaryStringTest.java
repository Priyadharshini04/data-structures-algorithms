package com.myjava.strivers.recursion;


import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class BinaryStringTest {
	@Test
	public void test1()
	{
		assertEquals(Arrays.asList("000","001","010","100","101"), BinaryString.generateString(3));
	}
	
	@Test
	public void test2()
	{
		assertEquals(0, BinaryString.generateString(0).size());
	}
	
	@Test
	public void test3()
	{
		assertEquals(Arrays.asList("00","01","10"), BinaryString.generateString(2));
	}
}	
