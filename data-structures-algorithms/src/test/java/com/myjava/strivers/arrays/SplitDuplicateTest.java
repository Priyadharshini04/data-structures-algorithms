package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class SplitDuplicateTest {
	@Test
	public void test1() {
		List<List<Integer>> result = SplitDuplicate.split((List<Integer>) Arrays.asList(1, 3, 2, 3, 4, 1, 5, 2, 7, 8, 1));
		List<List<Integer>> expected = new ArrayList<List<Integer>>();
		expected.add(new ArrayList<Integer>(List.of(1, 2, 3)));
		expected.add(new ArrayList<Integer>(List.of(4, 5, 7, 8)));
		TreeTraversalsTest.assertCollectionArrayEquals(expected, result);
	}

}
