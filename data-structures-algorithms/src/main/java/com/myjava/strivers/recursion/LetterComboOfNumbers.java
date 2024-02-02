package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterComboOfNumbers {

	public static List<String> findCombos(String digits) {
		String[] strs = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		List<String> list = new ArrayList<String>();
		if (digits.isEmpty()) {
			return list;
		}
		findCombos(strs, digits, 0, list, new StringBuilder());
		return list;
	}

	public static void findCombos(String[] str, String digits, int idx, List<String> list, StringBuilder curr) {
		if (idx == digits.length()) {
			list.add(curr.toString());
			return;
		}
		int len = digits.charAt(idx) - '0';
		for (int i = 0; i < str[len].length(); i++) {
			curr.append(str[len].charAt(i));
			findCombos(str, digits, idx + 1, list, curr);
			curr.deleteCharAt(curr.length() - 1);
		}
	}

	static List<String> possibleWords(int a[], int N) {
		String[] strs = new String[] { "0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		List<String> result = new ArrayList<>();
		findPossible(a, strs, result, new StringBuilder(), 0, 0);
		return result;
	}

	static void findPossible(int[] arr, String[] strs, List<String> res, StringBuilder str, int i, int j) {
		if (i == arr.length) {
			res.add(str.toString());
			return;
		}
		int len = arr[i];
		for (int k = 0; k < strs[len].length(); k++) {
			str.append(strs[len].charAt(k));
			findPossible(arr, strs, res, str, i + 1, j);
			str.deleteCharAt(str.length() - 1);
		}
	}

}
