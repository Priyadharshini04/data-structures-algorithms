package com.myjava.strivers.recursion;

public class JosephusKillingProblem {

	public static int josephus(int n, int k) {
		return josephusOne(n, k) + 1;
	}

	public static int josephusOne(int n, int k) {
		if (n == 1)
			return 0;
		return (josephusOne(n - 1, k) + k) % n;
	}

}
