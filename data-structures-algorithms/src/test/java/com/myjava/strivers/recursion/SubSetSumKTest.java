package com.myjava.strivers.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SubSetSumKTest {
	@Test
	public void test1() {
		assertTrue(SubSetSumK.isSubSetPresent(new int[] { 4, 2, 5, 6, 7 }, 14));
	}

	@Test
	public void test2() {
		assertFalse(SubSetSumK.isSubSetPresent(new int[] { 4, 3, 5, 2 }, 13));
	}
}
