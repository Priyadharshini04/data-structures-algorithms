package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {

	public static List<List<Integer>> combinationSum(int k, int n) {
		List<Integer> list1 = new ArrayList<Integer>();
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();
		if(k>n)
		{
			return list2;
		}
		if(n>45)
		{
			return list2;
		}
		int[] arr = new int[9];
		int j = 1;
		for (int i = 0; i < 9; i++) {
			arr[i] = j;
			j++;
		}

		findCombos(arr, n, k, 0, list1, list2);
		return list2;
	}

	public static void findCombos(int[] arr, int target, int size, int idx, List<Integer> list1,
			List<List<Integer>> list2) {
		if (list1.size() == size || idx==arr.length) {
			if (target == 0 && list1.size() == size) {
				list2.add(new ArrayList<Integer>(list1));
			}
			return;
		}
		if (arr[idx] > target) {
			return;
		}
		list1.add(arr[idx]);
		findCombos(arr, target - arr[idx], size, idx + 1, list1, list2);
		list1.remove(list1.size() - 1);
		findCombos(arr, target, size, idx + 1, list1, list2);
	}
}
