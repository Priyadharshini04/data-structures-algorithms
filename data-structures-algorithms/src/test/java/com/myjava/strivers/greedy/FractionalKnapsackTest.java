package com.myjava.strivers.greedy;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FractionalKnapsackTest {
	@Test
	public void test1() {
		assertEquals(13.00, FractionalKnapsack.maximumValue(
				new Pair[] { new Pair(6, 3), new Pair(1, 6), new Pair(5, 1), new Pair(3, 4) }, 10), 0.00001);
	}

	@Test
	public void test2() {
		assertEquals(204.00, FractionalKnapsack.maximumValue(new Pair[] { new Pair(50, 40), new Pair(40, 50),
				new Pair(90, 25), new Pair(120, 100), new Pair(10, 30), new Pair(200, 45) }, 200), 0.00001);
	}

	@Test
	public void test3() {
		assertEquals(212.00, FractionalKnapsack.maximumValue(
				new Pair[] { new Pair(45, 37), new Pair(82, 57), new Pair(82, 10), new Pair(97, 82), new Pair(26, 26) },
				500), 0.00001);
	}

	@Test
	public void test6() {
		assertEquals(13.00, FractionalKnapsack.fractionalKnapsack(
				new Pair[] { new Pair(6, 3), new Pair(1, 6), new Pair(5, 1), new Pair(3, 4) }, 10), 0.00001);
	}

	@Test
	public void test5() {
		assertEquals(204.00, FractionalKnapsack.fractionalKnapsack(new Pair[] { new Pair(50, 40), new Pair(40, 50),
				new Pair(90, 25), new Pair(120, 100), new Pair(10, 30), new Pair(200, 45) }, 200), 0.00001);
	}

	@Test
	public void test4() {
		assertEquals(212.00, FractionalKnapsack.fractionalKnapsack(
				new Pair[] { new Pair(45, 37), new Pair(82, 57), new Pair(82, 10), new Pair(97, 82), new Pair(26, 26) },
				500), 0.00001);
	}
}
