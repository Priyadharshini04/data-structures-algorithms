package com.myjava.strivers.strings;

public class GoodSpell {
	static int goodSpell(int n, String s) {
		// Write your code here.

		char[] ch = s.toCharArray();
		long firstTotal = 1L;
		long secondTotal = 1L;
		for (int i = 0; i < n / 2; i++) {
			firstTotal *= Integer.parseInt(String.valueOf(ch[i]));
		}
		for (int i = n / 2; i < n; i++) {
			secondTotal *= Integer.parseInt(String.valueOf(ch[i]));
		}
		if (firstTotal == secondTotal) {
			return 1;
		}
		return 0;
	}
}
