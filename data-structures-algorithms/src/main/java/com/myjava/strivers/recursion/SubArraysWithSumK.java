package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://www.codingninjas.com/studio/problems/subarrays-with-sum-%E2%80%98k'_6922076
public class SubArraysWithSumK {

	public static List<List<Integer>> subarraysWithSumK(int[] a, long k) {

		List<Integer> list1 = new ArrayList<Integer>();
		List<List<Integer>> list2 = new ArrayList<List<Integer>>();
		if (a.length == 0) {
			list2.add(list1);
			return list2;
		} else if (a.length == 1) {
			list1.add(a[0]);
			list2.add(list1);
		}
		subArraysWithSumK(a, 0L, list1, list2, 0, 0, k);
		return list2;
	}

	private static void subArraysWithSumK(int[] a, long l, List<Integer> list1, List<List<Integer>> list2, int i, int j,
			long k) {
		int left = 0;
		int right = 0;
		long sum = 0;
		while (right < a.length) {
			sum += a[right];
			list1.add(a[right]);
			while (sum > k && left < right) {
				sum -= a[left++];
				list1.remove(0);
			}
			if (sum == k) {
				list2.add(new ArrayList<>(list1));
			}
			right++;
		}
	}

	public static void subSequenceWithSumK(int[] arr, long sum, List<Integer> list1, List<List<Integer>> list2,
			int start, int curr, long k) {
		if (curr < arr.length && sum <= k) {
			if (sum == k) {
				List<Integer> temp = new ArrayList<>(list1);
				list2.add(temp);
				return;
			}
			sum += arr[curr];
			list1.add(arr[curr]);
			subArraysWithSumK(arr, sum, list1, list2, start, curr + 1, k);
			if (list1.size() > 0) {
				int num = list1.get(list1.size() - 1);
				list1.remove(list1.size() - 1);
				sum -= num;
			}

			subArraysWithSumK(arr, sum, list1, list2, start, curr + 1, k);
		}
	}

}
