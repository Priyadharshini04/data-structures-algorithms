package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FindTarget_L704Test {
	@Test
	public void test1() {
		int result = FindTarget_L704.find(new int[] { -1, 0, 3, 5, 9, 12 }, 9);
		assertEquals(4, result);
	}
}
