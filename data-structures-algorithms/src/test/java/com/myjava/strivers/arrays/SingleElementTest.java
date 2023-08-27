package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SingleElementTest {
	@Test
	public void test1() {
		assertEquals(4,SingleElement.singleNumber(new int[] {4,1,2,1,2}));
	}
	
	@Test
	public void test2() {
		assertEquals(4,SingleElement.singleNumbers(new int[] {4,1,2,1,2}));
	}
}
