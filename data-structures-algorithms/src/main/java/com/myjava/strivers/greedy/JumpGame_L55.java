package com.myjava.strivers.greedy;

// https://leetcode.com/problems/jump-game/description/
public class JumpGame_L55 {
	// Missed logic consider i as total number of jumps till.
	public static boolean canJump(int[] nums) {
		if(nums.length<=1)
		{
			return true;
		}
		if(nums[0]==0)
		{
			return false;
		}
		int stepsLeft=nums[0];
		int i=0;
		while(stepsLeft>0)
		{
			if(i==nums.length-1)
			{
				return true;
			}
			stepsLeft=Math.max(stepsLeft-1, nums[i]);
			i++;
		}
		return false;
	}

}
