package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ConsecutiveOnesTest {
	@Test
	public void test() {
		assertEquals(3, ConsecutiveOnes.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
	}
}
