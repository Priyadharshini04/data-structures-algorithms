package com.myjava.strivers.greedy;

// https://leetcode.com/problems/jump-game-ii/description/
public class JumpGame2_L45 {

	public static int minimumJumpTakenToReach(int[] nums) {
		int jumps = 0, currEnd = 0, currFarthest = 0;
	      for(int i = 0; i < nums.length - 1; i ++) {
	          currFarthest = Math.max(currFarthest, i + nums[i]);
	          if(i == currEnd) {
	              currEnd = currFarthest;
	              jumps ++;
	          }
	      }  
	      return jumps;
	}

}
