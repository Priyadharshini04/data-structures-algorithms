package com.myjava.strivers.slidingwindow;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LongestSubstringwithAtMostKDistinctCharactersTest {
	@Test
	public void test1() {
		int result = LongestSubstringwithAtMostKDistinctCharacters.kDistinctChars("aabacbebebe", 3);
		assertEquals(7, result);
	}

	@Test
	public void test2() {
		int result = LongestSubstringwithAtMostKDistinctCharacters.kDistinctChars("aaaaaaaa", 3);
		assertEquals(8, result);
	}

	@Test
	public void test3() {
		int result = LongestSubstringwithAtMostKDistinctCharacters.kDistinctChars("welierbzpdkapwwdiwm", 3);
		assertEquals(5, result);
	}

	//
	@Test
	public void test4() {
		int result = LongestSubstringwithAtMostKDistinctCharacters
				.kDistinctChars("dblycfbvtottyroyidvbfhuxybmfsngmispbfn", 17);
		assertEquals(33, result);
	}
}
