package com.myjava.strivers.binarysearch;

// https://www.codingninjas.com/studio/problems/square-root-integral_893351
public class SquareRoot {
	public static int sqrtN(long N) {
		if (N < 2) {
			return (int) N;
		}
		if (N < 4) {
			return 1;
		}
		long left = 1;
		long right = N;
		long square = 1;
		int number = 1;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			if (mid * mid <= N) {
				if (square < mid * mid) {
					square = mid * mid;
					number = (int) mid;
				}
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return number;
	}

}
