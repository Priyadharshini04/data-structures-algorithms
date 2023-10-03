package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumRectangleTest {
	@Test
	public void test1()
	{
		assertEquals(6, MaximumRectangle.maximalRectangle(new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','1','1'},{'1','0','0','1','0'}}));
	}
	@Test
	public void test2()
	{
		assertEquals(1, MaximumRectangle.maximalRectangle(new char[][] {{'1'}}));
	}
	@Test
	public void test3()
	{
		assertEquals(0, MaximumRectangle.maximalRectangle(new char[][] {{'0'}}));
	}
	@Test
	public void test4()
	{
		assertEquals(4, MaximumRectangle.maximalRectangle(new char[][] {{'1','0','1','0','0'},{'1','0','1','1','1'},{'1','1','1','0','1'},{'1','0','0','1','0'}}));
	}
}
