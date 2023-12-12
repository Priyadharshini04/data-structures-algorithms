package com.myjava.strivers.arrays;

import java.util.*;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] { 1, 3, 2 };
		nextPermutation(nums);
		System.out.println(Arrays.toString(nums));
	}

	public static void nextPermutation(int[] nums) {
		int breakPoint = -1;
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] < nums[i + 1]) {
				breakPoint = i;
				break;
			}
		}
		if (breakPoint == -1) {
			reverse(nums, 0, nums.length - 1);
			return;
		}
		for (int i = nums.length - 1; i >= breakPoint; i--) {
			if (nums[i] > nums[breakPoint]) {
				int temp = nums[breakPoint];
				nums[breakPoint] = nums[i];
				nums[i] = temp;
				break;
			}
		}
		reverse(nums, breakPoint + 1, nums.length - 1);
	}

	public static void reverse(int[] nums, int start, int end) {
		int j = start;
		int center = (end + start) / 2;
		for (int i = end; i > center; i--) {
			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			j++;

		}
	}
}
