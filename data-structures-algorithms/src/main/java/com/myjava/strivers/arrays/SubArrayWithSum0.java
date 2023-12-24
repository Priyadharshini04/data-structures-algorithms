package com.myjava.strivers.arrays;

import java.util.HashMap;
import java.util.TreeMap;

public class SubArrayWithSum0 {

	// Instead of using two maps use one map itself.
	public static int findSubArray(int[] arr) {
		int maxlen = 0;
		int sum = 0;
		int len = 0;
		TreeMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
		HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == 0)
				maxlen = Math.max(maxlen, i + 1);

			if (map.containsKey(sum)) {
				len = i - map.get(sum);
//				if (!map1.containsKey(sum)) {
//					map1.put(sum, map.get(sum));
//					len = i - map.get(sum);
//				}
			} else
				map.put(sum, i);
			maxlen = Math.max(maxlen, len);
		}
		return maxlen;
	}

}
