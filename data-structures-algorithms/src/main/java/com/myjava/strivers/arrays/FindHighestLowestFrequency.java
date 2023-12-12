package com.myjava.strivers.arrays;

import java.util.Arrays;

// https://www.codingninjas.com/studio/problems/k-most-occurrent-numbers_625382
public class FindHighestLowestFrequency {

	public static int[] findFreq(int[] v) {
		if (v.length < 1) {
			return new int[] {};
		}
		Arrays.sort(v);
		int maxFreq = Integer.MIN_VALUE;
		int minFreq = Integer.MAX_VALUE;
		int maxFreqIdx = 0;
		int minFreqIdx = 0;
		int freq = 1;
		for (int i = 0; i < v.length; i++) {
			if (i + 1 < v.length && v[i] == v[i + 1]) {
				++freq;
			} else {
				if (freq < minFreq) {
					minFreqIdx = i;
					minFreq = freq;
				} else if (freq == minFreq) {
					if (v[minFreqIdx] > v[i]) {
						minFreqIdx = i;
					}
				}
				if (freq > maxFreq) {
					maxFreqIdx = i;
					maxFreq = freq;
				} else if (freq == maxFreq) {
					if (v[maxFreqIdx] > v[i]) {
						maxFreqIdx = i;
					}
				}
				freq = 1;
			}
		}
		return new int[] { v[maxFreqIdx], v[minFreqIdx] };
	}

}
