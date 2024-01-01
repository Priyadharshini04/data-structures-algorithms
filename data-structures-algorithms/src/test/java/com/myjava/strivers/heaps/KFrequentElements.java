package com.myjava.strivers.heaps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

//https://leetcode.com/problems/top-k-frequent-elements/description/
public class KFrequentElements {

	// Time complexity: O(n)+O(n)+O(n). SC: O(n)+O(n)+O(n)
	public static int[] topKFrequent(int[] nums, int k) {
		List<Integer>[] bucket = new ArrayList[nums.length + 1];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int uniqueEle = 0;
		for (int num : nums) {
			min = Math.min(num, min);
			max = Math.max(num, max);
		}
		int[] counter = new int[max - min + 1];
		for (int num : nums) {
			counter[num - min]++;
		}
		for (int i = 0; i < counter.length; i++) {
			if (counter[i] > 0) {
				int val = i + min;
				int freq = counter[i];
				if (bucket[freq] == null) {
					bucket[freq] = new ArrayList<Integer>();
				}
				if (freq == 1)
					uniqueEle++;
				bucket[freq].add(val);
			}
		}
		if (uniqueEle == nums.length)
			k = nums.length;
		int index = 0;
		int[] res = new int[k];
		int ptr = nums.length;
		while (index < k) {
			if (bucket[ptr] != null) {
				for (int val : bucket[ptr]) {
					res[index++] = val;
					if (index == k)
						return res;
				}
			}
			ptr--;
		}
		return res;
	}

	// high time complexity O(n log n)+O(n log n)+O(n). Space compexity is
	// O(n)+O(n)+O(n)
	public static int[] topKFrequentss(int[] nums, int k) {
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>();
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> map.get(b) - map.get(a));
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		for (int key : map.keySet()) {
			pq.offer(key);
		}
		if (pq.size() == nums.length)
			k = nums.length;
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			result[i] = pq.poll();
		}
		return result;
	}

	// doesn't work. sort the elements based on freq and take the first k elements.
	// miss understanding of the problem.
	public static int[] topKFrequents(int[] nums, int k) {
		int count = 1;
		Arrays.sort(nums);
		int uniqueEle = 1;
		Set<Integer> list = new TreeSet<>();
		for (int i = 1; i < nums.length; i++) {
			if (nums[i - 1] != nums[i]) {
				if (count == 1)
					uniqueEle++;
				else if (i == 1)
					uniqueEle = 0;
				if (count >= k) {
					list.add(nums[i - 1]);
				}
				count = 1;
			} else {
				++count;
			}
		}
		if (count >= k) {
			list.add(nums[nums.length - 1]);
		}
		if (list.size() == 0 && uniqueEle == k) {
			return nums;
		}
		int[] result = new int[list.size()];
		int i = 0;
		for (int ele : list) {
			result[i++] = ele;
		}
		return result;
	}

}
