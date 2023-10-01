package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/sum-of-subarray-minimums/
public class SumOfSubArrayMin {

	// Monotonic Stack with mid element which will be smaller for left and right
	// subarrays.
	public static int sumSubarrayMin(int[] arr) {
		long count = 0;
		Stack<Integer> stk1 = new Stack<Integer>();
		int n = arr.length;
		long module=(long)1e9+7;
		for (int i = 0; i <= n; i++) {
			while (!stk1.isEmpty() && (i == n || arr[stk1.peek()] >= arr[i])) {
				int mid = stk1.pop();
				int high = i;
				// how many times a popped mid index is minimum value for the left sub array.
				int left= stk1.isEmpty()? mid+1: (mid-stk1.peek());
				
				// how many times a popped mid index is minimum value for the right sub array.
				int right = (high - mid);
				count += (long) (((long) arr[mid]) * left * right)%module;
			}
			stk1.push(i);
		}
		count%=module;
		int cnt=(int) count;
		return cnt;
	}

	// Brute force approach. More time complexity O(n*n).
	public static int sumSubarrayMins(int[] arr) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int min = Integer.MAX_VALUE;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < min) {
					min = arr[j];
				}
				count = (count + min) % 1000000007;
			}
		}
		return count;
	}

}
