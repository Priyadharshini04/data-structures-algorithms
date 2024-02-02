package com.myjava.strivers.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsLuckiestTest {
	@Test
	public void test1() {
		assertTrue(IsLuckiest.isLucky(7));
	}

	@Test
	public void test2() {
		assertFalse(IsLuckiest.isLucky(74));
	}
}
