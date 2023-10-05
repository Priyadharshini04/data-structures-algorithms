package com.myjava.strivers.slidingwindow;

import java.util.ArrayDeque;
import java.util.Queue;

// https://leetcode.com/problems/max-consecutive-ones-iii/description/
public class MaxConsequetiveOnes_L1004 {
	
	// More optimized solution
	public static int longestOnes(int[] nums, int k) {
		int right = 0;
		int left = 0;
		for(right=0;right<nums.length;++right) {
			if(nums[right]==0) k--;
			if(k<0 && nums[left++]==0) k++;
		}
		return right-left;
	}

	
	public static int longestOnesss(int[] nums, int k) {
		int maxLen = 0;
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		int right = 0;
		int left = 0;
		while (right < nums.length && left < nums.length) {
			if (nums[right] == 0) {
				q1.add(right);
			}
			if(q1.size()==k+1)
			{
				left=q1.remove()+1;
			}
			maxLen = Math.max(maxLen, right - left + 1);
			right++;
		}
		return maxLen;
	}

	// Brute Force. More time complexity O(n*n)
	public static int longestOness(int[] nums, int k) {
		int maxLen = 0;
		for (int i = 0; i < nums.length; i++) {
			int flipped = k;
			for (int j = i; j < nums.length; j++) {
				if (flipped == 0 && nums[j] == 0) {
					break;
				}
				if (nums[j] == 0 && flipped > 0) {
					flipped--;
				}
				maxLen = Math.max(maxLen, j - i + 1);

			}
		}
		return maxLen;
	}

}
