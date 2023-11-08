package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateArrayByNTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[] { 12, 17, 1, 3, 6, 11 },
				RotateArrayByN.rotateArray(new int[] { 1, 3, 6, 11, 12, 17 }, 4));
	}

	@Test
	public void test2() {
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		new RotateArrayByN().rotate(arr, 3);
		assertArrayEquals(new int[] { 5, 6, 7, 1, 2, 3, 4 }, arr);
	}
}
