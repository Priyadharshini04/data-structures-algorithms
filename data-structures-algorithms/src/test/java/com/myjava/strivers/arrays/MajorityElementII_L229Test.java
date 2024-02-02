package com.myjava.strivers.arrays;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class MajorityElementII_L229Test {
	@Test
	public void test1() {
		List<Integer> result = MajorityElementII_L229.findMajority(new int[] { 3, 2, 3 });
		List<Integer> expected = Arrays.asList(3);
		assertTrue(result.size() == expected.size() && result.containsAll(expected) && expected.containsAll(result));
	}
}
