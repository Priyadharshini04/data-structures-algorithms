package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RotateArrayByOneTest {
	@Test
	public void test1() {
		assertArrayEquals(new int[] { 2, 3, 4, 5, 1 }, RotateArrayByOne.rotateArray(new int[] { 1, 2, 3, 4, 5 }, 5));
	}

	@Test
	public void test2() {
		ArrayList<Integer> arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		RotateArrayByOne.rotate(arr, 5);
	}
}
