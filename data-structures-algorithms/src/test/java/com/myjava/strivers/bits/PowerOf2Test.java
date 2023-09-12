package com.myjava.strivers.bits;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PowerOf2Test {
	@Test
	public void test1()
	{
		assertTrue(PowerOf2.isPowerOf2(1));
	}
	
	@Test
	public void test2()
	{
		assertTrue(PowerOf2.isPowerOf2(16));
	}
	
	@Test
	public void test3()
	{
		assertFalse(PowerOf2.isPowerOf2(3));
	}
}
