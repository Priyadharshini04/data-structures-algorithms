package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/sum-of-subarray-ranges/description/
public class SumOfSubArrayRanges {

	// hint: sum of max stack-min stack
	public static long subArrayRanges(int[] nums) {
		long minSum = 0;
		long maxSum = 0;
		Stack<Integer> stack = new Stack<Integer>();
		int n = nums.length;
		for (int i = 0; i <= n; i++) {
			while (!stack.isEmpty() && (i == n || nums[stack.peek()] >= nums[i])) {
				int mid = stack.pop();
				int left = mid - (stack.isEmpty() ? -1 : stack.peek());
				int right = i - mid;
				minSum += (long) ((long) (nums[mid]) * (long) (left * right));

			}
			stack.push(i);
		}
		stack.clear();
		for (int i = 0; i <= n; i++) {
			while (!stack.isEmpty() && (i == n || nums[stack.peek()] <= nums[i])) {
				int mid = stack.pop();
				int left = mid - (stack.isEmpty() ? -1 : stack.peek());
				int right = i - mid;
				maxSum += (long) ((long) (nums[mid]) * (long) (left * right));
			}
			stack.push(i);
		}
		return maxSum - minSum;
	}

	// Brute force.
	public static long subArrayRange(int[] nums) {
		long count = 0;
		for (int i = 0; i < nums.length; i++) {
			int min = nums[i];
			int max = nums[i];
			for (int j = i; j < nums.length; j++) {
				if (min > nums[j]) {
					min = nums[j];
				}
				if (max < nums[j]) {
					max = nums[j];
				}
				count += (max - min);
			}
		}
		return count;
	}

}
