package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/
public class CombinationSumII {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();

		if (candidates.length == 0) {
			return list2;
		}
		if (candidates.length == 1) {
			if (target == candidates[0]) {
				list1.add(candidates[0]);
				list2.add(list1);
				return list2;
			} else {
				return list2;
			}
		}
		Arrays.sort(candidates);
		combinationSum(0, candidates, target, list1, list2);
		return list2;
	}

	// gives duplicates since elements are not unique
	public static void combinationSum(int idx, int[] arr, int target, List<Integer> list1, List<List<Integer>> list2) {

		if (target == 0) {
			list2.add(new ArrayList<Integer>(list1));
			return;
		}
		for (int i = idx; i < arr.length; i++) {
			if (i > idx && arr[i] == arr[i - 1]) // to not include duplicates
			{
				continue;
			}
			if (arr[i] > target) {
				break;
			}
			list1.add(arr[i]);
			combinationSum(i + 1, arr, target - arr[i], list1, list2);
			list1.remove(list1.size() - 1);
		}
	}
}
