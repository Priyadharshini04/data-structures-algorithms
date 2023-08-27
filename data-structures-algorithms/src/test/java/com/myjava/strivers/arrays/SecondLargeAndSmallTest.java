package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SecondLargeAndSmallTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {4,3}, SecondLargeAndSmall.getSecondOrderElements(4,new int[] {3,4,5,2}));
	}
}
