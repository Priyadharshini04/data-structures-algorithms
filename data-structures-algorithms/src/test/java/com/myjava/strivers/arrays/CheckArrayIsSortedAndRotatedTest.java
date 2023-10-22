package com.myjava.strivers.arrays;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CheckArrayIsSortedAndRotatedTest {
	@Test
	public void test1() {
		assertFalse(CheckArrayIsSortedAndRotated.check(new int[] { 2, 1, 3, 4 }));
	}

	@Test
	public void test2() {
		assertFalse(CheckArrayIsSortedAndRotated.check(new int[] { 3, 1, 2, 2, 4 }));
	}

	@Test
	public void test3() {
		assertTrue(CheckArrayIsSortedAndRotated.check(new int[] { 7, 8, 8, 10, 2, 3, 3, 6, 6 }));
	}

	@Test
	public void test4() {
		assertFalse(CheckArrayIsSortedAndRotated.check(new int[] { 2, 4, 1, 3 }));
	}

	@Test
	public void test5() {
		assertTrue(CheckArrayIsSortedAndRotated.check(new int[] { 1, 2, 3 }));
	}
}
