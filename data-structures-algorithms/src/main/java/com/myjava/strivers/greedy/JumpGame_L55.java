package com.myjava.strivers.greedy;

// https://leetcode.com/problems/jump-game/description/
public class JumpGame_L55 {
	// Missed logic consider i as total number of jumps till.
	public static boolean canJumps(int[] nums) {
		if (nums.length <= 1) {
			return true;
		}
		if (nums[0] == 0) {
			return false;
		}
		int stepsLeft = nums[0];
		int i = 0;
		while (stepsLeft > 0) {
			if (i == nums.length - 1) {
				return true;
			}
			stepsLeft = Math.max(stepsLeft - 1, nums[i]);
			i++;
		}
		return false;
	}

	// brute force worked.
	public static boolean canJump(int[] nums) {

		for (int i = 0; i < nums.length - 1; i++) {
			int j = i;
			if (nums[i] == 0)
				break;
			while (j < nums.length) {
				if (nums[j] == 0)
					break;
				j += nums[j];
			}
			if (j >= nums.length - 1)
				return true;
		}
		return false;
	}
}
