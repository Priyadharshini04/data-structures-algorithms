package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicatesTest {
	@Test
	public void test1() {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 5, 5));
		assertEquals(5, RemoveDuplicates.removeDuplicates(arr, 10));
	}

	@Test
	public void test2() {
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 3, 3, 4));
		assertEquals(4, RemoveDuplicates.removeDuplicates(arr, 10));
	}

	@Test
	public void test3() {
		int[] arr = new int[] { 1, 1, 2 };
		RemoveDuplicates.removeDuplicatesL_26(arr);
		assertArrayEquals(new int[] { 1, 2, 2 }, arr);
	}

	@Test
	public void test4() {
		int[] arr = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		RemoveDuplicates.removeDuplicatesL_26(arr);
		assertArrayEquals(new int[] { 0, 1, 2, 3, 4, 2, 2, 3, 3, 4 }, arr);
	}
}
