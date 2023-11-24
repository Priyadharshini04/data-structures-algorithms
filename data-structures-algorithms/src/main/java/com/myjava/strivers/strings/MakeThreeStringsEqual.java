package com.myjava.strivers.strings;

// https://leetcode.com/contest/weekly-contest-372/problems/make-three-strings-equal/
public class MakeThreeStringsEqual {

	public static int findMinimumOperations(String s1, String s2, String s3) {
		int minLen = s3.length();
		if (s1.length() <= s2.length() && s1.length() <= s3.length()) {
			minLen = s1.length();
		} else if (s2.length() <= s1.length() && s2.length() <= s3.length()) {
			minLen = s2.length();
		}
		int i = 0;
		int operations = 0;
		while (i < minLen) {
			if (s1.charAt(i) != s2.charAt(i) || s2.charAt(i) != s3.charAt(i)) {
				break;
			}
			i++;
		}
		if (i == s1.length() && i == s2.length() && i == s3.length()) {
			return 0;
		}
		int tillEqual = i;
		minLen=Math.min(minLen, i);
		if (tillEqual < minLen || minLen==0)
			return -1;
		while (i < s1.length()) {
			operations++;
			i++;
		}
		i = tillEqual;
		while (i < s2.length()) {
			operations++;
			i++;
		}
		i = tillEqual;
		while (i < s3.length()) {
			operations++;
			i++;
		}
		return operations;
	}

}
