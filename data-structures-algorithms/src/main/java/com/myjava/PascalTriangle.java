package com.myjava;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class PascalTriangle {

	// more space.
	public static List<Long> nthRowOfPascalTriangle(int n) {
		List<Long> list = new ArrayList<Long>();
		Queue<Long> queue = new ArrayDeque<Long>();
		queue.offer(1L);
		int i = 2, j = 1;
		while (i <= n) {
			j = 1;
			while (j <= i) {
				if (j == 1 || j == i) {
					queue.offer(1L);
					if (i == j && !queue.isEmpty()) {
						queue.poll();
					}
				} else {
					if (!queue.isEmpty()) {
						queue.offer( ( queue.poll() + queue.peek() ) % 1000000007 );
					}
				}
				j++;
			}
			i++;
		}
		while (!queue.isEmpty()) {
			list.add(queue.poll());
		}
		return list;
	}

}
