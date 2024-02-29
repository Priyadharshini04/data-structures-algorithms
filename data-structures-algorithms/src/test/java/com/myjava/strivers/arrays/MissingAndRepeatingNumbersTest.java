package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MissingAndRepeatingNumbersTest {
	@Test
	public void test1() {
		int[] result = MissingAndRepeatingNumbers.findMissingRepeatingNumbers(new int[] { 1, 2, 3, 2 });
		assertArrayEquals(new int[] { 2, 4 }, result);
	}

	@Test
	public void test2() {
		int[] result = MissingAndRepeatingNumbers.findMissingRepeatingNumbers(new int[] { 1, 4, 3, 4 });
		assertArrayEquals(new int[] { 4, 2 }, result);
	}
}
