package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PostfixToInfixTest {
	@Test
	public void test1()
	{
		assertEquals("((a+b)+c)", PostfixToInfix.postToInfix("ab+c+"));
	}
	@Test
	public void test2()
	{
		assertEquals("(A+((B/C)*(D-A)))", PostfixToInfix.postToInfix("ABC/DA-*+"));
	}
	@Test
	public void test3()
	{
		assertEquals("((((c*W)-D)-H)/L)", PostfixToInfix.postToInfix("cW*D-H-L/"));
	}
}
