package com.myjava.strivers.binarysearch;

import java.util.LinkedList;
import java.util.List;

//https://leetcode.com/problems/kth-missing-positive-number/description/
public class KthMissingPositiveInteger_L1539 {
	public static int findKthPositive(int[] arr, int k) {
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
