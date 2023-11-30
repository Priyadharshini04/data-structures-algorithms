package com.myjava.strivers.recursion;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SumTriangleTest {
	@Test
	public void test1() {
		long[] arr = SumTriangle.findSumArray(new long[] { 4, 7, 3, 6, 7 });
		assertArrayEquals(new long[] { 81, 40, 41, 21, 19, 22, 11, 10, 9, 13, 4, 7, 3, 6, 7 }, arr);
	}
}
