package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//https://leetcode.com/problems/combination-sum/
public class CombinationSum {

	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();
		if (candidates.length < 0) {
			return list2;
		}
		if (candidates.length == 1) {
			if (target < candidates[0]) {
				return list2;
			}
		}

//		Set<Integer> set = new HashSet<Integer>();
//		while (i < candidates.length) {
//			set.add(candidates[i]);
//			i++;
//		}
		findCombos(candidates, 0, target, 0, list1, list2);
		return list2;
	}

	// O(2^(target*k)) k is average length. SC:O(k*x)
	public static void findCombos(int[] arr, int sum, int k, int idx, List<Integer> list1, List<List<Integer>> list2) {
		if (sum > k) {
			return;
		}
		if (sum == k) {
			list2.add(new ArrayList<Integer>(list1));
			return;
		}
		if (idx == arr.length) {
			if (sum == k) {
				list2.add(new ArrayList<Integer>(list1));
			}
			return;
		}
		list1.add(arr[idx]);
		findCombos(arr, sum + arr[idx], k, idx, list1, list2);
		list1.remove(list1.size() - 1);
		findCombos(arr, sum, k, idx + 1, list1, list2);
	}

	// Returns duplicates combos
	public static void findCombos(int[] arr, Set<Integer> set, int sum, int k, int idx, List<Integer> list1,
			List<List<Integer>> list2) {
		if (idx == arr.length) {
			return;
		}
		if (arr[idx] == k) {
			list2.add(Arrays.asList(arr[idx]));
		} else if (arr[idx] < k) {
			list1 = new ArrayList<Integer>();
			if (k % arr[idx] == 0) {
				int div = k / arr[idx];
				while (div > 0) {
					list1.add(arr[idx]);
					div--;
				}
				list2.add(list1);
			} else {
				sum = 0;
				while (sum <= k) {
					sum += arr[idx];
					list1.add(arr[idx]);
					if (set.contains(k - sum)) {
						List<Integer> tempList = new ArrayList<Integer>();
						tempList.addAll(list1);
						tempList.add(k - sum);
						list2.add(tempList);
					}
				}
			}
		}
		findCombos(arr, set, sum, k, idx + 1, list1, list2);
	}
}
