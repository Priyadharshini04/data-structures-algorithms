package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReversePairs_L493 {

	public static int reversePairs(int[] nums) {
		int[] count = new int[] { 0 };
		merge(0, nums.length - 1, count, nums);
		return count[0];
	}

	public static void merge(int l, int r, int[] count, int[] nums) {
		if (l < r) {
			int mid = l + ((r - l) / 2);
			merge(l, mid, count, nums);
			merge(mid + 1, r, count, nums);
			countPairs(l, r, mid, count, nums);
			mergeSort(l, r, mid, count, nums);
		}
	}

	private static void countPairs(int l, int r, int mid, int[] count, int[] nums) {
		int left = l;
		int right = mid + 1;
		while (left <= mid) {
			while (right <= r && nums[left] > nums[right] * 2L) {
				right++;
			}
			count[0] += (right - (mid + 1));
			++left;
		}
	}

	private static void mergeSort(int l, int r, int mid, int[] count, int[] nums) {
		List<Integer> list = new ArrayList<Integer>();
		int left = l;
		int right = mid + 1;
		while (left <= mid && right <= r) {
			if (nums[left] <= nums[right]) {
				list.add(nums[left++]);
			} else {
				list.add(nums[right++]);
			}
		}
		while (left <= mid) {
			list.add(nums[left++]);
		}
		while (right <= r) {
			list.add(nums[right++]);
		}
		for (int i = l; i <= r; i++) {
			nums[i] = list.get(i - l);
		}
	}

}
