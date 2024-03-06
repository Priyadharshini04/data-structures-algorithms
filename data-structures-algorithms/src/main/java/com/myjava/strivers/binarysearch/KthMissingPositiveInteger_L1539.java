package com.myjava.strivers.binarysearch;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/kth-missing-positive-number/description/
public class KthMissingPositiveInteger_L1539 {

	// TC: O(log n) SC:O(1)
	public static int findKthPositive(int[] arr, int k) {
		// 2,3,4,7,11 // 9
		int min = 0;
		int max = arr.length - 1;
		int missingIdxMin = 0;
		int missingIdxMax = arr.length - 1;
		while (min <= max) {
			int mid = min + ((max - min) / 2);
			int missingCount = arr[mid] - (mid + 1);
			if (missingCount >= k) {
				missingIdxMax = mid;
				max = mid - 1;
			} else {
				missingIdxMin = mid;
				min = mid + 1;
			}
		}
		if (missingIdxMin == missingIdxMax && missingIdxMin == 0 && k < arr[missingIdxMin])
			return k;
		int count = k - (arr[missingIdxMin] - (missingIdxMin + 1));
		int number = arr[missingIdxMin] + count;
		return number;
	}

	// TC: O(n) SC:O(n)
	public static int findKthPositives(int[] arr, int k) {
		int number = 1;
		List<Integer> list = new LinkedList<>();
		int i = 0;
		while (i < arr.length) {
			if (arr[i] != number) {
				list.add(number);
				number++;
			} else {
				i++;
				number++;
			}
		}
		while (list.isEmpty() || list.size() <= k) {
			list.add(number++);
		}
		return list.get(k - 1);
	}
}
