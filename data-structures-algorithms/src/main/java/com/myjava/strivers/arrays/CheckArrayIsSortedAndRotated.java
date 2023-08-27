package com.myjava.strivers.arrays;
//https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
public class CheckArrayIsSortedAndRotated {
	public static boolean check(int[] nums) {
        int n=nums.length-1;
        int i=0;
        while(i<n)
        {
            if(nums[i]>nums[i+1])
            {
                break;
            }
            i++;
        }
        int center=i;
        i+=1;
        while(i<n)
        {
            if(nums[i]>nums[i+1] || nums[i]>nums[center] || nums[i+1]>nums[center])
            {
                return false;
            }
            i++;
        }
        return true;
    }
}
