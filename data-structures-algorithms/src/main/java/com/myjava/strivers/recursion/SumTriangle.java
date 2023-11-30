package com.myjava.strivers.recursion;

public class SumTriangle {

	public static long[] findSumArray(long[] arr) {
		int length = arr.length;
		int totalLen = length * (length + 1) / 2;
		int i = totalLen - 1;
		long[] result = new long[totalLen];
		int j = length - 1;
		while (j >= 0) {
			result[i--] = arr[j--];
		}
		for (int k = 1; k < length; k++) {
			arr = findSum(arr, new long[length - k], 0);
			int l = arr.length - 1;
			while (l >= 0) {
				result[i--] = arr[l--];
			}
		}
		return result;
	}

	static long[] findSum(long[] arr, long[] newArr, int j) {
		if (j < arr.length - 1) {
			newArr[j] = arr[j] + arr[j + 1];
			return findSum(arr, newArr, ++j);
		} else {
			return newArr;
		}
	}
}
