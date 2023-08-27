package com.myjava.strivers.arrays;

import java.util.HashMap;
import java.util.Map;
// https://www.codingninjas.com/studio/problems/reading_6845742?utm_source=striver
public class TargetBookRead {
	public static String read(int n, int[] book, int target) {
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {
				if (book[i] + book[j] == target) {
					return "YES";
				}
			}
		}
		return "NO";
	}
	//O(n) solution
	public static String readOptimized(int n, int[] book, int target) {
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			int complement=target-book[i];
			if(map.containsKey(complement) ) {
				return "YES";
			}
			map.put(target-book[i], i);
		}
		return "NO";
	}
}
