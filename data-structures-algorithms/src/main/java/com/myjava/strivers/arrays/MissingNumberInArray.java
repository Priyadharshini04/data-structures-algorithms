package com.myjava.strivers.arrays;

import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingNumberInArray {

	public static int missingNumber(int[] nums) {
		Arrays.sort(nums);
		int i = 0;
		while (i < nums.length) {
			if (nums[i] != i) {
				return i;
			}
			i++;
		}
		return i;
	}
	
	public static int missingNumberOptimized(int[] nums)
	{
		int xor=0, i=0;
		while(i<nums.length)
		{
			xor=xor^nums[i]^i;
			i++;
		}
		return xor^i;
	}
}
