package com.myjava.strivers.arrays;

//https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {
	public static int removeDuplicatesL_26(int[] arr) {
		int n = arr.length;
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			if (arr[0] == arr[1]) {
				return 1;
			}
			return 2;
		}
		int count = 0;
		int i = 1;
		for (int j = 0; j < n - 1; j++) {
			if (arr[j] != arr[j + 1]) {
				count++;
				arr[i] = arr[j+1];
				i++;
			}
		}
		return count + 1;
	}

	public static int removeDuplicates(ArrayList<Integer> arr, int n) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			if (arr.get(0).equals(arr.get(1))) {
				return 1;
			}
			return 2;
		}
		int count = 0;
		for (int j = 0; j < arr.size() - 1; j++) {
			if (!arr.get(j).equals(arr.get(j + 1))) {
				count++;
			}
		}
		return count + 1;
	}

	public static int removeDuplicate(ArrayList<Integer> arr, int n) {
		HashSet<Integer> hs = new HashSet<Integer>(arr);
		return hs.size();
	}
}
