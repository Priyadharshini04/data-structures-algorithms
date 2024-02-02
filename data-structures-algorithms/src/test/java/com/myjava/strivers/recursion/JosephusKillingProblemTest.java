package com.myjava.strivers.recursion;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JosephusKillingProblemTest {
	@Test
	public void test1() {
		assertEquals(4, JosephusKillingProblem.josephus(5, 3));
	}
}
