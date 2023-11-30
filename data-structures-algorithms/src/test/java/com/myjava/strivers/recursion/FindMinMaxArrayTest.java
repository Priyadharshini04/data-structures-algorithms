package com.myjava.strivers.recursion;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FindMinMaxArrayTest {
	@Test
	public void test1() {
		long result[] = FindMinMaxArray.findMin(new long[] { 1L, 4L, 3L, -5L, -4L, 8L, 6L });
		assertArrayEquals(new long[] { -5L, 8L }, result);
	}
}
