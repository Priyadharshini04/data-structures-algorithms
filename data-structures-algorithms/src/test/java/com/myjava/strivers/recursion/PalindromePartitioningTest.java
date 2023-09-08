package com.myjava.strivers.recursion;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class PalindromePartitioningTest {
	@Test
	public void test1() {
		List<List<String>> list1 = Arrays.asList(Arrays.asList("a", "a", "b"), Arrays.asList("aa", "b"));
		List<List<String>> list2 = PalindromePartitioning.findPalindromeStrs("aab");
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
	
	@Test
	public void test2() {
		List<List<String>> list1 = Arrays.asList(Arrays.asList("a", "b", "a", "b", "a"), Arrays.asList("a", "bab", "a"), Arrays.asList("aba", "b","a"), Arrays.asList("a","b", "aba"), Arrays.asList("ababa"));
		List<List<String>> list2 = PalindromePartitioning.findPalindromeStrs("ababa");
		assertTrue(list1.size() == list2.size() && list1.containsAll(list2) && list2.containsAll(list1));
	}
}
