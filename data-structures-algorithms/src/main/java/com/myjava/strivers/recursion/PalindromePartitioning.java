package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/palindrome-partitioning/
public class PalindromePartitioning {

	public static List<List<String>> findPalindromeStrs(String string) {
		List<String> list1 = new ArrayList<String>();
		List<List<String>> list2 = new ArrayList<List<String>>();
		// findPalindromeStrs(string, list1, list2, 1, string);
		findPalindromeStr(string, list1, list2, 0);
		return list2;
	}

	public static void findPalindromeStrs(String str, List<String> list1, List<List<String>> list2, int idx,
			String curr) {
		if (curr == null || curr.length() == 0) {
			list2.add(new ArrayList<String>(list1));
			return;
		}
		for (int i = 1; i <= curr.length(); i++) {
			String temp = curr.substring(0, i); // pass the start and end index instead of getting substring again passing it
			if (!isPlaindrome(temp)) {
				continue;
			}
			list1.add(temp);
			findPalindromeStrs(str, list1, list2, idx + 1, curr.substring(i, curr.length()));
			list1.remove(list1.size() - 1);
		}
	}

	private static boolean isPlaindrome(String temp) {
		int left = 0;
		int right = temp.length() - 1;
		while (left < right) {
			if (temp.charAt(right) != temp.charAt(left)) {
				return false;
			}
			right--;
			left++;
		}
		return true;
	}
	// Work based on index instead of solving after taking substrings
	public static void findPalindromeStr(String str, List<String> list1, List<List<String>> list2, int idx) {
		if (idx==str.length()) {
			list2.add(new ArrayList<String>(list1));
			return;
		}
		for (int i = idx; i < str.length(); ++i) {
			if (isPlaindrome(str,idx,i)) {
			list1.add(str.substring(idx,i+1));
			findPalindromeStr(str, list1, list2, i + 1);
			list1.remove(list1.size() - 1);
		}
		}
	}

	private static boolean isPlaindrome(String temp,int left,int right) {
		while (left <= right) {
			if (temp.charAt(right--) != temp.charAt(left++)) {
				return false;
			}
		}
		return true;
	}
}
