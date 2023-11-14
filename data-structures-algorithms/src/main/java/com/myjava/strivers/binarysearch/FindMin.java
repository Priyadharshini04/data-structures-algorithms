package com.myjava.strivers.binarysearch;

//https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
public class FindMin {

	public static int findMinVal(int[] nums) {
		int min = 0;
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[right] < nums[left]) {
				min = right;
			} else {
				right = mid - 1;
			}
			if (nums[mid] < nums[min]) {
				min = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return nums[min];
	}
}
