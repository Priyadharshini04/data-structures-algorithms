package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CountNextGreatersTest {
	@Test
	public void test1()
	{
		assertArrayEquals(new int[] {7,6,1}, CountNextGreaters.countGreater(new int[] {1, 3 ,6 ,5 ,8, 9, 13, 4},new int[] {0, 1, 5}));
	}
}
