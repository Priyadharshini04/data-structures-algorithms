package com.myjava.strivers.binarysearch;

// https://www.codingninjas.com/studio/problems/nth-root-of-m_1062679
public class NthRootOfanInteger {

	public static int nthRoot(int n, int m) {
		int left = 1;
		int right = m;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int midPower = findMulti(n, mid, m);
			if (midPower == 1) {
				return mid;
			}
			if (midPower == 2) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static int findMulti(int n, int num, int target) {
		long ans = 1;
		for (int i = 1; i <= n; i++) {
			ans *= num;
			if (ans > target) {
				return 2;
			}
		}
		if (ans == target) {
			return 1;
		}
		return 0;
	}
}
