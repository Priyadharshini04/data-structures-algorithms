package com.myjava.strivers.stackqueue;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PetrolDistanceTest {
	@Test
	public void test1()
	{
		int result = new PetrolDistance().tour(new int[] {4,6,6,5},new int[] {7,3,4,5});
		assertEquals(1, result);
	}
	@Test
	public void test2()
	{
		int result = new PetrolDistance().tour(new int[] {4,5,4,1},new int[] {6,5,3,7});
		assertEquals(-1, result);
	}
	@Test
	public void test3()
	{
		int result = new PetrolDistance().tour(new int[] {4,5,4,1},new int[] {6,5,3,7});
		assertEquals(-1, result);
	}
}
