package com.myjava.strivers.stackqueue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

//https://leetcode.com/problems/sliding-window-maximum/description/
public class SlidingWindowMaximum_L239 {

	// instead of stack use deque
	// TC: O(n)+O(n)
	// SC:O(k)
	public static int[] maxSlidingWindow(int[] nums, int k) {
		Deque<Integer> queue = new ArrayDeque<Integer>();
		int[] result = new int[nums.length - k + 1];
		int left = 0;
		int right = 0;
		while (right < nums.length) {
			if (queue.isEmpty()) {
				queue.offer(right);
			} else {
				if (nums[queue.getLast()] > nums[right]) {
					queue.addLast(right);
				} else {
					while (!queue.isEmpty() && nums[queue.getLast()] < nums[right]) {
						queue.removeLast();
					}
					queue.addLast(right);
				}
			}
			if (right - left + 1 == k) {
				result[left] = nums[queue.peek()];
				if (queue.peek() == left) {
					queue.poll();
				}
				left++;
			}
			right++;
		}
		return result;
	}

}
