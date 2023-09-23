package com.myjava.strivers.stackqueue;

import java.util.HashMap;
import java.util.Stack;

// https://www.codingninjas.com/studio/problems/day-23-:-infix-to-postfix-_1382146
public class InfixToPostfix {
	// fails for more conditions.
	public static String infixToPostfixWithoutMap(String exp) {
		char[] chs = exp.toCharArray();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stk1 = new Stack<Character>();
		Stack<Character> stk2 = new Stack<Character>();
		for (int i = 0; i < chs.length; i++) {
			if (chs[i] == 40) {
				stk2.push(chs[i]);
			} else if (chs[i] == 41) {
				stk2.pop();
			} else if (chs[i] == 42 || chs[i] == 43 || chs[i] == 45 || chs[i] == 47 || chs[i] == 94) {
				if (!stk1.isEmpty()
						&& (stk1.peek() == chs[i] || (stk1.peek() == '+' && (chs[i] != '*' && chs[i] != '/'))
								|| (stk1.peek() == '*' && (chs[i] != '/'))
								|| (stk1.peek() == '-' && (chs[i] == '+') || (stk1.peek() == '/')))) {
					sb.append(stk1.pop());
				}
				stk1.push(chs[i]);
			} else {
				sb.append(chs[i]);
			}
		}
		while (!stk1.isEmpty()) {
			sb.append(stk1.pop());
		}
		return sb.toString();
	}

	// Use hashmap to store the precedence.
	public static String infixToPostfix(String exp) {
		char[] chs = exp.toCharArray();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stk1 = new Stack<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('^', 3);
		hm.put('/', 2);
		hm.put('*', 2);
		hm.put('+', 1);
		hm.put('-', 1);
		hm.put(')', 0);
		hm.put('(', 0);
		for (int i = 0; i < chs.length; i++) {
			if (isOperator(chs[i])) {
				sb.append(chs[i]);
			} else if (!stk1.isEmpty()) {
				if (chs[i] == ')') {
					while (stk1.peek() != '(') {
						sb.append(stk1.pop());
					}
					stk1.pop();
				} else if (chs[i] == '(') {
					stk1.push(chs[i]);
				} else if (hm.get(chs[i]) > hm.get(stk1.peek())) {
					stk1.push(chs[i]);
				} else if (stk1.peek() != '(') {
					while (!stk1.isEmpty() && hm.get(stk1.peek()) >= hm.get(chs[i])) {
						sb.append(stk1.pop());
					}
					stk1.push(chs[i]);
				}
			} else {
				stk1.push(chs[i]);
			}
		}
		while (!stk1.isEmpty()) {
			sb.append(stk1.pop());
		}
		return sb.toString();
	}

	public static boolean isOperator(char ch) {
		if (ch - 'a' >= 0 && ch - 'a' <= 25) {
			return true;
		} else if (ch - '0' >= 0 && ch - '0' <= 9) {
			return true;
		}
		return false;
	}

}
