package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestRepeatingCharacterReplacement_L424Test {
	@Test
	public void test1()
	{
		assertEquals(4, LongestRepeatingCharacterReplacement_L424.characterReplacement("ABAB",2));
	}
	@Test
	public void test2()
	{
		assertEquals(4, LongestRepeatingCharacterReplacement_L424.characterReplacement("AABABBA",1));
	}
	@Test
	public void test3()
	{
		assertEquals(3, LongestRepeatingCharacterReplacement_L424.characterReplacement("ABB", 1));
	}
	@Test
	public void test4()
	{
		assertEquals(3, LongestRepeatingCharacterReplacement_L424.characterReplacement("ABCD",2));
	}
	@Test
	public void test5()
	{
		assertEquals(4, LongestRepeatingCharacterReplacement_L424.characterReplacement("AAAA",0));
	}
}
