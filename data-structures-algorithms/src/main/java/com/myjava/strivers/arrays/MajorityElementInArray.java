package com.myjava.strivers.arrays;

import java.util.Map;
import java.util.LinkedHashMap;

//https://leetcode.com/problems/majority-element
public class MajorityElementInArray {

	public static int majorityElement(int[] v) {
		Map<Integer, Integer> mp = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < v.length; i++) {
			if (mp.containsKey(v[i])) {
				mp.put(v[i], mp.get(v[i]) + 1);
			} else {
				mp.put(v[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
			if (entry.getValue() > (v.length / 2)) {
				return entry.getKey();
			}
		}
		return 0;
	}

	// time and space complexity
	public static int majorityElementOpti(int[] v) {
		int major = v[0], count = 1;
		for (int i = 1; i < v.length; i++) {
			if (count == 0) {
				major = v[i];
			}
			if (major == v[i]) {
				count++;
			} else {
				count--;
			}
		}
		return major;
	}
}
