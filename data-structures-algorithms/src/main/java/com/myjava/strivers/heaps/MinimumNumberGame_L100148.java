package com.myjava.strivers.heaps;

import java.util.PriorityQueue;

public class MinimumNumberGame_L100148 {
	public int[] numberGame(int[] nums) {
		int[] ans = new int[nums.length];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < nums.length; i++) {
			pq.offer(nums[i]);
		}
		int i = 0;
		while (!pq.isEmpty()) {
			int alice = pq.poll();
			int bob = pq.poll();
			ans[i++] = bob;
			ans[i++] = alice;
		}
		return ans;
	}
}
