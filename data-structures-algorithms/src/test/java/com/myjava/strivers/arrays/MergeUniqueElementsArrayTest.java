package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MergeUniqueElementsArrayTest {
	@Test
	public void test1() {
		List<Integer> merged = MergeUniqueElementsArray.sortedArray(new int[] {1,2,3,3},new int[] {2,2,4});
		assertEquals( Arrays.asList(1,2,3,4), merged);
	}
}
