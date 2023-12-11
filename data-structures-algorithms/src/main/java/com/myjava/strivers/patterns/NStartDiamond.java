package com.myjava.strivers.patterns;

public class NStartDiamond {
	public static void nStarDiamond(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(" ");
			for (int k = 0; k < (2 * i) + 1; k++)
				System.out.print("*");
			for (int l = 0; l < n - i - 1; l++)
				System.out.print(" ");
			System.out.println();
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k < (2 * n) - 1 - i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
