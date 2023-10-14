package com.myjava.strivers.heaps;

import static org.junit.Assert.assertArrayEquals;

import java.util.Arrays;

import org.junit.Test;

public class ReplaceArrayElementWithRankTest {
	@Test
	public void test1() {
		assertArrayEquals(Arrays.asList(2, 3, 1, 4).toArray(),
				ReplaceArrayElementWithRank.replaceWithRank(Arrays.asList(4, 7, 2, 90)).toArray());
	}

	@Test
	public void test2() {
		assertArrayEquals(Arrays.asList(2, 1).toArray(),
				ReplaceArrayElementWithRank.replaceWithRank(Arrays.asList(4, -1)).toArray());
	}

	@Test
	public void test3() {
		assertArrayEquals(Arrays.asList(1, 2, 3, 4, 2).toArray(),
				ReplaceArrayElementWithRank.replaceWithRank(Arrays.asList(1, 2, 6, 9, 2)).toArray());
	}
}
