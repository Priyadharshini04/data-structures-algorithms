package com.myjava.strivers.arrays;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SetMatrixZerosTest {
	@Test
	public void test1()
	{
			int[][] matrix=new int[][] {{1,1,1},{1,0,1},{1,1,1}};
			SetMatrixZeros.setZeroes(matrix);
			assertArrayEquals(new int[][] {{1,0,1},{0,0,0},{1,0,1}},matrix);
			SetMatrixZeros.print(matrix);
	}
	@Test
	public void test2()
	{
		int[][] matrix1=new int[][] {{1,2,3,4},{5,0,7,8},{0,10,11,12},{13,14,15,0}};
		SetMatrixZeros.setZeroes(matrix1);
		assertArrayEquals(new int[][] {{0,0,3,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}},matrix1);
		SetMatrixZeros.print(matrix1);
	}
}
