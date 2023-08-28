package com.myjava;

public class SpiralPattern {
	public static void printSpiral(int n) {
		for (int i = 0; i < 2 * n - 1; i++) {
			for (int j = 0; j < 2 * n - 1; j++) {
				int top = i;
				int left = j;
				int right = (2 * n - 2) - j;
				int bottom = (2 * n - 2) - i;
				System.out.print(n - Math.min(Math.min(top, bottom), Math.min(right, left)));
			}
			System.out.println();
		}
	}
}
