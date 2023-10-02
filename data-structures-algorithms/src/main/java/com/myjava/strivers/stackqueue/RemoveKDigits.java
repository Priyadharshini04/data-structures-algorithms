package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/remove-k-digits/description/
public class RemoveKDigits {

	// Beats only 58%. O(n+n)
	public static String removeKdigit(String num,int k) {
		Stack<Character> stk=new Stack<Character>();
		char[] ch=num.toCharArray();
		int n=ch.length;
		for(int i=0;i<=n;i++)
		{
			while(!stk.isEmpty()  && k>0 && (i==n || stk.peek()>ch[i]))
			{
				stk.pop();
				k--;
			}
			if((i==n) || (stk.isEmpty() && ch[i]-'0'==0))
			{
				continue;
			}
			stk.push(ch[i]);
		}
		ch=new char[stk.size()];
		int i=ch.length-1;
		while(i>=0 && !stk.isEmpty())
		{
			ch[i]=stk.pop();
			i--;
		}
		return ch.length==0?"0": String.valueOf(ch);
	}
	// Better solution. Beats 98%. O(n)
	public static String removeKdigits(String num,int k) {
		char[] chs=num.toCharArray();
		int stackLength=0;
		for(char ch:chs)
		{
			while(k>0 && stackLength>0 && chs[stackLength-1]>ch )
			{
				stackLength--;
				k--;
			}
			if( (stackLength>0 || ch-'0'!=0))
			{
				chs[stackLength++]=ch;
			}
		}
		 stackLength -= k;
	     return stackLength <= 0 ? "0" : String.valueOf(chs, 0, stackLength);
	}
}
