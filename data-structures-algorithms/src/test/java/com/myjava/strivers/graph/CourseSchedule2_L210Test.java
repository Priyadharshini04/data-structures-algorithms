package com.myjava.strivers.graph;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class CourseSchedule2_L210Test {
	@Test
	public void test1() {
		int[] result = CourseSchedule2_L210.findOrder(2, new int[][] { { 1, 0 } });
		assertArrayEquals(new int[] { 0, 1 }, result);
	}

	@Test
	public void test2() {
		int[] result = CourseSchedule2_L210.findOrder(4, new int[][] { { 1, 0 }, { 2, 0 }, { 3, 1 }, { 3, 2 } });
		assertArrayEquals(new int[] { 0, 1, 2, 3 }, result);
	}
}
