package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Stack;

//https://www.codingninjas.com/studio/problems/number-of-inversions_6840276?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class NumberOfInversions {

	// this will never work for increasing order.
	public static int numberOfInversionss(int[] a) {
		int count = 0;
		Stack<Integer> stk = new Stack<Integer>();
		for (int i = 0; i < a.length; i++) {
			while (!stk.isEmpty() && stk.peek() < a[i]) {
				stk.pop();
				count += stk.size();
			}
			stk.push(a[i]);
		}
		while (!stk.isEmpty()) {
			stk.pop();
			count += stk.size();
		}
		return count;
	}

	public static int numberOfInversions(int[] a) {
		int[] count = new int[] { 0 };
		mergeSort(a, 0, a.length - 1, count);
		return count[0];
	}

	private static void mergeSort(int[] a, int left, int right, int count[]) {
		if (left >= right)
			return;
		else {
			int mid = left + ((right - left) / 2);
			mergeSort(a, left, mid, count);
			mergeSort(a, mid + 1, right, count);
			merge(a, left, right, mid, count);
		}
	}

	private static int merge(int[] a, int left, int right, int center, int[] count) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int l = left;
		int r = center + 1;
		while (l <= center && r <= right) {
			if (a[l] < a[r]) {
				arr.add(a[l]);
				l++;
			} else {
				count[0] += (center - l + 1);
				arr.add(a[r]);
				r++;
			}
		}
		while (l <= center) {
			arr.add(a[l]);
			l++;
		}
		while (r <= right) {
			arr.add(a[r]);
			r++;
		}
		int j = 0;
		for (int i = left; i <= right; i++) {
			a[i] = arr.get(j++);
		}
		return count[0];
	}
}
