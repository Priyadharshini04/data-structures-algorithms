package com.myjava.strivers.arrays;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class FourSum_L18Test {
	@Test
	public void test1() {
		List<List<Integer>> result = FourSum_L18.fourSum(new int[] { 1, 0, -1, 0, -2, 2 }, 0);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, -1, 1, 2), Arrays.asList(-2, 0, 0, 2),
				Arrays.asList(-1, 0, 0, 1));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

	@Test
	public void test2() {
		List<List<Integer>> result = FourSum_L18.fourSum(new int[] { 2, 2, 2, 2, 2 }, 8);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(2, 2, 2, 2));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

	@Test
	public void test3() {
		List<List<Integer>> result = FourSum_L18.fourSum(new int[] { -2, -1, -1, 1, 1, 2, 2 }, 0);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(-2, -1, 1, 2), Arrays.asList(-1, -1, 1, 1));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

	@Test
	public void test4() {
		List<List<Integer>> result = FourSum_L18.fourSum(new int[] { 2, 4, 0, 4, -3, -3 }, 0);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(-3, -3, 2, 4));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

	@Test
	public void test5() {
		List<List<Integer>> result = FourSum_L18.fourSum(new int[] { 0, -5, 5, 1, 1, 2, -5, 5, -3 }, -11);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(-5, -5, -3, 2));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

	@Test
	public void test6() {
		List<List<Integer>> result = FourSum_L18
				.fourSum(new int[] { 0, 0, 0, 1000000000, 1000000000, 1000000000, 1000000000 }, 1000000000);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(0, 0, 0, 1000000000));

		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}
}
