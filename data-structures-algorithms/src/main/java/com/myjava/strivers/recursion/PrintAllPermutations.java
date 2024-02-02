package com.myjava.strivers.recursion;

public class PrintAllPermutations {

	public static void printPermutation(String string) {
		printPermutation(string, 0);
	}

	public static void printPermutation(String string, int idx) {
		if (idx == string.length()) {
			System.out.println(string);
		}
		for (int i = idx; i < string.length(); i++) {
			string = swap(string, idx, i);
			printPermutation(string, idx + 1);
			string = swap(string, idx, i);
		}
	}

	public static String swap(String s, int i, int j) {
		char temp;
		char[] str = s.toCharArray();
		temp = str[i];
		str[i] = str[j];
		str[j] = temp;
		return String.valueOf(str);
	}
}
