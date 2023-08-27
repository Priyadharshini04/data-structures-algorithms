package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class Move0AtEndTest {
	@Test
	public void test1() {
		assertArrayEquals( new int[] {4, 3, 2, 5, 0}, Move0AtEnd.moveZeros(5,new int[] {4,0,3,2,5}) );
		assertArrayEquals(  new int[] {4, 3, 2, 5, 0},  Move0AtEnd.moveZero(5,new int[] {4,0,3,2,5}) );

	}
}
