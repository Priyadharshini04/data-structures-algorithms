package com.myjava.strivers.arrays;

// https://leetcode.com/problems/minimum-equal-sum-of-two-arrays-after-replacing-zeros/submissions/1091750850/
public class MinimumEqualSumTwoArrays {
	public long minSum(int[] nums1, int[] nums2) {
		long sum1 = 0L;
		long sum2 = 0L;
		int zeros1 = 0;
		int zeros2 = 0;
		for (int i = 0; i < nums1.length; i++) {
			if (nums1[i] == 0) {
				++zeros1;
			}
			sum1 += nums1[i];
		}
		for (int i = 0; i < nums2.length; i++) {
			if (nums2[i] == 0) {
				++zeros2;
			}
			sum2 += nums2[i];
		}
		if (sum1 == sum2) {
			if (zeros1 > 0 && zeros2 > 0) {
				if (zeros1 >= zeros2) {
					return sum1 + (long) zeros1;
				}
				return sum2 + (long) zeros2;
			} else if (zeros1 == 0 && zeros2 == 0) {
				return sum1;
			}
			return -1;
		} else if (sum1+zeros1 > sum2+zeros2) {
			long sum = sum1 + zeros1;
			if (zeros2 > 0 && sum - sum2 >= zeros2) {
				return sum;
			}
			return -1;
		} else {
			long sum = sum2 + zeros2;
			if (zeros1 > 0 && sum - sum1 >= zeros1) {
				return sum;
			}
			return -1;
		}
	}
}
