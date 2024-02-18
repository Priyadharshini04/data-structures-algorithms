package com.myjava.strivers.recursion;

import java.text.DecimalFormat;

//https://leetcode.com/problems/powx-n/
public class PowerN {

	public static double findPow(double x, int n) {
		double ans = 1.0;
		long num = n;
		if (num < 0)
			num = Math.abs(n);
		while (num > 0) {
			if (num % 2 == 1) {
				ans = ans * x;
				num = num - 1;
			} else {
				x = x * x;
				num = num / 2;
			}
		}
		if (n < 0)
			ans = (double) (1.0) / (double) (ans);
		return ans;
	}

	public static double findPows(double x, int n) {
		DecimalFormat df = new DecimalFormat("###.#####");
		boolean isNegative = false;
		if (n < 0) {
			isNegative = true;
			n *= -1;
		}

		if (n == 0) {
			return 1.00000;
		}
//		if (n >= Integer.MAX_VALUE) {
//			return Double.parseDouble(df.format(x));
//		}
//		if (n <= Integer.MIN_VALUE) {
//			if (x == 1.00000) {
//				if (n % 2 == 0)
//					return Double.parseDouble(df.format(x));
//
//				return Double.parseDouble(df.format(x * -1));
//			}
//			if (x == -1.00000) {
//				if (n % 2 == 0)
//					return Double.parseDouble(df.format(x * -1));
//
//				return Double.parseDouble(df.format(x));
//			}
//			return 0.00000;
//		}
		x = myPow(x, n);
		if (isNegative) {
			x = 1 / x;
		}
		return Double.parseDouble(df.format(x));
	}

	public static double find(double x, double ans, int n) {
		if (n == 1) {
			return ans;
		}
		return find(x, ans * x, --n);
	}

	public static double myPow(double x, int n) {

		if (n < 0) {
			n = -n;
			x = 1 / x;
		}

		double pow = 1;

		while (n != 0) {
			if ((n & 1) != 0) {
				pow *= x;
			}

			x *= x;
			n >>>= 1;

		}

		return pow;
	}

}
