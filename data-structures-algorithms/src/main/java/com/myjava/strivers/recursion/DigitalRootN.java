package com.myjava.strivers.recursion;

public class DigitalRootN {

	public static int digitalRoot(int n) {
		while (n >= 10) {
			n = digitalRoots(n);
		}
		return n;
	}

	public static int digitalRoots(int n) {
		if (n < 10)
			return n;
		return digitalRoots(n / 10) + n % 10;
	}

}
