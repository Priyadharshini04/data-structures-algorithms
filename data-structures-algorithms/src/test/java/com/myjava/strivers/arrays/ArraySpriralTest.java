package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraySpriralTest {
	@Test
	public void test1()
	{
		assertEquals( Arrays.asList(1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10), ArraySpriral.spiralOrder(new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}));
	}
}
