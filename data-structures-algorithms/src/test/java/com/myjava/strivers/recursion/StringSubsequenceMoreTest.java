package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringSubsequenceMoreTest {
	@Test
	public void test1()
	{
		String str1="ab";
		String str2="dd";
		assertEquals(str1, StringSubsequenceMore.largeSubsequence(str1.length(), str2.length(), str1, str2));
	}
	
	@Test
	public void test2()
	{
		String str1="f";
		String str2="eeg";
		assertEquals(str2, StringSubsequenceMore.largeSubsequence(str1.length(), str2.length(), str1, str2));
	}
	@Test
	public void test3()
	{
		String str1="gd";
		String str2="ege";
		assertEquals(str2, StringSubsequenceMore.largeSubsequence(str1.length(), str2.length(), str1, str2));
	}
}
