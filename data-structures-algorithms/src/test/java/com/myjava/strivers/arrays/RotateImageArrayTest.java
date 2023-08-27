package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class RotateImageArrayTest {
	@Test
	public void test1()
	{
			int[][] matrix= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
			RotateImageArray.rotate(matrix);
			assertArrayEquals(new int[][] {{7,4,1},{8,5,2},{9,6,3}},matrix);
			RotateImageArray.print(matrix);
	}
}
