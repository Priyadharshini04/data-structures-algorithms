package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class AsteriodCollissionTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {5,10}, AsteriodCollission.asteroidCollision(new int[] {5,10,-5}));
	}
	
	@Test
	public void test2()
	{
		assertArrayEquals(new int[] {}, AsteriodCollission.asteroidCollision(new int[] {8,-8}));
	}
	
	@Test
	public void test3()
	{
		assertArrayEquals(new int[] {10}, AsteriodCollission.asteroidCollision(new int[] {10,2,-5}));
	}
	@Test
	public void test4()
	{
		assertArrayEquals(new int[] {-10,-2,-5}, AsteriodCollission.asteroidCollision(new int[] {-10,-2,-5}));
	}
	@Test
	public void test5()
	{
		assertArrayEquals(new int[] {-10,-5}, AsteriodCollission.asteroidCollision(new int[] {-10,2,-5}));
	}
	@Test
	public void test6()
	{
		assertArrayEquals(new int[] {-10}, AsteriodCollission.asteroidCollision(new int[] {5,-2,-10}));
	}
	@Test
	public void test7()
	{
		assertArrayEquals(new int[] {-2,-1,1,2}, AsteriodCollission.asteroidCollision(new int[] {-2,-1,1,2}));
	}
}
