package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringToIntegerTest {
	@Test
	public void test1()
	{
		assertEquals(42, StringToInteger.myAtoi("42"));
	}
	
	@Test
	public void test2()
	{
		assertEquals(-42, StringToInteger.myAtoi("   -42"));
	}
	
	
	@Test
	public void test3()
	{
		assertEquals(4193, StringToInteger.myAtoi("4193 with words"));
	}
	
	@Test
	public void test4()
	{
		assertEquals(0, StringToInteger.myAtoi("words and 987"));
	}
	
	@Test
	public void test5()
	{
		assertEquals(Integer.MIN_VALUE, StringToInteger.myAtoi("-91283472332"));
	}
	
	@Test
	public void test6()
	{
		assertEquals(0, StringToInteger.myAtoi("0.1"));
	}
	
	@Test
	public void test7()
	{
		assertEquals(0, StringToInteger.myAtoi("+-12"));
	}
	
	@Test
	public void test8()
	{
		assertEquals(1, StringToInteger.myAtoi("+1"));
	}
	
	@Test
	public void test9()
	{
		assertEquals(0, StringToInteger.myAtoi("-abc"));
	}
	
	@Test
	public void test10()
	{
		assertEquals(2147483647, StringToInteger.myAtoi("2147483648"));
	}
	
	@Test
	public void test11()
	{
		assertEquals(2147483646, StringToInteger.myAtoi("2147483646"));
	}
}
