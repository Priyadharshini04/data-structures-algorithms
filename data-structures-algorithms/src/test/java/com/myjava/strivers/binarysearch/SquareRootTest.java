package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareRootTest {
	@Test
	public void test1()
	{
		assertEquals(2, SquareRoot.sqrtN(7));
	}
	@Test
	public void test2()
	{
		assertEquals(2, SquareRoot.sqrtN(6));
	}
}
