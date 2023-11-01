package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JumpGame2_L45Test {
	@Test
	public void test1() {
		assertEquals(2, JumpGame2_L45.minimumJumpTakenToReach(new int[] { 2, 3, 1, 1, 4 }));
	}

	@Test
	public void test2() {
		assertEquals(4, JumpGame2_L45.minimumJumpTakenToReach(new int[] { 1, 1, 1, 1, 4 }));
	}

	@Test
	public void test3() {
		assertEquals(3, JumpGame2_L45.minimumJumpTakenToReach(new int[] { 1, 2, 1, 1, 1 }));
	}
}
