package com.myjava.strivers.arrays;

import java.util.Arrays;

//https://www.codingninjas.com/studio/problems/missing-and-repeating-numbers_6828164?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf
public class MissingAndRepeatingNumbers {

	// TC:O(n logn) SC:O(1)
	public static int[] findMissingRepeatingNumbers(int[] arr) {
		Arrays.sort(arr);
		int j = 1;
		int[] result = new int[2];
		for (int i = 0; i < arr.length; i++) {
			if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
				result[0] = arr[i];
			} else if (arr[i] == j) {
				j++;
			} else {
				result[1] = j;
			}
		}
		if (result[1] == 0)
			result[1] = j;
		return result;
	}

}
