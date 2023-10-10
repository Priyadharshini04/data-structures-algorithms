package com.myjava.strivers.slidingwindow;

// https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/description/
public class NumberofSubstringsContainingAllThreeCharactersL_1358 {

	// More optimal solution
	public static int numberOfSubstrings(String s) {
		int count = 0;
		int a = -1;
		int b = -1;
		int c = -1;
		char[] chs = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (chs[i] == 'a') {
				a = i;
			}
			if (chs[i] == 'b') {
				b = i;
			}
			if (chs[i] == 'c') {
				c = i;
			}
			int min = Math.min(a, Math.min(c, b)) + 1;
			count += min;
		}
		return count;
	}

	public static int numberOfSubstringss(String s) {
		int count = 0;
		int right = 0;
		int left = 0;
		// instead of queue array has provided optimal solution
		int[] ch = new int[3];
		while (right <= s.length()) {
			while (ch[0] > 0 && ch[1] > 0 && ch[2] > 0 && left < right) {
				count += s.length() - right + 1;
				ch[s.charAt(left) - 'a']--;
				left++;
			}
			if (right < s.length()) {
				ch[s.charAt(right) - 'a']++;
			}
			right++;
		}
		return count;
	}

}
