package com.myjava.strivers.heaps;
// https://www.codingninjas.com/studio/problems/convert-min-heap-to-max-heap_1381084

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class MinHeapToMaxHeapTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[] {8,7,3,6,2,1}, MinHeapToMaxHeap.insert(new int[] { 1, 2, 3, 6, 7, 8 }));
	}
	
	@Test
	public void test2() {
		assertArrayEquals(new int[] {6,5,3,4,2,1}, MinHeapToMaxHeap.insert(new int[] { 1, 2, 3, 4, 5, 6 }));
	}
}
