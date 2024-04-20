package com.myjava;

public class CountSubseq {
	public static int ArrayChallenge(int[] arr) {
		// code goes here
		int[] maxLength = new int[] { 0 };
		int count = 0;
		return longestSubSequence(arr, 0, -1, new int[arr.length+1]);
	}

	public static int longestSubSequence(int[] arr, int i, int lastIdx, int[] result) {
		if (i >= arr.length) {
			return 0;
		}
		int maxLen = 0 + longestSubSequence(arr, i + 1, lastIdx,result);
		if (lastIdx == -1 || arr[lastIdx] < arr[i]) {
			maxLen = Math.max(maxLen, 1 + longestSubSequence(arr, i + 1, i,result));
		}
		return maxLen+result[i];
	}

	public static void main(String[] args) {
		// keep this function call here
		System.out.print(ArrayChallenge(new int[] { 1, 2, 3, 4 }));
	}
}
