package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class AllThePermutaionTest {
	@Test
	public void test1()
	{
		AllThePermutation.findPermutation(new int[] {1,2,3,4},new ArrayList<Integer>(),new ArrayList<List<Integer>>(),new boolean[4]);
	}
}
