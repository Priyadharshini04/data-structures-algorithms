package com.myjava.strivers.arrays;

import java.util.Arrays;

// https://leetcode.com/problems/frequency-of-the-most-frequent-element/description/
public class FrequencyMostFrequentElement_L1838 {

	public static int maxFrequency(int[] nums, int k) {
		int maxFreq = 0;
		long sum = 0;
		Arrays.sort(nums);
		int left = 0;
		for (int right = 0; right < nums.length; right++) {
			sum += nums[right];
			while (nums[right] * (long) (right - left + 1) - sum > k) {
				sum -= nums[left];
				++left;
			}
			maxFreq = Math.max(maxFreq, right - left + 1);
		}
		return maxFreq;
	}

}
