package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class SubArraysWithSumKTest {
	@Test
	public void test1()
	{
		List<List<Integer>> list1=SubArraysWithSumK.subarraysWithSumK(new int[] {1,2,3,1,1,1}, 3);
		List<List<Integer>> list2=Arrays.asList(Arrays.asList(1,2),Arrays.asList(3),Arrays.asList(1,1,1));
		assertTrue(list1.size()==list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test2()
	{
		List<List<Integer>> list1=SubArraysWithSumK.subarraysWithSumK(new int[] {1,2,1,3}, 2);
		List<List<Integer>> list2=Arrays.asList(Arrays.asList(2));
		assertTrue(list1.size()==list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test3()
	{
		List<List<Integer>> list1=SubArraysWithSumK.subarraysWithSumK(new int[] {9,5,6,5,5 }, 16);
		List<List<Integer>> list2=Arrays.asList(Arrays.asList(5,6,5),Arrays.asList(6,5,5));
		assertTrue(list1.size()==list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test4()
	{
		List<List<Integer>> list1=SubArraysWithSumK.subarraysWithSumK(new int[] {}, 0);
		List<List<Integer>> list2=Arrays.asList(Arrays.asList());
		assertTrue(list1.size()==list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
}
