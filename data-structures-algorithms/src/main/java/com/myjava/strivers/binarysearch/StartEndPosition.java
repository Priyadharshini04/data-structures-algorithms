package com.myjava.strivers.binarysearch;

public class StartEndPosition {
	//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
	
	public static int[] findStartandEndPosition(int[] nums, int target) {
		int start = -1;
		int end = -1;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			
			if (nums[mid] >= target) {
				right=mid-1;
			}
			else {		
				left = mid + 1;
			}
			if(nums[mid]==target && (start==-1 || start>mid))
			{
				start=mid;
			}
		}
		
		left = 0;
		right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] > target) {
				right=mid-1;
			}
			else {
				left = mid+1;
			}
			if(nums[mid]==target && (end==-1 || end<mid))
			{
				end=mid;
			}
		}
		if(start!=-1 && end==-1)
		{
			end=start;
		}
		return new int[] { start, end };
	}
}
