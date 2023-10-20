package com.myjava.strivers.greedy;

public class LemonadeChange {

	public static boolean lemonadeChange(int[] bills) {
		int[] coins = new int[3];
		for (int i = 0; i < bills.length; i++) {
			if (bills[i] == 5) {
				coins[0]++;
			} else if (bills[i] == 10) {
				coins[1]++;
				if (coins[0] != 0) {
					coins[0]--;
				} else {
					return false;
				}
			} else if (bills[i] == 20) {
				coins[2]++;
				int amount = 15;
				while (amount > 0) {
					if (amount > 10 && coins[1] != 0) {
						amount -= 10;
						coins[1]--;
					} else {
						if (coins[0] != 0) {
							amount -= 5;
							coins[0]--;
						} else {
							return false;
						}
					}
				}
			}
		}
		return true;
	}

}
