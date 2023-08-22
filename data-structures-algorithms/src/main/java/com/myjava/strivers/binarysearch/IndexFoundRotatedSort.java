package com.myjava.strivers.binarysearch;
//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
public class IndexFoundRotatedSort {
	public static boolean search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right && left <= nums.length-1 && right >= 0) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return true;
			}
			if (nums[mid] == nums[left] && (nums[mid] == nums[right])) {
				left = +1;
				right -= 1;
			} else if (nums[mid] == nums[left]) {
				left += 1;
			} else if (nums[mid] == nums[right]) {
				right -= 1;
			} else if (nums[mid] >= nums[left]) {

				if ((nums[left] <= target && nums[mid] >= target)) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			} else {
				if (nums[right] >= target && nums[mid] <= target) {
					left = mid + 1;
				} else {
					right = mid - 1;
				}
			}
		}
		return false;
	}
}
