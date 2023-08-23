package com.myjava.strivers.binarysearch;

//https://leetcode.com/problems/single-element-in-a-sorted-array/
public class SingleElement {

	public static int find(int[] nums) {
		if(nums.length==1)
		{
			return nums[0];
		}
		else if(nums.length==2 )
		{
			if(nums[0]!=nums[1])
			return nums[0];
			else
			return -1;
		}
		if(nums[0]!=nums[1])
		{
			return nums[0];
		}
		if(nums[nums.length-1]!=nums[nums.length-2])
		{
			return nums[nums.length-1];
		}
		int left=1;
		int right=nums.length-2;
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(nums[mid-1]!=nums[mid] && nums[mid+1]!=nums[mid])
			{
				return nums[mid];
			}
			else if( (mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0 && nums[mid]==nums[mid+1]))
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
