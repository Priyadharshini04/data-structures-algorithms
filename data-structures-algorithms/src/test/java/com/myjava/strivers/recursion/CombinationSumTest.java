package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSumTest {
	@Test
	public void test1() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(2, 2, 2, 2), Arrays.asList(3, 5),
				Arrays.asList(2, 3, 3));
		List<List<Integer>> list2 = CombinationSum.combinationSum(new int[] { 2, 3, 5 }, 8);
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}

	@Test
	public void test2() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7));
		List<List<Integer>> list2 = CombinationSum.combinationSum(new int[] { 2, 3, 6, 7 }, 7);
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}

	@Test
	public void test3() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(2, 2, 3), Arrays.asList(7), Arrays.asList(2, 5));
		List<List<Integer>> list2 = CombinationSum.combinationSum(new int[] { 2, 3, 5, 7 }, 7);
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}

	@Test
	public void test4() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 1, 1, 1, 1), Arrays.asList(1, 1, 1, 2),
				Arrays.asList(1, 1, 3), Arrays.asList(1, 2, 2), Arrays.asList(2, 3));
		List<List<Integer>> list2 = CombinationSum.combinationSum(new int[] { 1, 2, 3 }, 5);
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
}
