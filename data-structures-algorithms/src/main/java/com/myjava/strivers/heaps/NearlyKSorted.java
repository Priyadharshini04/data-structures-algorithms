package com.myjava.strivers.heaps;

import java.util.PriorityQueue;

// https://www.codingninjas.com/studio/problems/nearly-sorted_982937
public class NearlyKSorted {

	public static int[] nearlySorted(int[] array, int k) {
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		int[] ans = new int[array.length];
		int j = 0;
		for (int i = 0; i < array.length; i++) {
			pq1.offer(array[i]);
			if (pq1.size() > k) {
				ans[j++] = pq1.poll();
			}
		}
		while (!pq1.isEmpty()) {
			ans[j++] = pq1.poll();
		}
		return ans;
	}
}
