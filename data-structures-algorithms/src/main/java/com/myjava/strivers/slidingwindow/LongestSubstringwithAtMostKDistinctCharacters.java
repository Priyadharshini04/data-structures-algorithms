package com.myjava.strivers.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringwithAtMostKDistinctCharacters {

	public static int kDistinctChars(String s, int k) {
		int left = 0;
		int right = 0;
		Map<Character, Integer> set = new HashMap<>();
		int maxLength = 0;
		while (right < s.length()) {
			char ch = s.charAt(right);
			// instead of updating recent index update the occurrences.
			set.put(ch, (set.getOrDefault(ch, 0) + 1));
			while (set.size() > k && left < right) {
				char d = s.charAt(left);
				if (set.get(d) == 1) {
					set.remove(d);
				} else {
					set.put(d, set.get(d) - 1);
				}
				left++;
			}
			if (set.size() <= k) {
				maxLength = Math.max(maxLength, right - left + 1);
			}
			right++;
		}
		return maxLength;
	}

}
