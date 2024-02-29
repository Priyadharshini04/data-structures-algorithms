package com.myjava.strivers.binarysearch;

// https://leetcode.com/problems/find-peak-element/
public class FindPeakElement {

	public static int peakElement(int[] arr) {
		int n=arr.length;
		boolean check = (n == 1) || arr[0] > arr[1] || arr[n - 1] > arr[n - 2];
		if (check)
			return 1;
		else {
			int left = 0;
			int right = n - 2;
			while (left <= right) {
				int mid = left + ((right - left) / 2);
				if (mid > 0 && mid < n - 1 && arr[mid - 1] <= arr[mid] && arr[mid + 1] <= arr[mid]) {
					return 1;
				}
				if (mid > 0 && arr[mid - 1] > arr[mid]) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			return 0;
		}
	}

	public static int find(int[] nums) {

		if (nums.length == 1) {
			return 0;
		}
		if (nums[0] > nums[1]) {
			return 0;
		}
		if (nums.length - 2 >= 0 && nums[nums.length - 1] > nums[nums.length - 2]) {
			return nums.length - 1;
		}
		int left = 1;
		int right = nums.length - 2;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (nums[mid - 1] <= nums[mid] && nums[mid] >= nums[mid + 1]) {
				return mid;
			}
			if (nums[mid] < nums[mid - 1]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return 0;
	}

}
