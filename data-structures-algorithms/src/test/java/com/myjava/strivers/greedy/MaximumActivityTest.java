package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumActivityTest {
	@Test
	public void test1() {
		assertEquals(2, MaximumActivity.activitySelection(new int[] { 1, 3, 6 }, new int[] { 4, 8, 7 }));
	}

	@Test
	public void test2() {
		assertEquals(4,
				MaximumActivity.activitySelection(new int[] { 1, 3, 0, 5, 8, 5 }, new int[] { 2, 4, 6, 7, 9, 9 }));
	}

	@Test
	public void test3() {
		assertEquals(3, MaximumActivity.activitySelection(new int[] { 0, 7, 1, 4, 8 }, new int[] { 2, 9, 5, 9, 0 }));
	}

	@Test
	public void test4() {
		assertEquals(2, MaximumActivity.activitySelection(new int[] { 712, 254, 869, 548 },
				new int[] { 1357, 917, 1627, 586 }));
	}

	@Test
	public void test5() {
		assertEquals(1, MaximumActivity.activitySelection(new int[] { 2, 1 }, new int[] { 2, 2 }));
	}
}
