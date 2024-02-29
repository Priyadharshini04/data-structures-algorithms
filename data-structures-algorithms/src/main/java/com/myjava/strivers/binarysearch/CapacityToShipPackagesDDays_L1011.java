package com.myjava.strivers.binarysearch;

//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
public class CapacityToShipPackagesDDays_L1011 {

	public static int shipWithinDays(int[] weights, int days) {
		int min = Integer.MAX_VALUE;
		int max = 0;
		for (int i = 0; i < weights.length; i++) {
			if (min > weights[i]) {
				min = weights[i];
			}
			max += weights[i];
		}
		int minWeight = 1;
		while (min <= max) {
			int weight = (min) + ((max - min) / 2);
			if (isPossibleToShip(weights, days, weight)) {
				minWeight = weight;
				max = weight - 1;
			} else {
				min = weight + 1;
			}
		}
		return minWeight;
	}

	private static boolean isPossibleToShip(int[] weights, int days, int weight) {
		int total = 0;
		int count = 0;
		for (int i = 0; i < weights.length; i++) {
			if (weights[i] > weight) {
				return false;
			}
			total += weights[i];
			if (total == weight) {
				count++;
				total = 0;
			} else if (i + 1 < weights.length && total + weights[i + 1] > weight) {
				count++;
				total = 0;
			}
		}
		if (total != 0) {
			count++;
		}
		if (count <= days)
			return true;
		return false;
	}

}
