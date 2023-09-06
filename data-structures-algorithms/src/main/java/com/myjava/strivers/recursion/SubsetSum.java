package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSum {

	public static ArrayList<Integer> subsetSum(int[] num) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		if (num.length == 0) {
			list1.add(0);
			return list1;
		}
		findSubSetSum(0, 0, num, list1);
		Collections.sort(list1);
		return list1;
	}

	private static void findSubSetSum(int idx, int sum, int[] num, ArrayList<Integer> list1) {
		if (idx == num.length) {
				list1.add(sum);
			return;
		}
		findSubSetSum(idx + 1, sum + num[idx], num, list1);
		findSubSetSum(idx + 1, sum, num, list1);
	}
}
