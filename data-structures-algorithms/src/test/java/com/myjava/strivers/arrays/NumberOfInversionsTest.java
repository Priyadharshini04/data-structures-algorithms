package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class NumberOfInversionsTest {
	@Test
	public void test1() {
		int arr[] = new int[] { 5, 3, 2, 1, 4 };
		int result = NumberOfInversions.numberOfInversions(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		assertEquals(7, result);
	}

	@Test
	public void test2() {
		int result = NumberOfInversions.numberOfInversions(new int[] { 4, 3, 2, 1 });
		assertEquals(6, result);
	}
}
