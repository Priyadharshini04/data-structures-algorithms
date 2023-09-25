package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrefixToPostfixTest {
	@Test
	public void test1()
	{
		assertEquals("ABC+/", PrefixToPostfix.preToPost("/A+BC"));
	}
	@Test
	public void test2()
	{
		assertEquals("ABC+/DE+-", PrefixToPostfix.preToPost("-/A+BC+DE"));
	}
	@Test
	public void test3()
	{
		assertEquals("ABC+/", PrefixToPostfix.preToPost("/A+BC"));
	}
}
