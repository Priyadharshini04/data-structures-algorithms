package com.myjava.strivers.recursion;

import static org.junit.Assert.*;


import org.junit.Test;

public class PalindromeOfStringTest {

	@Test
	public void test1() {
		assertTrue(PalindromeOfString.isPalindrom("A man a plan a canal Panama"));
	}
	@Test
	public void test2()
	{
		assertFalse(PalindromeOfString.isPalindrom("race a car"));
	}
}
