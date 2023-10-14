package com.myjava.strivers.heaps;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeKSortedArraysTest {
	@Test
	public void test1() {
		List<List<Integer>> kArrays = Arrays.asList(Arrays.asList(1, 5, 9), Arrays.asList(45, 90),
				Arrays.asList(2, 6, 78, 100, 234), Arrays.asList(0));
		assertCollectionArrayEquals(Arrays.asList(0, 1, 2, 5, 6, 9, 45, 78, 90, 100, 234),
				MergeKSortedArrays.mergeKSortedArrays(kArrays, 3));
	}

	private void assertCollectionArrayEquals(List<Integer> expected, ArrayList<Integer> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
