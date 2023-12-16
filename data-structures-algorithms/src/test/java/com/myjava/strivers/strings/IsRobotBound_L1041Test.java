package com.myjava.strivers.strings;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsRobotBound_L1041Test {
	@Test
	public void test1() {
		assertTrue(IsRobotBound_L1041.isRobotBounded("LLGRL"));
	}

	@Test
	public void test2() {
		assertFalse(IsRobotBound_L1041.isRobotBounded("GRGL"));
	}

	@Test
	public void test3() {
		assertFalse(IsRobotBound_L1041.isRobotBounded("GLGLGGLGL"));
	}

	@Test
	public void test4() {
		assertTrue(IsRobotBound_L1041.isRobotBounded("GLLG"));
	}
	
	@Test
	public void test5() {
		assertTrue(IsRobotBound_L1041.isRobotBounded("GL"));
	}
}
