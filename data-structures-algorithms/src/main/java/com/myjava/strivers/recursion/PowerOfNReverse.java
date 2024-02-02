package com.myjava.strivers.recursion;

public class PowerOfNReverse {

	public static int findReversePower(int N, int K) {
		int number = reverse(N, 1);
		return number << K;
	}

	private static int reverse(int n, int i) {
		if (n < 10)
			return i;
		
		return n%10;
	}

}
