package com.myjava.strivers.recursion;

// https://www.geeksforgeeks.org/recursive-programs-to-find-minimum-and-maximum-elements-of-array/
public class FindMinMaxArray {

	public static long[] findMin(long[] arr) {
		// min,max
		long[] result = new long[] { Long.MAX_VALUE, (Long.MAX_VALUE * -1) };
		findMinMax(arr, result, 0, arr.length);
		return result;
	}

	private static void findMinMax(long[] arr, long[] result, int i, int length) {
		if (i < length) {
			if (arr[i] < result[0]) {
				result[0] = arr[i];
			}
			if (arr[i] > result[1]) {
				result[1] = arr[i];
			}
			findMinMax(arr, result, ++i, length);
		}
	}

}
