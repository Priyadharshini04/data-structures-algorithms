package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RopeCuttingProblemTest {
	@Test
	public void test1() {
		assertEquals(2, RopeCuttingProblem.cutRopes(23, 9, 11, 12));
	}

	@Test
	public void test2() {
		assertEquals(-1, RopeCuttingProblem.cutRopes(5, 4, 2, 6));
	}

	@Test
	public void test3() {
		assertEquals(5, RopeCuttingProblem.cutRopes(5, 5, 2, 1));
	}

	@Test
	public void test4() {
		assertEquals(-1, RopeCuttingProblem.cutRopes(9, 2, 2, 2));
	}
}
