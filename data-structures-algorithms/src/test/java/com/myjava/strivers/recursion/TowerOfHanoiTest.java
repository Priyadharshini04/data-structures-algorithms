package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TowerOfHanoiTest {
	@Test
	public void test1() {
		assertEquals(7, TowerOfHanoi.findMinMoves(3, 'A', 'B', 'C'));
	}
}
