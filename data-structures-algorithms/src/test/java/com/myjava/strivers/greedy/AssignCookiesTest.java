package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AssignCookiesTest {
	@Test
	public void test1()
	{
		assertEquals(1, AssignCookies.findContentChildren(new int[] {1,2,3},new int[] {1,1}));
	}
	
	@Test
	public void test2()
	{
		assertEquals(2, AssignCookies.findContentChildren(new int[] {1,2},new int[] {1,2,3}));
	}
	@Test
	public void test3()
	{
		assertEquals(1, AssignCookies.findContentChildren(new int[] {1,2,3},new int[] {3}));
	}
	@Test
	public void test4()
	{
		assertEquals(2, AssignCookies.findContentChildren(new int[] {10,9,8,7},new int[] {5,6,7,8}));
	}
}
