package com.myjava.strivers.arrays;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArraySumEqualsK {
	public static int subarraySum(int[] nums, int k) {
		int maxCount = 0;
		int start = 0, end = -1;
		int sum = 0;
		while (start < nums.length) {
			sum = 0;
			end = start - 1;
			while (end + 1 < nums.length) {
				sum += nums[end + 1];
				if (sum == k) {
					maxCount += 1;
				}
				end++;
			}
			start++;
		}
		return maxCount;
	}
}