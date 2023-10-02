package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RemoveKDigitsTest {
	@Test
	public void test1()
	{
		assertEquals("1219",RemoveKDigits.removeKdigits("1432219",3));
	}
	@Test
	public void test2()
	{
		assertEquals("200",RemoveKDigits.removeKdigits("10200",1));
	}
	@Test
	public void test3()
	{
		assertEquals("0",RemoveKDigits.removeKdigits("10",2));
	}
	@Test
	public void test4()
	{
		assertEquals("11",RemoveKDigits.removeKdigits("112",1));
	}
}
