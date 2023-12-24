package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SubArrayWithSum0Test {
	@Test
	public void test1() {
		assertEquals(5, SubArrayWithSum0.findSubArray(new int[] { 15, -2, 2, -8, 1, 7, 10, 23 }));
	}

	@Test
	public void test2() {
		assertEquals(4, SubArrayWithSum0.findSubArray(new int[] { 0, 0, 0, 0, 1 }));
	}

	@Test
	public void test3() {
		assertEquals(0,
				SubArrayWithSum0.findSubArray(new int[] { 33, -103, 680, 413, -968, -169, -843, -648, -464, -325, -182,
						970, 153, 394, -288, 632, 265,
						549, 878, 834, -948, 156, 469, -959, 824, -170, -676, -244, 762,
						-322, -99 }));
	}
}
