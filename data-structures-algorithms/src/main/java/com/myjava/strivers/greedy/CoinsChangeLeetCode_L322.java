package com.myjava.strivers.greedy;

import java.util.Arrays;

// https://leetcode.com/problems/coin-change/
public class CoinsChangeLeetCode_L322 {

	public static int coinChange(int[] coins, int amount) {
		int count = 0;
		Arrays.sort(coins);
		int i = coins.length - 1;
		while (amount > 0 && i >= 0) {
			int nextCoin = isContains(coins, amount - coins[i]);
			if (coins[i] <= amount && nextCoin != -1) {
				count++;
				amount -= coins[i];
			} else {
				if (nextCoin != -1) {
					i = nextCoin;
				} else {
					i--;
				}
			}
		}
		if (amount != 0) {
			return -1;
		}
		return count;
	}

	public static int isContains(int[] coins, int amount) {
		for (int i = 0; i < coins.length; i++) {
			if (amount % coins[i] == 0) {
				return i;
			}
		}
		return -1;

	}
}
