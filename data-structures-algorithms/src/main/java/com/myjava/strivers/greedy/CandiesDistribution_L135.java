package com.myjava.strivers.greedy;

import java.util.Arrays;

// https://leetcode.com/problems/candy/description/
public class CandiesDistribution_L135 {

	// double way direction has to be checked.
	// 5, 6, 2, 2, 4, 8, 9, 5, 4, 0, 5, 1
	public static int candy(int[] students) {
		int count = 0;
		int[] candy = new int[students.length];
		Arrays.fill(candy, 1);
		// 1, 2, 1, 1, 2, 3, 4, 1, 1, 1, 2, 1
		for (int i = 0; i < students.length - 1; i++) {
			if (students[i + 1] > students[i]) {
				candy[i + 1] = candy[i] + 1;
			}
		}
		// 1, 2, 1, 1, 2, 3, 4, 3, 2, 1, 2, 1
		for (int i = students.length - 1; i > 0; i--) {
			if (students[i - 1] > students[i]) {
				if (candy[i - 1] < candy[i] + 1)
					candy[i - 1] = candy[i] + 1;
			}
		}
		for (int i = 0; i < candy.length; i++) {
			count += candy[i];
		}
		return count;
	}

}
