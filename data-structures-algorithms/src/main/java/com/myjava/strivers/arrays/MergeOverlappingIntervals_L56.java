package com.myjava.strivers.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

//https://leetcode.com/problems/merge-intervals/description/
public class MergeOverlappingIntervals_L56 {

	// O(n logn + n+n) SC:O(n)
	public static int[][] merge(int[][] intervals) {
		List<int[]> resultList = new LinkedList<>();
		Arrays.sort(intervals, (a, b) -> {
			return a[0] - b[0] != 0 ? a[0] - b[0] : a[1] - b[1]; // Sort based on the first element of each row
		});
//		PriorityQueue<int[]> pq = new PriorityQueue<int[]>((a, b) -> {
//			int a0 = a[0];
//			int b0 = b[0];
//			int a1 = a[1];
//			int b1 = b[1];
//			if (a0 - b0 == 0) {
//				return a1 - b1;
//			}
//			return a0 - b0;
//		});
//
//		for (int i = 0; i < intervals.length; i++) {
//			pq.offer(new int[] { intervals[i][0], intervals[i][1] });
//		}
		int i = 0;
		int j = 0;
		while (j < intervals.length) {
			int[] arr = intervals[j];
			if (resultList.isEmpty()) {
				resultList.add(intervals[j]);
				i++;
			} else {
				int prevStart = resultList.get(i - 1)[0];
				int prevEnd = resultList.get(i - 1)[1];
				if (prevStart <= arr[0] && prevEnd >= arr[0]
//						&& resultList.get(i - 1).get(1) <= arr[1]
				) {
					if (prevEnd <= arr[1])
						resultList.get(i - 1)[1]= arr[1];
				} else {
					resultList.add(intervals[j]);
					i++;
				}
			}
			j++;
		}
//		int[][] result = new int[resultList.size()][];
//		i = 0;
//		while (i < resultList.size()) {
//			result[i] = new int[] { resultList.get(i).get(0), resultList.get(i).get(1) };
//			i++;
//		}
		return resultList.toArray(new int[resultList.size()][]);
	}

}