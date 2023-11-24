package com.myjava.strivers.strings;
// https://leetcode.com/contest/weekly-contest-372/problems/separate-black-and-white-balls/
public class SeparateBlackWhiteBalls {

	public static long minimumSteps(String s) {
		char[] balls = s.toCharArray();
		int low = 0;
		int high = balls.length - 1;
		int mid = 0;
		long operations = 0;
		while (mid <= high) {
			if (balls[mid] == '1') {
				mid++;
			} else {
				if (balls[low] != '0') {
					balls[low] = '0';
					balls[mid] = '1';
					operations += (mid - low);
				}
				mid++;
				low++;
			}
		}
		return operations;
	}

}
