package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberofSubstringsContainingAllThreeCharacters_L1358Test {
	@Test
	public void test1()
	{
		assertEquals(10, NumberofSubstringsContainingAllThreeCharactersL_1358.numberOfSubstrings("abcabc"));
	}
	@Test
	public void test2()
	{
		assertEquals(3, NumberofSubstringsContainingAllThreeCharactersL_1358.numberOfSubstrings("aaacb"));
	}
	@Test
	public void test3()
	{
		assertEquals(1, NumberofSubstringsContainingAllThreeCharactersL_1358.numberOfSubstrings("abc"));
	}
	@Test
	public void test4()
	{
		assertEquals(5, NumberofSubstringsContainingAllThreeCharactersL_1358.numberOfSubstrings("acbaa"));
	}
	@Test
	public void test5()
	{
		assertEquals(3, NumberofSubstringsContainingAllThreeCharactersL_1358.numberOfSubstrings("ababbbc"));
	}
	@Test
	public void test6()
	{
		assertEquals(11, NumberofSubstringsContainingAllThreeCharactersL_1358.numberOfSubstrings("acbbcac"));
	}
}
