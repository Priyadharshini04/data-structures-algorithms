package com.myjava.strivers.binarysearch;

public class KokoEatingBananas_L875 {

	public static int minSpeed(int[] piles, int hours) {
		int max = 0;
		for (int i = 0; i < piles.length; i++) {
			if (max < piles[i]) {
				max = piles[i];
			}
		}
		int ans = max;
		int left = 1, right = max;
		while (left <= right) {
			int mid = (left + ((right - left) / 2));
			if (isPossibleToEatWithinGivenTime(piles, mid, hours)) {
				ans = mid;
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return ans;
	}

	public static boolean isPossibleToEatWithinGivenTime(int[] arr, int bananaCount, int hours) {
		long totalHours = 0;
		for (int i = 0; i < arr.length; i++) {
			totalHours += Math.ceil((double) arr[i] / (double) bananaCount);
		}
		if (totalHours > hours)
			return false;
		return true;
	}
}
