package com.myjava.strivers.arrays;

//https://leetcode.com/problems/merge-sorted-array/description/
public class MergeSortedArrays_L88 {

	// TC: O(n) SC:O(1)
	public static void merge(int[] a, int[] b) {
		int i = a.length - b.length - 1, j = b.length - 1, k = a.length - 1;
		while (j >= 0) {
			if (i >= 0) {
				if (a[i] < b[j]) {
					a[k--] = b[j--];
				} else {
					a[k--] = a[i--];
				}
			} else {
				a[k--] = b[j--];
			}

		}

	}

	// TC: O(n^2) SC:O(1)
	public static void merges(int[] a, int[] b) {
		int i = 0, j = 0;
		while (i < a.length - b.length && j < b.length) {
			boolean isgreat = false;
			j = 0;
			int temp = b[j]; // 2
			if (a[i] > b[j]) {
				isgreat = true;
			}
			while (j < b.length - 1 && a[i] > b[j + 1]) {
				b[j] = b[j + 1]; // b=3,4,4
				j++;
			}
			if (isgreat) {
				b[j] = a[i]; // b=2,3,4
				a[i] = temp; // 1,5,6
			}
			i++;
		}
		j = 0;
		while (j < b.length) {
			a[i++] = b[j++];
		}
	}

}
