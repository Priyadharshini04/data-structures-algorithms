package com.myjava.strivers.graph;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class WordLadderII_L126Test {
	@Test
	public void test1() {
		int result = WordLadderII_L126.findLadders("hit", "cog",
				Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
		assertEquals(2, result);
	}

	@Test
	public void test2() {
		int res = WordLadder_L127.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log"));
		assertEquals(0, res);
	}
}
