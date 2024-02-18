package com.myjava.strivers.dp;

//https://www.codingninjas.com/studio/problems/nth-fibonacci-number_74156
public class Fibnocci {

	public static int nthFibnocci(int n) {
		if(n==0) return 0;
		int[] arr = new int[n + 1];
		recur(n + 1, arr);
		return arr[n];
		// return recurs(n);
	}

	// Memorization. TC: O(n). SC:O(n)+O(n)
	public static int recur(int n, int[] arr) {
		if (n <= 0) {
			arr[0] = 0;
			return 0;
		}
		if (n <= 2) {
			arr[1] = 1;
			arr[2] = 1;
			return 1;
		}
		int ans = recur(n - 1, arr); // 5,4,3,2
		arr[n - 1] = ans;
		return ans + arr[n - 2];
//		if (n <= 0)
//			return 0;
//		if (n <= 1)
//			return 1;
//		int num = recur(n - 1, arr);
//		arr[n - 1] = num;
//		return num + (n > 1 ? arr[n - 2] : 0);
	}

	// Tabulation. TC: O(n). SC: O(1)
	public static int recurs(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		int prev = 1;
		int prev2 = 0;
		for (int i = 2; i <= n; i++) {
			int sum = prev + prev2;
			prev2 = prev;
			prev = sum;
		}
		return prev;
	}
}
