package com.myjava.strivers.arrays;

import java.util.ArrayList;

public class ReverseArrayInGroups {

	public static void reverse(ArrayList<Integer> arr, int k) {
		for (int i = 0; i < arr.size(); i+=k) {
			int left = i;
			int right = Math.min(i + k - 1, arr.size() - 1);
			int temp;
			while (left < right) {
				temp = arr.get(left);
				arr.set(left, arr.get(right));
				arr.set(right, temp);
				left += 1;
				right -= 1;
			}
		}
	}

}
