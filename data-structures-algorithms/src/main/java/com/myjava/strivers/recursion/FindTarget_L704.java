package com.myjava.strivers.recursion;

// https://leetcode.com/problems/binary-search/
public class FindTarget_L704 {
	public static int find(int[] arr, int target) {
		return findIdx(arr, 0, arr.length, target, 0, arr.length-1);
	}

	private static int findIdx(int[] arr, int i, int length, int target, int left, int right) {
		if (left < right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				return mid;
			} else {
				if (arr[mid] > target) {
					right = mid - 1;
				} else {
					left = mid + 1;
				}
				return findIdx(arr, ++i, length, target, left, right);
			}
		}
		return -1;
	}
}
