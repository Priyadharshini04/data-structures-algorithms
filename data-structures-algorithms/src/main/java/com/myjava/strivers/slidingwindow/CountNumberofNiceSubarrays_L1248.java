package com.myjava.strivers.slidingwindow;

public class CountNumberofNiceSubarrays_L1248 {

	public static int numberOfSubarrays(int[] nums, int k) {
		int count = 0;
		int right = 0;
		int left = 0;
		int oddCount = 0;
		// to count remaining even numbers as a sub array with expected odd count.
		// ex: 2,2,2,1,2,2,1,2,2,2 => the 3 2's at the last should also be included in the sub array
		int temp = 0;
		while (right < nums.length) {
			if (nums[right] % 2 != 0) {
				++oddCount;
				temp = 0;
			}
			while (oddCount == k) {
				temp++;
				if (nums[left] % 2 != 0) {
					oddCount--;
				}
				left++;
			}
			count += temp;
			right++;
		}
		return count;
	}

	// Brute Force Time Limit Exceed.
	public static int numberOfSubarrayss(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int oddCount = 0;
			for (int j = i; j < nums.length; j++) {
				if (nums[j] % 2 != 0) {
					oddCount++;
				}
				if (oddCount == k) {
					count++;
				}
				if (oddCount > k) {
					break;
				}
			}
		}
		return count;
	}

}
