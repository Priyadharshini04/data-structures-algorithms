package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class PreviousSmallerTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {-1, 4, -1, 2, 2}, PreviousSmaller.prevSmaller(new int[] {4, 5, 2, 10, 8}));
	}
	@Test
	public void test2()
	{
		assertArrayEquals(new int[] {-1,-1,-1,-1,4,24,24,-1}, PreviousSmaller.prevSmaller(new int[] {39, 27, 11, 4, 24, 32, 32, 1}));
	}
}
