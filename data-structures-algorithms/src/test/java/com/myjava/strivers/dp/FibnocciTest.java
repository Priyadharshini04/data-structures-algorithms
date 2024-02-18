package com.myjava.strivers.dp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FibnocciTest {
	@Test
	public void test1() {
		assertEquals(5, Fibnocci.nthFibnocci(5));
	}

	@Test
	public void test2() {
		assertEquals(1, Fibnocci.nthFibnocci(2));
	}

	@Test
	public void test3() {
		assertEquals(0, Fibnocci.nthFibnocci(0));
	}

	@Test
	public void test4() {
		assertEquals(2, Fibnocci.nthFibnocci(3));
	}
}
