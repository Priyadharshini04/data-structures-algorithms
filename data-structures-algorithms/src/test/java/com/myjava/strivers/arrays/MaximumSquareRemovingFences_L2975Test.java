package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumSquareRemovingFences_L2975Test {
	@Test
	public void test1() {
		assertEquals(4,
				new MaximumSquareRemovingFences_L2975().maximizeSquareArea(4, 3, new int[] { 2, 3 }, new int[] { 2 }));
	}
}
