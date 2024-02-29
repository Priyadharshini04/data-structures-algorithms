package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountOnesTest {
	@Test
	public void test1() {
		assertEquals(3, CountOnes.countOnes(new int[] { 1, 1, 1, 0, 0, 0, 0, 0 }, 8));
	}
}
