package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

//https://leetcode.com/problems/3sum/
public class Three3Sum_L15 {

	// TC: O(n log n)+O(n^2) ASC: O(no.of triplets)
	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1])
				continue;
			int j = i + 1;
			int k = nums.length - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum < 0)
					j++;
				else if (sum > 0)
					k--;
				else {
					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1]) {
						j++;
					}
					while (k > j && nums[k] == nums[k + 1]) {
						k--;
					}
				}
			}
		}
		return list;
	}

	// TC: O(n^2 log n) ASC: 2*O(no.of triplets)+O(n).
	public static List<List<Integer>> threeSumss(int[] nums) {
		Map<Integer, Integer> num = new HashMap<Integer, Integer>();
		Set<List<Integer>> set = new TreeSet<List<Integer>>((list1, list2) -> {
			for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
				int cmp = Integer.compare(list1.get(i), list2.get(i));
				if (cmp != 0) {
					return cmp;
				}
			}
			return Integer.compare(list1.size(), list2.size());
		});
		for (int i = 0; i < nums.length; i++) {
			num.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				int twoSum = 0 - (nums[i] + nums[j]);
				if (num.containsKey(twoSum) && num.get(twoSum) != i && num.get(twoSum) != j) {
					List<Integer> result = new ArrayList<Integer>();
					result.add(nums[i]);
					result.add(nums[j]);
					result.add(twoSum);
					Collections.sort(result);
					set.add(result);
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

	// TC: O(n^3 log n) ASC: 2*O(no.of triplets).
	public static List<List<Integer>> threeSums(int[] nums) {
		Arrays.sort(nums);
		Set<List<Integer>> set = new TreeSet<List<Integer>>((list1, list2) -> {
			for (int i = 0; i < Math.min(list1.size(), list2.size()); i++) {
				int cmp = Integer.compare(list1.get(i), list2.get(i));
				if (cmp != 0) {
					return cmp;
				}
			}
			return Integer.compare(list1.size(), list2.size());
		});
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						set.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
					}
				}
			}
		}
		return new ArrayList<List<Integer>>(set);
	}

}
