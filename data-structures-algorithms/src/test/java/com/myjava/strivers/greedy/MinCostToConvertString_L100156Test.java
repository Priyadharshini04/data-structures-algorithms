package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.myjava.strivers.graph.MinCostToConvertString_L100156;

public class MinCostToConvertString_L100156Test {
	@Test
	public void test1() {
		long cost = new MinCostToConvertString_L100156().minimumCost("abcd", "acbe",
				new char[] { 'a', 'b', 'c', 'c', 'e', 'd' }, new char[] { 'b', 'c', 'b', 'e', 'b', 'e' },
				new int[] { 2, 5, 5, 1, 2, 20 });
		assertEquals(28, cost);
	}

	@Test
	public void test2() {
		long cost = new MinCostToConvertString_L100156().minimumCost("aaaa", "bbbb", new char[] { 'a', 'c' },
				new char[] { 'c', 'b' }, new int[] { 1, 2 });
		assertEquals(12, cost);
	}

	@Test
	public void test3() {
		long cost = new MinCostToConvertString_L100156().minimumCost("abcd", "abce", new char[] { 'a' },
				new char[] { 'e' }, new int[] { 10000 });
		assertEquals(-1, cost);
	}

	@Test
	public void test4() {
		long cost = new MinCostToConvertString_L100156().minimumCost("aaaabadaaa", "dbdadddbad",
				new char[] { 'c', 'a', 'c', 'a', 'a', 'b', 'b', 'b', 'd', 'd', 'c' },
				new char[] { 'a', 'c', 'b', 'd', 'b', 'c', 'a', 'd', 'c', 'b', 'd' },
				new int[] { 7, 8, 11, 9, 7, 6, 4, 6, 9, 5, 9 });
		assertEquals(56, cost);
	}

	@Test
	public void test5() {
		long cost = new MinCostToConvertString_L100156().minimumCost("aaadbdcdac", "cdbabaddba",
				new char[] { 'a', 'c', 'b', 'd', 'b', 'a', 'c' }, new char[] { 'c', 'a', 'd', 'b', 'c', 'b', 'd' },
				new int[] { 7, 2, 1, 3, 6, 1, 7 });
		assertEquals(39, cost);
	}
}
