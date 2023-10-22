package com.myjava.strivers.arrays;

import java.util.LinkedHashMap;

//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399
public class LongestSubArray {
	// Not a optimized solution.
	public static int findLong(int[] a, int k) {
		int maxLength = 0;
		for (int i = 0; i < a.length; i++) {
			long currentSum = 0l;
			for (int j = i; j < a.length; j++) {
				currentSum += a[j];

				if (currentSum == k) {
					maxLength = Math.max(maxLength, j - i + 1);
				}
			}
		}

		return maxLength;
	}

	// O( n log n) for best and average case and for worst[if it is a unordered map]
	// case O(n*n)
	public static int findLongBetter(int[] arr, int k) {
		int maxLength = 0;
		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
			if (sum == k) {
				maxLength = Math.max(maxLength, i + 1);
			}
			int rem = sum - k;
			if (map.containsKey(rem)) {
				maxLength = Math.max(maxLength, i - map.get(rem));
			}
			if (!map.containsKey(sum)) {
				map.put(sum, i);
			}
		}
		return maxLength;
	}

	// optimized solution two pointer approach for positivies with zeros and will
	// not work for negative values. More time complexity in worst case scenario O(n*n)
	public static int findLongOpti(int[] arr, int k) {
		int maxLength = 0;
		int j = 0;
		long sum = arr[0]; // missed the data type.
		int i = 0;
		while (i < arr.length) {
			while (sum > k && j <= i) {
				sum -= arr[j];
				j++;
			}
			if (sum == k) {
				maxLength = Math.max(maxLength, i - j + 1);
			}
			i++;
			if (i < arr.length)
				sum += arr[i];
		}
		return maxLength;
	}
	// Re-factored the code properly.
	public static int findLongOptiz(int[] arr, int k) {
		int maxLength = 0;
		int p2 = 0;
		long sum = 0;
		int p1 = 0;
		while (p2 < arr.length) {
			sum += arr[p2];
			while (sum > k && p1 <= p2) {
				sum -= arr[p1++];
			}
			if (sum == k) {
				maxLength = Math.max(maxLength, (p2 - p1 + 1));
			}
			p2++;
		}
		return maxLength;
	}

	// doesn't works for negative integers
	public static int longestSubarrayWithSumK(int[] a, long k) {
		int n = a.length;

		int maxLength = 0;

		int start = 0, end = -1;
		long currentSum = 0;

		while (start < n) {
			while ((end + 1 < n) && (currentSum + a[end + 1] <= k)) {
				currentSum += a[end + 1];
				++end;
			}

			if (currentSum == k) {
				maxLength = Math.max(maxLength, end - start + 1);
			}

			currentSum -= a[start];
			++start;
		}

		return maxLength;
	}
}