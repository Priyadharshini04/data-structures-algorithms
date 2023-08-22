package com.myjava.strivers.binarysearch;

import static org.junit.Assert.*;

import org.junit.Test;

public class FindMinTest {

	@Test
	public void test1() {
		assertEquals(1, FindMin.findMinVal(new int[] { 3, 4, 5, 1, 2 }));
	}
	
	@Test
	public void test2() {
		assertEquals(0, FindMin.findMinVal(new int[] { 4,5,6,7,0,1,2 }));
	}
	
	@Test
	public void test3() {
		assertEquals(11, FindMin.findMinVal(new int[] { 11,13,15,17 }));
	}
	
	@Test
	public void test4() {
		assertEquals(1, FindMin.findMinVal(new int[] { 2,1 }));
	}
	
	@Test
	public void test5() {
		assertEquals(1, FindMin.findMinVal(new int[] { 5,1,2,3,4 }));
	}
}
