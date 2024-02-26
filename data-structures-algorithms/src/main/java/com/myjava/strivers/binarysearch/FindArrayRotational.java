package com.myjava.strivers.binarysearch;

//https://www.codingninjas.com/studio/problems/rotation_7449070
public class FindArrayRotational {

	public static int findKRotation(int[] nums) {
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
		return min;
	}

}
