package com.myjava.strivers.slidingwindow;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/subarrays-with-k-different-integers/description/
public class SubarrayswithKDifferentIntegers_L992 {
	// find (subArray with K distinct) - (subArray with K-1)
	// for k=2
	// (subArray with K distinct) is subArray with 1 and 2 will be calculated
	// (subArray with K-1) is subArray count with 1 element is calculated.
	// 12-5=7
	public static int subarraysWithKDistinct(int[] nums, int k) {
		return atMostKDistinct(nums, k) - atMostKDistinct(nums, k - 1);
	}

	public static int atMostKDistinct(int[] nums, int k) {
		int left = 0;
		int right = 0;
		int size = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		while (right < nums.length) {
			map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
			while (map.size() > k) {
				map.put(nums[left], map.get(nums[left]) - 1);
				if (map.get(nums[left]) == 0) {
					map.remove(nums[left]);
				}
				left++;
			}
			size += (right - left + 1);
			right++;
		}
		return size;
	}

}
