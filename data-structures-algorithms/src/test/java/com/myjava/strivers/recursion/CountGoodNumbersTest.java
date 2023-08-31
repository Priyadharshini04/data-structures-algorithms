package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CountGoodNumbersTest {
	@Test
	public void test1() {
		assertEquals(5, CountGoodNumbers.count(1L));
	}

	@Test
	public void test2() {
		assertEquals(20, CountGoodNumbers.count(2L));
	}

	@Test
	public void test3() {
		assertEquals(400, CountGoodNumbers.count(4L));
	}
	

	@Test
	public void test4() {
		assertEquals(564908303, CountGoodNumbers.count(50L));
	}
}
