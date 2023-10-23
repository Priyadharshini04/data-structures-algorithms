package com.myjava.strivers.arrays;

// https://leetcode.com/problems/sort-colors/description/
public class Sort012 {

	// O(n) Dutch national flag algorithm
	public static int[] sortColors(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		while (mid <= high && low <= mid && high >= mid) {
			if (nums[mid] == 0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				mid++;
				low++;
			} else if (nums[mid] == 1) {
				mid++;
			} else if (nums[mid] == 2) {
				int temp = nums[mid];
				nums[mid] = nums[high];
				nums[high] = temp;
				high--;
			}
		}
		return nums;
	}

	// Better approach O(n+n)=O(2n)
	public static void sortColor(int[] nums) {
		int[] color = new int[3];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				color[0]++;
			}
			if (nums[i] == 1) {
				color[1]++;
			}
			if (nums[i] == 2) {
				color[2]++;
			}
		}
		int i = 0;
		int j = 0;
		while (j < color[0]) {
			nums[i] = 0;
			j++;
			i++;
		}
		j = 0;
		while (j < color[1]) {
			nums[i] = 1;
			j++;
			i++;
		}
		j = 0;
		while (j < color[2]) {
			nums[i] = 2;
			j++;
			i++;
		}
	}
}
