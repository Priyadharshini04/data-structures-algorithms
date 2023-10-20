package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class FindMinimumNumberOfCoinsTest {
	@Test
	public void test1() {
		assertArrayListEquals(Arrays.asList(50, 20), FindMinimumNumberOfCoins.minimumCoins(70));
	}
	
	@Test
	public void test2() {
		assertArrayListEquals(Arrays.asList(10,2,1), FindMinimumNumberOfCoins.minimumCoins(13));
	}

	private void assertArrayListEquals(List<Integer> expected, List<Integer> actual) {
		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
