package com.myjava.strivers.arrays;

//https://leetcode.com/problems/rotate-image/
public class RotateImageArray {

	public static void rotate(int[][] matrix) {
		// roate first.
		for (int i = 0; i < matrix.length; i++) {
			int a = 0;
			int b = matrix.length - 1;
			while (a <= b) {
				int temp = matrix[a][i];
				matrix[a][i] = matrix[b][i];
				matrix[b][i] = temp;
				a++;
				b--;
			}
		}
		print(matrix);
		// then transpose.
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i + 1; j < matrix.length; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}

	public static void print(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j] + ",");
			}
			System.out.println();
		}
	}
}
