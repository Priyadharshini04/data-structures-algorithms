package com.myjava.strivers.stackqueue;

import java.util.HashMap;
import java.util.Stack;

// https://www.codingninjas.com/studio/problems/prefix-to-infix_1215000
public class PrefixToInfix {
	public static String prefixToInfixConversion(String exp) {
		Stack<String> stk1 = new Stack<String>();
		char[] ch = exp.toCharArray();
		for (int i = ch.length - 1; i >= 0; i--) {
			if (InfixToPostfix.isOperator(ch[i])) {
				stk1.push(String.valueOf(ch[i]));
			} else {
				if (!stk1.isEmpty()) {
					StringBuilder sb = new StringBuilder();
					sb.append("(");
					sb.append(stk1.pop());
					sb.append(ch[i]);
					sb.append(stk1.pop());
					sb.append(")");
					stk1.push(sb.toString());
				}
			}
		}
		StringBuilder sb1=new StringBuilder();
		while (!stk1.isEmpty())		{
			sb1.append(stk1.pop());
		}
		return sb1.toString();
	}

	// Wrong way start from left to right.
	public static String prefixToInfixConversions(String string) {
		StringBuilder sb = new StringBuilder();
		char[] chs = string.toCharArray();
		Stack<Character> stk1 = new Stack<Character>();
		Stack<Character> stk2 = new Stack<Character>();
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		hm.put('^', 3);
		hm.put('/', 2);
		hm.put('*', 2);
		hm.put('+', 1);
		hm.put('-', 1);
		hm.put(')', 0);
		hm.put('(', 0);
		for (int i = 0; i < chs.length; i++) {
			if (i > 0 && InfixToPostfix.isOperator(chs[i - 1])) {
				appends(stk1, stk2, chs[i], sb);
			} else if (InfixToPostfix.isOperator(chs[i])) {
				sb.append(chs[i]);
			} else {
				stk1.push(chs[i]);
				stk2.push(')');
				sb.append('(');
			}
		}
		while (!stk2.isEmpty()) {
			sb.append(stk2.pop());
		}
		return sb.toString();
	}

	public static void appends(Stack<Character> stk1, Stack<Character> stk2, char ch, StringBuilder sb) {
		char poped = stk1.pop();
		if (stk1.isEmpty()) {
			sb.append(stk2.pop());
			if (!InfixToPostfix.isOperator(ch)) {
				sb.append(stk2.pop());
			}
		}
		sb.append(poped);
		if (InfixToPostfix.isOperator(ch)) {
			sb.append(ch);
		} else {
			stk1.push(ch);
			stk2.push(')');
			sb.append('(');
		}
	}
}
