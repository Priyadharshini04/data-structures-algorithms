package com.myjava.strivers.recursion;

public class TowerOfHanoi {
	static int count = 0;

	public static int findMinMoves(int n, char a, char b, char c) {
		findMinMove(n, a, b, c);
		return count;
	}

	public static void findMinMove(int n, char a, char b, char c) {
		++count;
		if (n == 1) {
			System.out.println(" Move" + n + "from" + a + " to " + c);
			return;
		}
		findMinMove(n - 1, a, c, b);
		System.out.println(" Move" + n + "from" + a + " to " + c);

		findMinMove(n - 1, b, a, c);
	}
}
