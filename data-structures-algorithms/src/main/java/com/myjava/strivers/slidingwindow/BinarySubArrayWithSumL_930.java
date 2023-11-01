package com.myjava.strivers.slidingwindow;

// https://leetcode.com/problems/binary-subarrays-with-sum/description/
public class BinarySubArrayWithSumL_930 {
	
	// Optimal solution.
	public static int numSubarraysWithSum(int[] nums, int goal) {
		return atmost(nums, goal) - atmost(nums, goal - 1);
	}

	public static int atmost(int[] nums, int goal) {
		int count = 0;
		int left = 0;
		int right = 0;
		int sum = 0;
		while (right < nums.length) {
			if (nums[right++] == 1)
				sum++;
			while (left < right && sum > goal) {
				if (nums[left++] == 1)
					sum--;
			}
			count += right - left;
		}
		return count;
	}

	// The brute force passed.
	public static int numSubarraysWithSums(int[] nums, int goal) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int sum = nums[i];
			if (sum == goal) {
				count++;
			}
			for (int j = i + 1; j < nums.length; j++) {
				sum += nums[j];
				if (sum == goal) {
					count++;
				}
			}
		}
		return count;
	}

}
