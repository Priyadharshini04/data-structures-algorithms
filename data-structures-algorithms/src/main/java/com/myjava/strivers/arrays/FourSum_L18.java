package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//https://leetcode.com/problems/4sum/
public class FourSum_L18 {

	// To avoid set usage.
	// Optimal: O(n log n)+O(n^3). Sc: O(n)+O(n)
	public static List<List<Integer>> fourSum(int[] nums, int target) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();

		if (nums.length < 4 || (long) nums[0] + nums[1] + nums[2] + nums[3] > target || (long) nums[nums.length - 1]
				+ nums[nums.length - 2] + nums[nums.length - 3] + nums[nums.length - 4] < target) {
			return ans; // If not enough elements or impossible to achieve target, return empty list
		}

		for (int i = 0; i < nums.length - 3; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue; // Skip duplicates
			}

			for (int j = i + 1; j < nums.length - 2; j++) {
				if (j > i + 1 && nums[j] == nums[j - 1]) {
					continue; // Skip duplicates
				}

				int left = j + 1;
				int right = nums.length - 1;

				while (left < right) {
					long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

					if (sum == target) {
						ans.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

						// Skip duplicates for left pointer
						while (left < right && nums[left] == nums[left + 1]) {
							left++;
						}

						// Skip duplicates for right pointer
						while (left < right && nums[right] == nums[right - 1]) {
							right--;
						}

						left++;
						right--;
					} else if (sum < target) {
						left++;
					} else {
						right--;
					}
				}
			}
		}

		return ans;
	}

	// Brute Force O(n log n)+O(n^4). SC: O(1)
	// Better: O(n log n)+O(n^3). Sc: O(n)
	public static List<List<Integer>> fourSums(int[] nums, int target) {
		int n = nums.length;
		// HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//			for (int i = 0; i < n; i++) {
//				map.put(nums[i], i);
//			}
		Set<List<Integer>> set = new TreeSet<List<Integer>>((list1, list2) -> {
			for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
				int compare = Integer.compare(list1.get(i), list2.get(i));
				if (compare != 0)
					return compare;
			}
			return Integer.compare(list1.size(), list2.size());
		});
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();

		for (int left = 0; left < n; left++) {
			if (left > 0 && nums[left - 1] == nums[left])
				continue;
			for (int right = n - 1; right >= 0; right--) {
				if (right + 1 < n && nums[right + 1] == nums[right])
					continue;
				int mid = left + 1;
				int mid2 = right - 1;
				while (mid < mid2) {
					long sum = nums[left];
					sum += nums[right];
					sum += nums[mid];
					sum += nums[mid2];
					if (sum == target) {
						set.add(Arrays.asList(nums[left], nums[mid], nums[mid2], nums[right]));
						mid2--;
						mid++;
					} else if (sum > target) {
						mid2--;
					} else {
						mid++;
					}
					// To avoid duplicates.
//						while (mid2 > left && mid2 - 1 >=0 && nums[mid2 - 1] == nums[mid2] && mid < right
//								&& mid + 1 >= 0 && nums[mid + 1] == nums[mid]) {
//							mid2--;
//							mid++;
//						}
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

}
