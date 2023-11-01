package com.myjava.strivers.greedy;

// https://leetcode.com/problems/jump-game-ii/description/
public class JumpGame2_L45 {

	public static int minimumJumpTakenToReach(int[] nums) {
		int reachable = 0;
		int i = 0;
		while (i < nums.length - 1) {
			if (reachable >= nums.length - 1) {
				return i;
			}
			reachable +=nums[i];
			i++;
		}
		return i;
	}

}
