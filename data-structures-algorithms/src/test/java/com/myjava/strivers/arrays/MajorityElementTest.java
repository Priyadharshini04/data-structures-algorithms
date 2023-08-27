package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MajorityElementTest {
	@Test
	public void test1() {
		assertEquals(5,MajorityElementInArray.majorityElement(new int[] {6,5,5}));
	}
	
	@Test
	public void test2() {
		assertEquals(2,MajorityElementInArray.majorityElementOpti(new int[] {2,2,1,1,2}));
	}
}
