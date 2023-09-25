package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://www.codingninjas.com/studio/problems/postfix-to-prefix_1788455
public class PostFixToPrefix {
	// Hint: Use single stack
	public static String postfixToPrefix(String string) {
		Stack<String> stk1 = new Stack<String>();
		char[] chs=string.toCharArray();
		for(int i=0;i<chs.length;i++)
		{
			StringBuilder sb=new StringBuilder();
			if(InfixToPostfix.isOperator(chs[i]))
			{
				stk1.push(String.valueOf(chs[i]));
			}
			else {
				sb.append(chs[i]);
				if(stk1.size()>=2)
				{
					String pop = stk1.pop();
					sb.append(stk1.pop());
					sb.append(pop);
				}
				stk1.push(sb.toString());
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
