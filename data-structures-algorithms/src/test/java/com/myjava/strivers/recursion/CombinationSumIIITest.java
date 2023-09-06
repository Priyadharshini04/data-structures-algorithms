package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class CombinationSumIIITest {
	@Test
	public void test1() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2, 4));
		List<List<Integer>> list2=CombinationSumIII.combinationSum(3,7);
		assertTrue(list1.size()==list2.size()&&list1.containsAll(list2) && list2.containsAll(list1));
	}
	@Test
	public void test2() {
		List<List<Integer>> list1 = Arrays.asList(Arrays.asList(1, 2, 6),Arrays.asList(1, 3, 5),Arrays.asList(2, 3, 4));
		List<List<Integer>> list2=CombinationSumIII.combinationSum(3,9);
		assertTrue(list1.size()==list2.size()&&list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test3() {
		List<List<Integer>> list1 = Arrays.asList();
		List<List<Integer>> list2=CombinationSumIII.combinationSum(4,1);
		assertTrue(list1.size()==list2.size()&&list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test4() {
		List<List<Integer>> list1 = Arrays.asList();
		List<List<Integer>> list2=CombinationSumIII.combinationSum(8,45);
		assertTrue(list1.size()==list2.size()&&list1.containsAll(list2) && list2.containsAll(list1));
	}
}
