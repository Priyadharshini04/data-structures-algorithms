package com.myjava;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReverseNumberTest {
	@Test
	public void test1()
	{
		assertEquals(321, ReverseNumber.isPalindromeNumber(123));
	}
}
