package com.myjava.strivers.arrays;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class Three3Sum_L15Test {
	@Test
	public void test1() {
		List<List<Integer>> result = Three3Sum_L15.threeSum(new int[] { -1, 0, 1, 2, -1, -4 });
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(-1, -1, 2), Arrays.asList(-1, 0, 1));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}
}
