package com.myjava.strivers.arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class MaxSpending {
	public long maxSpending(int[][] values) {
		long maxSpen = 0;
		Queue<Integer> q1 = new PriorityQueue<Integer>();
		for (int i = 0; i < values.length; i++) {
			for (int j = values[0].length - 1; j >= 0; j--) {
				q1.offer(values[i][j]);
			}
		}
		long i = 1;
		while (!q1.isEmpty()) {
			maxSpen += i * q1.poll();
			i++;
		}
		return maxSpen;
	}
}
