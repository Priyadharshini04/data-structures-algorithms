package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class ArraySubsetTest {
	@Test
	public void test1() {
		List<List<Integer>> list1 = new ArraySubset().subsets(new int[] { 1, 2, 3 });
		List<List<Integer>> list2 = Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(2),
				Arrays.asList(1, 2), Arrays.asList(3), Arrays.asList(1, 3), Arrays.asList(2, 3),
				Arrays.asList(1, 2, 3));
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test2() {
		List<List<Integer>> list1 = new ArraySubset().subsets(new int[] { 0 });
		List<List<Integer>> list2 = Arrays.asList(Arrays.asList(), Arrays.asList(0));
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
}
