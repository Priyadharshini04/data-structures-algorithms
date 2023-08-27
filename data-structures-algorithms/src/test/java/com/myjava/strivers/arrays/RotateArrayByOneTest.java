package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayByOneTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {2,3,4,5,1}, RotateArrayByOne.rotateArray(new int[] {1,2,3,4,5}, 5));
	}
}
