package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ValidParenthesesTest {
	@Test
	public void test1()
	{
		assertTrue(ValidParentheses.isValid("()"));
	}
	
	@Test
	public void test2()
	{
		assertTrue(ValidParentheses.isValid("(){}[]"));
	}
	
	@Test
	public void test3()
	{
		assertFalse(ValidParentheses.isValid("(]"));
	}
	
	@Test
	public void test4()
	{
		assertTrue(ValidParentheses.isValid("{[]}"));
	}
	
	@Test
	public void test5()
	{
		assertFalse(ValidParentheses.isValid("{[}}"));
	}
}
