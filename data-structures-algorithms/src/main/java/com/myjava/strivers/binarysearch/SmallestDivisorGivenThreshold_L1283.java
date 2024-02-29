package com.myjava.strivers.binarysearch;

// https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/description/
public class SmallestDivisorGivenThreshold_L1283 {

	public static int smallestDivisor(int[] nums, int threshold) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i : nums) {
			if (min > i)
				min = i;
			if (max < i)
				max = i;
		}
		int ans = 1;
		while (min <= max) {
			int currDivisor = min + ((max - min) / 2);
			if (isPossibleDivisor(nums, currDivisor, threshold)) {
				ans = currDivisor;
				max = currDivisor - 1;
			} else {
				min = currDivisor + 1;
			}
		}
		return ans;
	}

	private static boolean isPossibleDivisor(int[] nums, int currDiv, int threshold) {
		long total = 0;
		for (int i : nums) {
			total += Math.ceil((double) i / (double) currDiv);
		}
		if (total <= threshold) {
			return true;
		}
		return false;
	}

}
