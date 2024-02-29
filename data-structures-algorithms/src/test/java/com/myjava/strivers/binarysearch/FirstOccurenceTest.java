package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FirstOccurenceTest {
	@Test
	public void test1() {
		int result = FirstOccurence.leftIndex(5, new int[] { 15, 30, 45, 50, 55 }, 55);

		assertEquals(4, result);
	}
}
