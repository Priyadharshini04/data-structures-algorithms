package com.myjava.strivers.greedy;

// https://leetcode.com/problems/valid-parenthesis-string/
public class ValidParenthesisString_L678 {

	public static boolean checkValidString(String s) {
		int maxOpenParenthesis = 0;
		int minOpenParenthesis = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				maxOpenParenthesis += 1;
				minOpenParenthesis += 1;
			} else if (ch == ')') {
				maxOpenParenthesis -= 1;
				minOpenParenthesis -= 1;
			} else {
				maxOpenParenthesis += 1;
				minOpenParenthesis -= 1;
			}
			if (maxOpenParenthesis < 0) {
				return false;
			}
			minOpenParenthesis = Math.max(minOpenParenthesis, 0);
		}
		if (minOpenParenthesis == 0) {
			return true;
		}
		return false;
	}

	// Instead of each thing separately try to think in a combined manner.
	public static boolean checkValidStrings(String s) {
		int left = 0;
		int star = 0;
		int right = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				left++;
			} else if (s.charAt(i) == '*') {
				star++;
			} else if (s.charAt(i) == ')') {
				if (left > 0) {
					left--;
				} else if (star > 0) {
					star--;
				} else {
					right++;
				}
			}
		}
		while (star > 0 && left > 0) {
			star--;
			left--;
		}
		while (star > 0 && right > 0) {
			star--;
			right--;
		}
		if (right == 0 && left == 0) {
			return true;
		}
		return false;
	}

}
