package com.myjava.strivers.arrays;

//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckArrayIsSortedAndRotated {
	public static boolean check(int[] nums) {
		int n = nums.length - 1;
		int rotation = 0;
		while (rotation < n) {
			if (nums[rotation + 1] < nums[rotation]) {
				break;
			}
			rotation++;
		}
		if (rotation == n) {
			return true;
		}
		for (int i = rotation + 1; i < n + 1; i++) {
			if ((i + 1 <= n && nums[i + 1] < nums[i]) || nums[0] < nums[i]) {
				return false;
			}
		}
		return true;
	}
}
