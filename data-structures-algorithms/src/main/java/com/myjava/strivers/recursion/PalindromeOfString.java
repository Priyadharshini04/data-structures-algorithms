package com.myjava.strivers.recursion;


public class PalindromeOfString {
	//https://leetcode.com/problems/valid-palindrome/
	public static boolean isPalindrom(String str) {
		if(str==null)
			return false;
		if(str.isEmpty() || str.trim().length()<=1)
			return true;
		str=str.replaceAll("\s+", "");
		str=str.toLowerCase();
		char[] chArr=str.toCharArray();
		return reverseString(chArr,0,chArr.length-1).equals(str);
	}
	public static String reverseString(char[] chArr, int start, int end)
	{
		if(start>=end)
		{
			return String.valueOf(chArr);
		}
		char a=chArr[start];
		chArr[start] = chArr[end];
		chArr[end] = a;
		return reverseString(chArr,++start, --end);
	}
}
