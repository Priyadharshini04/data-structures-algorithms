package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PowerNTest {
	@Test
	public void test1()
	{
		assertEquals(1024.00000, PowerN.findPow(2.0000,10), 0.0);
	}
	
	@Test
	public void test2()
	{
		assertEquals(9.26100, PowerN.findPow(2.10000,3), 0.00);
	}
	
	@Test
	public void test3()
	{
		assertEquals(0.25000, PowerN.findPow(2.0000,-2), 0.0);
	}
	
	@Test
	public void test4()
	{
		assertEquals(1.00000, PowerN.findPow(-1.00000,-2147483648), 0.0);
	}
	
	@Test
	public void test5()
	{
		assertEquals(-1.00000, PowerN.findPow(-1.00000,-2147483647), 0.0);
	}
	
	@Test
	public void test6()
	{
		assertEquals(0.00000, PowerN.findPow(2.00000,-2147483648), 0.0);
	}
	
	@Test
	public void test7()
	{
		assertEquals(-1.00000, PowerN.findPow(-1.00000,-2147483647), 0.0);
	}
}
