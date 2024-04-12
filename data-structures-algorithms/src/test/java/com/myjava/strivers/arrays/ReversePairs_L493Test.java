package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReversePairs_L493Test {
	@Test
	public void test1() {
		int result = ReversePairs_L493.reversePairs(new int[] { 1, 3, 2, 3, 1 });
		assertEquals(2, result);
	}
	
	@Test
	public void test2() {
		int result = ReversePairs_L493.reversePairs(new int[] { 2,4,3,5,1 });
		assertEquals(3, result);
	}
}
