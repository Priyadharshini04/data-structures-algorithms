package com.myjava.strivers.recursion;

// https://www.codingninjas.com/studio/problems/subset-sum_630213
public class SubSetSumK {
	public static boolean isSubSetPresent(int[] arr, int k) {
		return subSetSum(arr, k, arr.length, 0, 0);
	}

	public static boolean subSetSum(int arr[], int k, int n, int idx, int sum) {
		if (sum > k) // This condition reduces the time complexity.
		{
			return false;
		}
		if (idx == n) {
			if (sum == k) {
				return true;
			}
			return false;
		}
		if (subSetSum(arr, k, n, idx + 1, sum + arr[idx])) {
			return true;
		}
		if (subSetSum(arr, k, n, idx + 1, sum)) {
			return true;
		}
		return false;
	}
}
