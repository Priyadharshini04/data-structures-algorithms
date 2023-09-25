package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostFixToPrefixTest {
	@Test
	public void test1()
	{
		assertEquals("+a*bc",PostFixToPrefix.postfixToPrefix("abc*+"));
	}
	@Test
	public void test2()
	{
		assertEquals("-+abc",PostFixToPrefix.postfixToPrefix("ab+c-"));
	}
	@Test
	public void test3()
	{
		assertEquals("*+ab-cd",PostFixToPrefix.postfixToPrefix("ab+cd-*"));
	}
}
