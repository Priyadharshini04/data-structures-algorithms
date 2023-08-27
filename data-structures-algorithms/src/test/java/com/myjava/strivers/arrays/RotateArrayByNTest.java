package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayByNTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] { 12, 17, 1, 3, 6, 11 },
				RotateArrayByN.rotateArray(new int[] { 1, 3, 6, 11, 12, 17 }, 4));
	}
}
