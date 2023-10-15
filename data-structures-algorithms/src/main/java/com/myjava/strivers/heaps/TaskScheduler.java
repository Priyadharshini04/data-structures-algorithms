package com.myjava.strivers.heaps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

// https://leetcode.com/problems/task-scheduler/description/
public class TaskScheduler {
	// Hint Count the idle time.
	public static int leastInterval(char[] tasks, int n) {
		int totalIdleTime = 0;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < tasks.length; i++) {
			if (map.containsKey(tasks[i]))
				map.put(tasks[i], map.get(tasks[i]) + 1);
			else
				map.put(tasks[i], 1);
		}
		// Map Heap.
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>(Collections.reverseOrder());
		pq1.addAll(map.values());

		int maxFreq = pq1.poll();
		totalIdleTime = (maxFreq - 1) * n;
		while (!pq1.isEmpty()) {
			int currentFreq = pq1.poll();
			if (currentFreq == maxFreq) {
				totalIdleTime -= currentFreq;
				totalIdleTime += 1;
			} else {
				totalIdleTime -= currentFreq;
			}
		}
		if (totalIdleTime > 0) {
			return totalIdleTime + tasks.length;
		}
		return tasks.length;

	}

	// Doesn't work wrong approach
	public static int leastIntervals(char[] tasks, int n) {
		int left = 0;
		int right = 0;
		List<Character> list = new ArrayList<Character>();
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		while (right <= tasks.length && left <= tasks.length) {
			if (right < tasks.length && map.containsKey(tasks[right])) {
				if (right < tasks.length && right - map.get(tasks[right]) > n) {
					list.add(tasks[right]);
					map.put(tasks[right], right++);
				}
				right++;
			} else if (left < tasks.length && right == tasks.length) {
				if (!map.containsKey(tasks[left])) {
					list.add(tasks[left]);
					map.put(tasks[left], left++);
				} else if (left - map.get(tasks[left]) > n) {
					list.add(tasks[left]);
					map.put(tasks[left], left++);
				} else {
					list.add(' ');
					map.remove(tasks[left]);
					left++;
				}
				continue;
			} else if (right < tasks.length) {
				list.add(tasks[right]);
				map.put(tasks[right], right++);
			} else if (left < tasks.length) {
				list.add(tasks[left]);
				map.put(tasks[left], left++);
			}
		}
		return list.size();
	}
}
