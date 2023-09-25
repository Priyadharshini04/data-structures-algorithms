package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://www.codingninjas.com/studio/problems/convert-prefix-to-postfix_8391014
public class PrefixToPostfix {

	public static String preToPost(String string) {
		Stack<String> stk1=new Stack<String>();
		char[] chs=string.toCharArray();
		for(int i=chs.length-1;i>=0;i--)
		{
			StringBuilder sb=new StringBuilder();
			if(InfixToPostfix.isOperator(chs[i]))
			{
				stk1.push(String.valueOf(chs[i]));
			}
			else {
				sb.append(stk1.pop());
				sb.append(stk1.pop());
				sb.append(chs[i]);
				stk1.push(sb.toString());
				sb=new StringBuilder();
			}
		}
		StringBuilder sb1=new StringBuilder();
		while(!stk1.isEmpty())
		{
			sb1.append(stk1.pop());
		}
		return sb1.toString();
	}

}
