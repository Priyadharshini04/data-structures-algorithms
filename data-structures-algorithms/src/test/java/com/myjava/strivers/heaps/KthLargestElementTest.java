package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class KthLargestElementTest {
	@Test
	public void test1() {
		assertEquals(5, KthLargestElement.findKthLargest(new int[] { 3, 2, 1, 5, 6, 4 }, 2));
	}

	@Test
	public void test2() {
		assertEquals(4, KthLargestElement.findKthLargest(new int[] { 3, 2, 3, 1, 2, 4, 5, 5, 6 }, 4));
	}
}
