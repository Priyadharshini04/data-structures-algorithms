package com.myjava.strivers.stackqueue;

import java.util.Stack;
// https://leetcode.com/problems/valid-parentheses/
public class ValidParentheses {

	public static boolean isValid(String s) {
		Stack<Character> stk=new Stack<Character>();
		char[] chs=s.toCharArray();
		for(int i=0;i<chs.length;i++)
		{
			if(stk.isEmpty())
			{
				stk.push(chs[i]);
			}
			else {
				if(stk.peek()==chs[i]-1 || stk.peek()==chs[i]-2)
				{
					stk.pop();
				}
				else {
					stk.push(chs[i]);
				}
			}
		}
		return stk.isEmpty();
	}

}
