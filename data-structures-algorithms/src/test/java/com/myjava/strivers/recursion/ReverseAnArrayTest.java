package com.myjava.strivers.recursion;

import static org.junit.Assert.assertArrayEquals;

import java.util.Scanner;

import org.junit.Test;

public class ReverseAnArrayTest {

	@Test
	public void test1() {
		assertArrayEquals(new int[] {3,6,1,8,7,5}, ReverseAnArray.reverseArray(6,new int[] {5,7,8,1,6,3},0) );
	}
}