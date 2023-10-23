package com.myjava.strivers.arrays;

import java.util.HashMap;
import java.util.Map;

// https://leetcode.com/problems/two-sum/
public class TwoSum {

	// Optimal solution.
	public static int[] twoSum(int[] book, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < book.length; i++) {
			int remm = target - book[i];
			if (map.containsKey(remm)) {
				return new int[] { map.get(remm), i };
			}
			if (!map.containsKey(book[i]))
				map.put(book[i], i);
		}
		return new int[] { -1, -1 };
	}
}
