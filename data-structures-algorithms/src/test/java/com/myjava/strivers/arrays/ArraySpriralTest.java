package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraySpriralTest {
	@Test
	public void test1()
	{
		assertEquals( Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10), ArraySpriral.spiral(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));
	}
	@Test
	public void test2()
	{
		assertEquals( Arrays.asList(1,2,3,6,9,8,7,4,5), ArraySpriral.spiral(new int[][] {{1,2,3},{4,5,6},{7,8,9}}));
	}
}
