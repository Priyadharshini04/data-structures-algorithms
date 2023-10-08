package com.myjava.strivers.slidingwindow;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

// https://www.codingninjas.com/studio/problems/fruits-and-baskets_985356
public class FruitsAndBaskets {
	// picks till the last tree.
	public static int findMaxFruits2(int[] arr) {
		int maxFruits = 0;
		for (int i = 0; i < arr.length; i++) {
			int pickTree = arr[i];
			int nextPick = -1;
			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (pickTree == arr[j] || nextPick == arr[j]) {
					++count;
				} else if (nextPick == -1) {
					nextPick = arr[j];
					++count;
				}
			}
			maxFruits = Math.max(maxFruits, count);
		}
		return maxFruits;
	}

	public static int findMaxFruits1(int[] arr) {
		int maxFruits = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		int max = 0;
		int maxNum = 0;
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (max < entry.getValue()) {
				max = entry.getKey();
				maxNum = entry.getKey();
			}
		}
		int nextTree = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == max || (nextTree != -1 && arr[i] == nextTree)) {
				maxFruits += 1;
			} else if (maxFruits > 0 && nextTree == -1) {
				nextTree = arr[i];
			}
		}
		return maxFruits;
	}

	public static int findMaxFruits0(int[] arr) {
		int maxFruits = 0;
		int left = 0;
		int right = 0;
		Queue<Integer> q1 = new ArrayDeque<Integer>();
		while (right < arr.length) {
			if (right - 1 >= 0 && arr[right] != arr[right - 1]) {
				q1.add(right);
			}
			if (q1.size() == 2) {
				maxFruits = Math.max(maxFruits, right - left);
				left = q1.poll();
			}
			right++;
		}
		return Math.max(maxFruits, right - left);
	}

	// Use map instead of queue
	public static int findMaxFruits(int[] arr) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int l = 0, total = 0, ans = 0;
		for (int r = 0; r < arr.length; r++) {
			int fruit = arr[r];
			if (map.containsKey(fruit)) {
				map.put(fruit, map.get(fruit) + 1);
			} else {
				map.put(fruit, 1);
			}
			total++;
			while (map.size() > 2) {
				int remFruit = arr[l++];
				map.put(remFruit, map.get(remFruit) - 1);
				total--;
				if (map.get(remFruit) == 0) {
					map.remove(remFruit);
				}
			}
			ans = Math.max(ans, total);
		}
		return ans;
	}
}
