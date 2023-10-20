package com.myjava.strivers.greedy;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LemonadeChangeTest {
	@Test
	public void test1() {
		assertTrue(LemonadeChange.lemonadeChange(new int[] { 5, 5, 5, 10, 20 }));
	}
	
	@Test
	public void test2() {
		assertFalse(LemonadeChange.lemonadeChange(new int[] { 5,5,10,10,20 }));
	}
	
	@Test
	public void test3() {
		assertTrue(LemonadeChange.lemonadeChange(new int[] { 5,5,10,20,5,5,5,5,5,5,5,5,5,10,5,5,20,5,20,5 }));
	}
}
