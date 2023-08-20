package com.myjava.strivers.binarysearch;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class FloorCeilTest {

	@Test
	public void test1() {
		assertArrayEquals(new int[] { 8, 8 }, FloorCeil.ceilingInSortedArray(8, new int[] { 4, 3, 8, 4, 7, 10 }));

	}

	@Test
	public void test2() {
		assertArrayEquals(new int[] { -1, 3 }, FloorCeil.ceilingInSortedArray(2, new int[] { 4, 3, 8, 4, 7, 10 }));

	}

	@Test
	public void test3() {
		assertArrayEquals(new int[] { 4, 7 }, FloorCeil.ceilingInSortedArray(5, new int[] { 4, 3, 8, 4, 7, 10 }));
	}
}
