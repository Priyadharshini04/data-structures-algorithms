package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LowerBoundTest {

	@Test
	public void test1() {
		assertEquals(0, LowerBound.lowerBound(new int[] {1,2,2,3}, 0));
	}
	
	@Test
	public void test2() {
		assertEquals(5, LowerBound.lowerBound(new int[] {1,1,2,2,2,4}, 3));
	}
	
	@Test
	public void test3() {
		assertEquals(3, LowerBound.lowerBound(new int[] {1,2,3,5,6,7}, 4));
	}
}
