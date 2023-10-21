package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MaximumMeetingsTest {
	@Test
	public void test1() {
		assertEquals(2, MaximumMeetings.maximumMeetings(new int[] { 1, 3, 6 }, new int[] { 4, 8, 7 }));
	}

	@Test
	public void test2() {
		assertEquals(4,
				MaximumMeetings.maximumMeetings(new int[] { 1, 3, 0, 5, 8, 5 }, new int[] { 2, 4, 6, 7, 9, 9 }));
	}

	@Test
	public void test3() {
		assertEquals(3, MaximumMeetings.maximumMeetings(new int[] { 0, 7, 1, 4, 8 }, new int[] { 2, 9, 5, 9, 0 }));
	}

	@Test
	public void test4() {
		assertEquals(2,
				MaximumMeetings.maximumMeetings(new int[] { 712, 254, 869, 548 }, new int[] { 1357, 917, 1627, 586 }));
	}
}
