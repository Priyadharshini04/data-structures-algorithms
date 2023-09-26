package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://www.codingninjas.com/studio/problems/postfix-to-infix_8382386
public class PostfixToInfix {

	public static String postToInfix(String postfix) {
		Stack<String> stk1 = new Stack<String>();
		char[] chs = postfix.toCharArray();
		for (int i = 0; i < chs.length; i++) {
			StringBuilder sb = new StringBuilder();
			if (InfixToPostfix.isOperator(chs[i])) {
				stk1.push(String.valueOf(chs[i]));
			} else {
				if (!stk1.isEmpty() && stk1.size()>=2) {
					sb.append("(");
					String op2=stk1.pop();
					String op1=stk1.pop();
					sb.append(op1);
					sb.append(chs[i]);
					sb.append(op2);
					sb.append(")");
					stk1.push(sb.toString());
				}
			}
		}
		return stk1.pop();
	}

}
