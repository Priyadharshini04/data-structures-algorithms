package com.myjava.strivers.recursion;

public class RopeCuttingProblem {
	// Time Complexity O(3^n) and Space Complexity O(n)
	public static int cutRopes(int n, int a, int b, int c) {
		return cutRopes(n, a, b, c, 0);
	}

	public static int cutRopes(int n, int a, int b, int c, int count) {
		if (n < 0)
			return -1;
		if (n == 0)
			return count;
		int cutA = cutRopes(n - a, a, b, c, count + 1);
		int cutB = cutRopes(n - b, a, b, c, count + 1);
		int cutC = cutRopes(n - c, a, b, c, count + 1);
		int maxCut = cutA;
		if (maxCut < cutB)
			maxCut = cutB;
		if (maxCut < cutC)
			maxCut = cutC;
		return maxCut;
	}
}
