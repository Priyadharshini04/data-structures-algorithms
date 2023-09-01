package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/generate-parentheses/
public class GenerateParanthesis {

	public static List<String> generateParenthesis(int n) {
		List<String> list = new ArrayList<String>();
		if (n == 0) {
			return list;
		}
		generateParenthesis("", n * 2, n, 0, list);
		return list;
	}

	public static void generateParenthesis(String str, int n, int left, int right, List<String> list) {
		if (n == 0) {
			list.add(str);
			return;
		}
		if (left != 0) {
			generateParenthesis(str + "(", n - 1, left - 1, right + 1, list);
		}
		if (right != 0) {
			generateParenthesis(str + ")", n - 1, left, right - 1, list);
		}
	}
}
