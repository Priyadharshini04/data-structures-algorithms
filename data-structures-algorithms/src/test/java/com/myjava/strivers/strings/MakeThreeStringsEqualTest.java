package com.myjava.strivers.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MakeThreeStringsEqualTest {
	@Test
	public void test1()
	{
		assertEquals(2, MakeThreeStringsEqual.findMinimumOperations("abc","abb","ab"));
	}
	
	@Test
	public void test2()
	{
		assertEquals(-1, MakeThreeStringsEqual.findMinimumOperations("dac","bac","cac"));
	}
	
	@Test
	public void test3()
	{
		assertEquals(0, MakeThreeStringsEqual.findMinimumOperations("a","a","a"));
	}
	@Test
	public void test4()
	{
		assertEquals(3, MakeThreeStringsEqual.findMinimumOperations("a","aabc","a"));
	}
	@Test
	public void test5()
	{
		assertEquals(7, MakeThreeStringsEqual.findMinimumOperations("ca","cccabb","cb"));
	}
	@Test
	public void test6()
	{
		assertEquals(2, MakeThreeStringsEqual.findMinimumOperations("ten","ten","tenob"));
	}
}
