package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SubSetWithDuplicateTest {
	@Test
	public void test1() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(1, 2),
				Arrays.asList(1, 2, 2), Arrays.asList(2), Arrays.asList(2, 2));
		List<List<Integer>> list2 = SubSetWithDuplicate.findAllUniqueSubsets(new int[] { 1, 2, 2 });
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}

	@Test
	public void test2() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(1, 4),
				Arrays.asList(1, 4, 4), Arrays.asList(1, 4, 4, 4), Arrays.asList(1, 4, 4, 4, 4), Arrays.asList(4),
				Arrays.asList(4, 4), Arrays.asList(4, 4, 4), Arrays.asList(4, 4, 4, 4));
		List<List<Integer>> list2 = SubSetWithDuplicate.findAllUniqueSubsets(new int[] { 4, 4, 4, 1, 4 });
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
}
