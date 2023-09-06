package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSumIITest {
	@Test
	public void test1()
	{
		List<List<Integer>> list1=Arrays.asList(Arrays.asList(1,1,6),Arrays.asList(1,2,5),Arrays.asList(1,7),Arrays.asList(2,6));
		List<List<Integer>> list2=CombinationSumII.combinationSum(new int[] {10,1,2,7,6,1,5},8);
		assertTrue(list1.size()==list2.size()&&list1.containsAll(list2)&&list2.containsAll(list1));
	}
}
