package com.myjava.strivers.recursion;

//https://www.geeksforgeeks.org/lucky-numbers/
public class IsLuckiest {

	// Hint: find the nth position in each recursive call.
	// TC: T(n)=T(n-n/2)
	static int count = 2;

	public static boolean isLucky(int n) {
		if (count > n)
			return true;
		if (n % count == 0)
			return false;

		int nextPosition = n - (n / count);
		++count;
		return isLucky(nextPosition);
	}

}
