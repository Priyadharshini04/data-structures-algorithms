package com.myjava.strivers.arrays;
//https://leetcode.com/problems/maximum-subarray/
public class KadaneMaxSubArray {

	public static int maxSubArray(int[] nums) {
		int currSum = 0;
		int maxSum = 0;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < nums.length; i++) {
			currSum = nums[i];
			maxSum += nums[i];
			if (maxSum > currSum) {
				currSum = maxSum;
			}
			if (maxSum < 0) {
				maxSum = 0;
			}
			max = Math.max(max, currSum);
		}
		return max;

	}

}
