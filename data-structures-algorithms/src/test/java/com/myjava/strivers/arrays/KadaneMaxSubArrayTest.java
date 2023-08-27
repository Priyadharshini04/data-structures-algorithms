package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KadaneMaxSubArrayTest {
	@Test
	public void test1() {
		assertEquals(-4,KadaneMaxSubArray.maxSubArray(new int[] {-7,-8,-16,-4,-8,-5,-7,-11,-10,-12,-4,-6,-4,-16,-10 }));
	}
}
