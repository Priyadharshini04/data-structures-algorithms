package com.myjava.strivers.arrays;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class RemoveDuplicatesTest {
	@Test
	public void test1() {
		ArrayList<Integer> arr= new ArrayList<Integer>( Arrays.asList(1,2,2,3,3,3,4,4,5,5) );
		assertEquals(5, RemoveDuplicates.removeDuplicates(arr, 10));
	}
	
	@Test
	public void test2() {
		ArrayList<Integer> arr= new ArrayList<Integer>( Arrays.asList(1,2,3,3,3,4) );
		assertEquals(4, RemoveDuplicates.removeDuplicates(arr, 10));
	}
}
