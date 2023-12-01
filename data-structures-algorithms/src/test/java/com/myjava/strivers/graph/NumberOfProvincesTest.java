package com.myjava.strivers.graph;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfProvincesTest {
	@Test
	public void test1() {
		int[][] arr = new int[][] { { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 0, 0, 0, 1 } };
		assertEquals(2, NumberOfProvinces.findNumOfProvinces(arr, 4));
	}

	@Test
	public void test2() {
		int[][] arr = new int[][] { { 1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 1 }, { 0, 0, 1, 1 } };
		assertEquals(2, NumberOfProvinces.findNumOfProvinces(arr, 4));
	}

	@Test
	public void test3() {
		int[][] arr = new int[][] { { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 1, 1, 1, 0 }, { 0, 0, 0, 1 } };
		assertEquals(2, NumberOfProvinces.findNumOfProvinces(arr, 4));
	}

	@Test
	public void test4() {
		int[][] arr = new int[][] { { 1, 0, 0 }, { 0, 1, 0 }, { 0, 0, 1 } };
		assertEquals(3, NumberOfProvinces.findNumOfProvinces(arr, 3));
	}

	@Test
	public void test5() {
		int[][] arr = new int[][] { { 1, 0, 1, 1, 1 }, { 0, 1, 0, 1, 0 }, { 0, 0, 1, 0, 0 }, { 0, 1, 0, 1, 0 },
				{ 1, 1, 1, 0, 1 } };
		assertEquals(1, NumberOfProvinces.findNumOfProvinces(arr, 5));
	}

	@Test
	public void test6() {
		int[][] arr = new int[][] { { 1, 0, 0, 0, 0, 1, 1 }, { 0, 1, 0, 0, 0, 0, 0 }, { 0, 0, 1, 0, 1, 1, 1 },
				{ 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 0, 1, 0, 0 }, { 1, 0, 1, 0, 0, 1, 1 }, { 1, 0, 1, 0, 0, 1, 1 } };
		assertEquals(3, NumberOfProvinces.findNumOfProvinces(arr, 7));
	}
}
