package com.myjava.strivers.binarysearch;

import java.util.Arrays;

public class KokoEatingBananas {

	public static int minEatingSpeed(int[] piles, int hours) {
		if (piles.length == 1) {
			return (piles[0] / hours) + (piles[0] % hours);
		}
		long k = 0;
		Arrays.sort(piles);
		int maxPiles = piles[piles.length - 1];
		for (int i = 1; i <= maxPiles; i++) {
			k = 0;
			for (int j = 0; j < piles.length; j++) {
				long totalHourPerPile = 0;
				if (piles[j] > i)
					totalHourPerPile = (long) Math.ceil(piles[j] / Double.parseDouble(String.valueOf(i)));
				else
					totalHourPerPile = piles[j]%i;
				k += totalHourPerPile;
			}
			if (k <= hours) {
				return i;
			}
		}
		return maxPiles; 
	}

}
