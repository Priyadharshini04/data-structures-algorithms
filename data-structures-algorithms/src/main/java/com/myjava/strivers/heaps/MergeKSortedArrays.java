package com.myjava.strivers.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

// https://www.codingninjas.com/studio/problems/merge-k-sorted-arrays_975379
public class MergeKSortedArrays {

	public static ArrayList<Integer> mergeKSortedArrays(List<List<Integer>> kArrays, int k) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		PriorityQueue<Integer> q1 = new PriorityQueue<Integer>();
		for (int i = 0; i < kArrays.size(); i++) {
			for (int j = 0; j < kArrays.get(i).size(); j++) {
				q1.offer(kArrays.get(i).get(j));
			}
		}
		while(!q1.isEmpty())
		{
			arrList.add(q1.poll());
		}
		return arrList;
	}

}
