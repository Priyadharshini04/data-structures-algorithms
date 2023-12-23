package com.myjava.strivers.arrays;

import java.util.HashMap;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubArraySumEqualsK {
	public static int subarraySum(int[] nums, int k) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 != 0) {
				nums[i] = 1;
			} else {
				nums[i] = 0;
			}
		}
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxCount = 0;
		int i = 0, j = 0;
		while (i < nums.length) {

		}
		return maxCount;
	}
}