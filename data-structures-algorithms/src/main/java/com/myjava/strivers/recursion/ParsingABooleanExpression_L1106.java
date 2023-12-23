package com.myjava.strivers.recursion;

import java.util.Stack;

// https://leetcode.com/problems/parsing-a-boolean-expression/description/
public class ParsingABooleanExpression_L1106 {

	public static boolean parseBoolExpr(String string) {
		Boolean result = null;
		Stack<Character> stk = new Stack<Character>();
		int i = 0;
		while (i < string.length()) {
			stk.push(string.charAt(i++));
		}
		boolean hasTrue = false;
		boolean hasFalse = false;

		while (!stk.isEmpty()) {
			if (stk.peek() == 't') {
				if (result == null)
					result = true;
				hasTrue = true;
			} else if (stk.peek() == 'f') {
				if (result == null)
					result = false;
				hasFalse = true;
			} else if (stk.peek() == '|') {
				result = hasTrue ? true : false;
				hasTrue = false;
				hasFalse = false;
			} else if (stk.peek() == '&') {
				result = hasTrue && !hasFalse ? true : false;
			} else if (stk.peek() == '!') {
				result = !result;
				hasTrue = false;
				hasFalse = false;
			}
			stk.pop();
		}
		return result;
	}

	static Boolean value = null;

	private static Boolean evaluate(String string, int i, int length, char chLogic) {
		if (i >= 0) {
			if (isBooleanExp(string.charAt(i))) {
				if (value == null) {
					value = returnValue(string.charAt(i));
				} else {
					if (chLogic == '|') {
						value = value || returnValue(string.charAt(i));
					} else if (chLogic == '&') {
						value = value && returnValue(string.charAt(i));
					}
				}
			} else if (isLogical(string.charAt(i)))
				chLogic = string.charAt(i);
			evaluate(string, i + 1, length, chLogic);

		}
		return value;
	}

	private static boolean isLogical(char ch) {
		if (ch == '&' || ch == '!' || ch == '|') {
			return true;
		}
		return false;
	}

	private static boolean isBooleanExp(char ch) {
		if (ch == 'f' || ch == 't') {
			return true;
		}
		return false;
	}

	private static boolean evaluateBoolean(int start, int end, String str, char ch) {

		for (int i = start; i < end; i++) {
			if (isLogical(str.charAt(i))) {
				break;
			} else if (isBooleanExp(str.charAt(i))) {
				if (value == null) {
					value = returnValue(str.charAt(i));
				} else {
					if (ch == '|') {
						value = value || returnValue(str.charAt(i));
					} else if (ch == '&') {
						value = value && returnValue(str.charAt(i));
					}
				}
			}
		}
		return ch == '!' ? !value : value;
	}

	private static boolean returnValue(char ch) {
		if (ch == 't')
			return true;
		else
			return false;
	}
}
