package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/subsets-ii/
public class SubSetWithDuplicate {

	public static List<List<Integer>> findAllUniqueSubsets(int[] nums) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		findSubsets(nums, 0, list1, list2);
		return list2;
	}

	public static void findSubsets(int[] arr, int idx, List<Integer> list1, List<List<Integer>> list2) {
		list2.add(new ArrayList<Integer>(list1));

		for (int i = idx; i < arr.length; i++) {
			if (i != idx && arr[i] == arr[i - 1]) {
				continue;
			}
			list1.add(arr[i]);
			findSubsets(arr, i + 1, list1, list2);
			list1.remove(list1.size() - 1);
		}
	}
}
