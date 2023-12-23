package com.myjava.strivers.arrays;

public class DistinctSubKOdds {
	public static int distinctSubKOdds(int[] nums, int k) {
		int count = 0;
		int right = 0;
		int left = 0;
		int oddCount = 0;
		int temp = 0;
		while (right < nums.length) {
			if (nums[right] % 2 != 0) {
				++oddCount;
				temp = 0;
			}
			while (oddCount == k) {
				temp++;
				if (nums[left] % 2 != 0) {
					oddCount--;
				}
				left++;
			}
			count += temp;
			right++;
		}
		return count;
	}
}
