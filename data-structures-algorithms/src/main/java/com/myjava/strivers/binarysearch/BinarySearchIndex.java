package com.myjava.strivers.binarysearch;

public class BinarySearchIndex {

	// https://leetcode.com/problems/binary-search/

	public static int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int mid = left + ((right - left) / 2); // overflow
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

	public static int searchRecursive(int[] nums, int target, int left, int right) {
		if (left > right) {
			return -1;
		}
		int mid = left + ((right - left) / 2); // overflow
		if (target == nums[mid]) {
			return mid;
		} else if (target < nums[mid]) {
			return searchRecursive(nums, target, left, mid - 1);
		} else {
			return searchRecursive(nums, target, mid + 1, right);
		}

	}
}
