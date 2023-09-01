package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://www.codingninjas.com/studio/problems/-binary-strings-with-no-consecutive-1s._893001
public class BinaryString {

	public static List<String> generateString(int N) {
		List<String> list = new ArrayList<String>();
		if (N == 0) {
			return list;
		}
		generateString("", N, list);
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
}
