package com.myjava.strivers.binarysearch;
// https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {

	public static int find(int[] nums) {
		int left=0;
		int right=nums.length-1;
		if(nums.length-2 >=0 && nums[nums.length-1]>nums[nums.length-2])
		{
			return nums.length-1;
		}
		else if(left+1 < nums.length && nums[left]>nums[left+1])
		{
			return left;
		}
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			
			if(mid-1>=0 && mid+1 <nums.length && nums[mid-1]<=nums[mid] && nums[mid]>=nums[mid+1])
			{
				return mid;
			}
			if(mid-1>=0 && nums[mid-1]<=nums[mid] || (mid==0 && mid+1 <nums.length && nums[mid]<=nums[mid+1]))
			{
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		return 0;
	}

}
