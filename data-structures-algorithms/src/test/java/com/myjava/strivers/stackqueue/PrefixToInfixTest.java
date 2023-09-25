package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrefixToInfixTest {
	@Test
	public void test1()
	{
		assertEquals("((a-b)/((c-d)+e))",PrefixToInfix.prefixToInfixConversion("/-ab+-cde"));
	}
	
	@Test
	public void test2()
	{
		assertEquals("((a-(b/c))*((d/k)-l))",PrefixToInfix.prefixToInfixConversion("*-a/bc-/dkl"));
	}
	
	@Test
	public void test3()
	{
		assertEquals("((a-(b/c))*((d/e)-l))",PrefixToInfix.prefixToInfixConversion("*-a/bc-/del"));
	}
}
