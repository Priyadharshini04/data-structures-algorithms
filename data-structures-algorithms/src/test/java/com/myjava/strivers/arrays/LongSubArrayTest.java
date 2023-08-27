package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongSubArrayTest {
	@Test
	public void test1() {
		assertEquals(3,LongSubArray.findLong(new int[]
		{-1,0,1,1,-1,-1,0},
		 0));
	}
	
	@Test
	public void test2() {
		assertEquals(21,LongSubArray.findLong(new int[]
		{0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0},
		 52));
	}
	
	@Test
	public void test3() {
		assertEquals(2,LongSubArray.findLong(new int[]{8,15,17,0,11 },17));
	}
	
	@Test
	public void test4() {
		assertEquals(1,LongSubArray.findLong(new int[]{1,4,1,3},3));
	}
}
