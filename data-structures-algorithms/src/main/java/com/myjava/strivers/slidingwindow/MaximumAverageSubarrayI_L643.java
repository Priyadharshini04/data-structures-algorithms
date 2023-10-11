package com.myjava.strivers.slidingwindow;

// https://leetcode.com/problems/maximum-average-subarray-i/
public class MaximumAverageSubarrayI_L643 {

	public static double findMaxAverage(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int cnt = 0;
		double maxSum = -Double.MAX_VALUE;
		double sum = 0.0;
		while (right <= nums.length) {
			if (cnt == k && left<nums.length) {
				if (sum > maxSum) {
					maxSum = sum;
				}
				sum -= nums[left++];
				cnt--;
			}
			if (right < nums.length)
				sum += nums[right];
			right++;
			cnt++;
		}
		return maxSum/k;
	}

}
