package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class SubsetSumTest {
	@Test
	public void test1() {
		ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3));
		ArrayList<Integer> res = SubsetSum.subsetSum(new int[] { 1, 2 });
		assertEquals(arrL, res);
	}

	@Test
	public void test2() {
		ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(0, 4, 5, 9));
		ArrayList<Integer> res = SubsetSum.subsetSum(new int[] { 4, 5 });
		assertEquals(arrL, res);
	}

	@Test
	public void test3() {
		ArrayList<Integer> arrL = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 3, 4, 5, 6));
		ArrayList<Integer> res = SubsetSum.subsetSum(new int[] { 1, 2,3 });
		assertEquals(arrL, res);
	}
}
