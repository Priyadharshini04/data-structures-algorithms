package com.myjava.strivers.binarysearch;

// https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/
public class MinimumNumberOfDaysToMakeBouquets_L1482 {

	public static int minDays(int[] bloomDay, int noOfBouquets, int adjacentFlowers) {
		long val = (long) noOfBouquets * adjacentFlowers;
		if (val > bloomDay.length) {
			return -1;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < bloomDay.length; i++) {
			if (min > bloomDay[i]) {
				min = bloomDay[i];
			}
			if (max < bloomDay[i]) {
				max = bloomDay[i];
			}
		}
		int minWaitingBloomdays = -1;
		while (min <= max) {
			int currBloomDay = (min) + ((max - min) / 2);
			if (isPossibleToMakeBouquets(bloomDay, noOfBouquets, adjacentFlowers, currBloomDay)) {
				minWaitingBloomdays = currBloomDay;
				max = currBloomDay - 1;
			} else {
				min = currBloomDay + 1;
			}
		}
		return minWaitingBloomdays;
	}

	private static boolean isPossibleToMakeBouquets(int[] bloomDay, int noOfBouquets, int adjacentFlowers,
			int currBloomDay) {
		int totalBouquets = 0;
		int adajentCount = 0;
		for (int i = 0; i < bloomDay.length; i++) {
			if (bloomDay[i] <= currBloomDay) {
				adajentCount++;
			} else {
				totalBouquets += (adajentCount / adjacentFlowers);
				adajentCount = 0;
			}
		}
		totalBouquets += (adajentCount / adjacentFlowers);
		if (totalBouquets >= noOfBouquets)
			return true;
		return false;
	}

	// Extra Space: O(n) and extra TC: O(n+n)
	private static boolean isPossibleToMakeBouquetss(int[] bloomDay, int noOfBouquets, int adjacentFlowers,
			int currBloomDay) {
		boolean[] isBloomed = new boolean[bloomDay.length];
		int totalBouquets = 0;
		for (int i = 0; i < bloomDay.length; i++) {
			if (bloomDay[i] <= currBloomDay) {
				isBloomed[i] = true;
			}
		}
		int i = 0;
		while (i < bloomDay.length) {
			if (!isBloomed[i]) {
				i++;
				continue;
			}
			int j = i;
			while (j < i + adjacentFlowers && j < isBloomed.length && isBloomed[j]) {
				j++;
			}
			if (j == i + adjacentFlowers) {
				totalBouquets++;
			}
			i = j;
		}
		if (totalBouquets >= noOfBouquets)
			return true;
		return false;
	}

}
