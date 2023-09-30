package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/largest-rectangle-in-histogram/description/
public class LargestRectangleInHistogram {
	// Hint: Monotonic Increasing Stack.

	public static int largestArea(int[] arr) {
		int maxArea = 0;
		int n = arr.length;
		Stack<Integer> stk = new Stack<Integer>();
		for (int i = 0; i <= n; i++) {
			while (!stk.isEmpty() && (i == n || arr[stk.peek()] >= arr[i])) {
				int length = arr[stk.pop()];
				int width = 1;
				if (!stk.isEmpty()) {
					width = i - stk.peek() - 1;
				}
				maxArea = Math.max(maxArea, length * width);
			}
			stk.push(i);
		}
		return maxArea;
	}

	public static int largestArean(int[] arr) {
		int maxArea = Integer.MIN_VALUE;
		int n = arr.length;
		int[] leftMin = new int[n];
		int[] rightMin = new int[n];
		Stack<Integer> stk1 = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			while (!stk1.isEmpty() && arr[stk1.peek()] >= arr[i]) {
				stk1.pop();
			}
			if (stk1.isEmpty()) {
				leftMin[i] = 0;
			} else if (arr[stk1.peek()] < arr[i]) {
				leftMin[i] = stk1.peek() + 1;
			}
			stk1.push(i);
		}
		while (!stk1.isEmpty())
			stk1.pop();
		for (int i = n - 1; i >= 0; i--) {
			while (!stk1.isEmpty() && arr[stk1.peek()] >= arr[i]) {
				stk1.pop();
			}
			if (stk1.isEmpty()) {
				rightMin[i] = n - 1;
			} else if (arr[stk1.peek()] < arr[i]) {
				rightMin[i] = stk1.peek() - 1;
			}
			stk1.push(i);
		}
		for (int i = 0; i < n; i++) {
			int area = arr[i] * (rightMin[i] - leftMin[i] + 1);
			if (maxArea < area) {
				maxArea = area;
			}
		}
		return maxArea;
	}

	// O(n*n) More time Complexity.
	public static int largestAreas(int[] arr) {
		int maxArea = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			int b = 1;
			int l = arr[i];
			for (int j = i; j < arr.length; j++) {
				l = Math.min(l, arr[j]);
				int area = l * b;
				if (maxArea < area) {
					maxArea = area;
				}
				b++;
			}
		}
		return maxArea;
	}

}
