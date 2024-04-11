package com.myjava.strivers.graph;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.myjava.strivers.binarytrees.TreeTraversalsTest;

public class WordLadderII_L126Test {
	@Test
	public void test1() {
		List<List<String>> result = WordLadderII_L126.findLadders("hit", "cog",
				Arrays.asList("hot", "dot", "dog", "lot", "log", "cog"));
		List<List<String>> exp = Arrays.asList(Arrays.asList("hit", "hot", "dot", "dog", "cog"),
				Arrays.asList("hit", "hot", "lot", "log", "cog"));
		assertCollectionArrayEquals(exp, result);
	}

	@Test
	public void test2() {
		int res = WordLadder_L127.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log"));
		assertEquals(0, res);
	}
	
	public static void assertCollectionArrayEquals(List<List<String>> expected, List<List<String>> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertCollectionEquals(expected.get(i), actual.get(i));
		}
	}
	
	public static void assertCollectionEquals(List<String> expected, List<String> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
