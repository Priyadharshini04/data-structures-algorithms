package com.myjava.strivers.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// https://www.codingninjas.com/studio/problems/find-minimum-number-of-coins_975277
public class FindMinimumNumberOfCoins {

	public static List<Integer> minimumCoins(int n) {
		List<Integer> list = new ArrayList<Integer>();
		int[] coins = new int[] { 1000, 500, 100, 50, 20, 10, 5, 2, 1 };
		int i = 0;
		while (n > 0) {
			if (coins[i] <= n) {
				list.add(coins[i]);
				n -= coins[i];
			} else {
				i++;
			}
		}
		return list;
	}

}
