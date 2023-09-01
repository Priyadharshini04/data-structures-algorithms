package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class ArraySubsetTest {
	@Test
	public void test1()
	{
		assertEquals(Arrays.asList(Arrays.asList(), Arrays.asList(1), Arrays.asList(2), Arrays.asList(1, 2),
				Arrays.asList(3), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(1, 2, 3)), 
				ArraySubset.subsets(new int[] {1,2,3}));
	}
}
