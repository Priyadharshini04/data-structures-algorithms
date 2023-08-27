package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TargetBookReadTest {
	@Test
	public void test1() {
		assertEquals("YES", TargetBookRead.read(5, new int[] { 4, 1, 2, 3, 1 }, 5));
	}

	@Test
	public void test2() {
		assertEquals("NO", TargetBookRead.read(5, new int[] { 4, 1, 2, 3, 1 }, 9));
	}
	
	@Test
	public void test3() {
		assertEquals("YES", TargetBookRead.readOptimized(5, new int[] { 4, 1, 2, 3, 1 }, 5));
	}

	@Test
	public void test4() {
		assertEquals("NO", TargetBookRead.readOptimized(5, new int[] { 4, 1, 2, 3, 1 }, 9));
	}
}
