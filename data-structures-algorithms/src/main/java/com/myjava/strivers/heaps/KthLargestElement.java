package com.myjava.strivers.heaps;

import java.util.PriorityQueue;

// https://leetcode.com/problems/kth-largest-element-in-an-array/description/
public class KthLargestElement {

	public static int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
		for(int i=0;i<k;i++)
		{
			minHeap.offer(nums[i]);
		}
		for(int i=k;i<nums.length;i++)
		{
			if(nums[i]>minHeap.peek())
			{
				minHeap.poll();
				minHeap.offer(nums[i]);
			}
		}
		return minHeap.peek();
	}
}
