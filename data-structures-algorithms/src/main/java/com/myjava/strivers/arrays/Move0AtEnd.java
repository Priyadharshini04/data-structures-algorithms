package com.myjava.strivers.arrays;

//https://www.codingninjas.com/studio/problems/ninja-and-the-zero-s_6581958?utm_source=striver
public class Move0AtEnd {

	public static int[] moveZeros(int n, int[] a) {
		for (int i = 0; i < a.length; i++) {
			int j = i;
			while (j < a.length && a[j] == 0) {
				j++;
			}
			if (a[i] <= 0 && j < a.length) {
				a[i] = a[j];
				a[j] = 0;
			}
		}
		return a;
	}

	public static int[] moveZeross(int n, int[] a) {
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= 0) {
			} else {
				a[j] = a[i];
				j++;
			}
		}
		while (j < a.length) {
			a[j] = 0;
			j++;
		}
		return a;
	}

	// Optimized O(n)
	public static int[] moveZero(int n, int[] a) {
		int left = 0;
		int right = 0;
		while (right < n) {
			if (a[right] != 0) {
				int temp = a[left];
				a[left] = a[right];
				a[right] = temp;
				left++;
			}
			right++;
		}
		return a;
	}

}
