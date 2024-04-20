package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://www.codingninjas.com/studio/problems/-binary-strings-with-no-consecutive-1s._893001
public class BinaryString {

	public static List<String> generateString(int N) {
		List<String> list = new ArrayList<>();
		if (N == 0)
			return list;
		gbs("", N, list);
		return list;
	}

	static void gbs(String s, int k, List<String> list) {
		if (s.length() == k) {
			list.add(s);
			return;
		}
		gbs(s.concat("0"), k, list);
		if (s.length() > 0) {
			if (s.charAt(s.length() - 1) == '0') {
				gbs(s.concat("1"), k, list);
			}
		} else {
			gbs(s.concat("1"), k, list);
		}
	}

	public static List<String> generateStrings(int N) {
		List<String> list = new ArrayList<String>();
		if (N == 0) {
			return list;
		}
		generateStrings(new StringBuilder(), N, list);
		return list;
	}

	private static void generateString(String string, int n, List<String> list) {
		if (n == 0) {
			list.add(string);
			return;
		}
		generateString(string + "0", n - 1, list);
		if (!string.endsWith("1")) {
			generateString(string + "1", n - 1, list);
		}
	}

	// Using String Builder.
	private static void generateStrings(StringBuilder string, int n, List<String> list) {
		if (n == 0) {
			list.add(string.toString());
			return;
		}
		string.append("0");
		generateStrings(string, n - 1, list);
		if (string.length() > 0) {
			string.deleteCharAt(string.length() - 1);
		}
		if (string.length() == 0 || string.charAt(string.length() - 1) != '1') {
			string.append("1");
			generateStrings(string, n - 1, list);
		}
		if (string.length() > 0) {
			string.deleteCharAt(string.length() - 1);
		}
	}
}
