package com.myjava.strivers.arrays;

import java.util.Stack;

//https://www.codingninjas.com/studio/problems/number-of-inversions_6840276?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class NumberOfInversions {
	static int count = 0;

	public static int numberOfInversions(int[] a) {

		mergeSort(a, 0, a.length - 1);
		return count;
	}

	private static int mergeSort(int[] a, int left, int right) {
		// int count = 0;
		if (left >= right)
			return 0;
		else {
			int mid = left + (right - left) / 2;
//			count += mergeSort(a, left, mid);
//			count += mergeSort(a, mid + 1, right);
//			count = merge(a, left, right, mid);

			mergeSort(a, left, mid);
			mergeSort(a, mid + 1, right);
			merge(a, left, right, mid);
			return count;
		}
	}

	private static int merge(int[] a, int left, int right, int center) {
		// int count = 0;
//		int center = left + (right - left) / 2;
		int arr1[] = new int[center - left + 1];
		int arr2[] = new int[right - center];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length) {
			arr1[i++] = a[k++];
		}
		while (j < arr2.length) {
			arr1[j++] = a[k++];
		}
		i = 0;
		j = 0;
		k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				a[k] = arr1[i];
				i++;
			} else {
				count += center - i + 1;
				a[k] = arr2[j];
				j++;
			}
			k++;
		}
		while (i < arr1.length) {
			a[k++] = a[i++];
		}
		while (j < arr2.length) {
			a[k++] = a[j++];
		}
		return count;
	}
}
