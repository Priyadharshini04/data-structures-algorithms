package com.myjava.strivers.recursion;

// https://leetcode.com/problems/string-to-integer-atoi/
public class StringToInteger {
	public static int myAtoi(String s) {
		int i=0;
		boolean isNegative=false;
		while(i<s.length() && s.charAt(i)==' ')
		{
			i++;
		}
		if(s.charAt(i)=='-')
		{
			isNegative=true;
			i++;
		}
		else if(s.charAt(i)=='+')
		{
			isNegative=false;
			i++;
		}
		int start=i;
		while(i<s.length() && isDigit(s.charAt(i)))
		{
			i++;
		}
		if(start>i-1)
		{
			return 0;
		}
		return convert(s.toCharArray(),start,--i,0,isNegative,i-start);
	}
	public static boolean isDigit(char ch)
	{
		if(ch<='9' && ch>='0')
		{
			return true;
		}
		return false;
	}

	public static int convert(char[] chs,int start,int end,int num, boolean isNegative,int digit) {
		num=num+(chs[start]-'0');
		if(start==end)
		{
			if(isNegative)
			{
				return num*-1;
			}
			return num;
		}
		 if ( (start+1!=end && (num > (Integer.MAX_VALUE / 10) || (num == (Integer.MAX_VALUE / 10) && digit > 7))) || (num==Integer.MAX_VALUE)) 
		 {
			if(isNegative)
			{
				return Integer.MIN_VALUE;
			}
			return Integer.MAX_VALUE;
		}
		return convert(chs,++start,end,num*10,isNegative,digit);
	}
}
