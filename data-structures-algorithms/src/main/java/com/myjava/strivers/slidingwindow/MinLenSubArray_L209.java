package com.myjava.strivers.slidingwindow;

// https://leetcode.com/problems/minimum-size-subarray-sum/description/
public class MinLenSubArray_L209 {

	public static Object minSubArrayLen(int target, int[] nums) {
		int equalSum = 0;
		int minLen = Integer.MAX_VALUE;
		int left = 0, right = 0;
		while (right < nums.length && left <= right) {
			equalSum += nums[right];
			while (equalSum >= target && left <= right) {
				int len = right - left + 1;
				if (len < minLen) {
					minLen = len;
				}
				equalSum -= nums[left++];
			}

			right++;
		}
		return minLen == Integer.MAX_VALUE ? 0 : minLen;
	}

}
