package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubStringWithoutRepeatingChar_L3Test {
	@Test
	public void test1()
	{
		assertEquals(3, LongestSubStringWithoutRepeatingChar_L3.lengthOfLongestSubstring("abcabcbb"));
	}
	@Test
	public void test2()
	{
		assertEquals(1, LongestSubStringWithoutRepeatingChar_L3.lengthOfLongestSubstring("bbbbbb"));
	}
	@Test
	public void test3()
	{
		assertEquals(3, LongestSubStringWithoutRepeatingChar_L3.lengthOfLongestSubstring("pwwkew"));
	}
	@Test
	public void test4()
	{
		assertEquals(3, LongestSubStringWithoutRepeatingChar_L3.lengthOfLongestSubstring("dvdf"));
	}
	@Test
	public void test5()
	{
		assertEquals(2, LongestSubStringWithoutRepeatingChar_L3.lengthOfLongestSubstring("abba"));
	}
}
