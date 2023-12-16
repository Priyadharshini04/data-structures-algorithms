package com.myjava.strivers.strings;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountWithKDifferentCharactersTest {
	@Test
	public void test1() {
		int count = CountWithKDifferentCharacters.countSubStrings("aacfssa", 3);
		assertEquals(5, count);
	}

	@Test
	public void test2() {
		int count = CountWithKDifferentCharacters.countSubStrings("qffds", 4);
		assertEquals(1, count);
	}

	@Test
	public void test3() {
		int count = CountWithKDifferentCharacters.countSubStrings("aaaaaa", 1);
		assertEquals(21, count);
	}

	@Test
	public void test4() {
		int count = CountWithKDifferentCharacters.countSubStrings("urrrzaxxxhjjquooxzgwzpppavcfaxeefnggtsii",
				5);
		assertEquals(49, count);
	}
}
