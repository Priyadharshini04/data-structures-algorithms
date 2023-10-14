package com.myjava.strivers.heaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.PriorityQueue;

// https://www.codingninjas.com/studio/problems/replace-each-element-of-array-with-its-corresponding-rank_975384
public class ReplaceArrayElementWithRank {

	public static List<Integer> replaceWithRank(List<Integer> arr) {
		List<Integer> list = new ArrayList<Integer>();
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (Integer num : arr) {
			pq1.offer(num);
		}
		int i = 1;
		while (!pq1.isEmpty()) {
			if (!hm.containsKey(pq1.peek()))
				hm.put(pq1.poll(), i++);
			else
				pq1.poll();

		}
		for (Integer num : arr) {
			list.add(hm.get(num));
		}
		return list;
	}

}
