package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.codingninjas.com/studio/problems/more-subsequence_8842355
public class StringSubsequenceMore {

	public static String largeSubsequence(int n, int m, String str1, String str2) {
		if(str1.isBlank() && str2.isBlank() )
		{
			return str1;
		}
		if(str1.isBlank() && !str2.isBlank() )
		{
			return str2;
		}
		List<String> str1List=new ArrayList<String>();
		List<String> str2List=new ArrayList<String>();
		Set<Character> set1=new HashSet<Character>();
		Set<Character> set2=new HashSet<Character>();
		findUniqueElemtns(str1,n,0,set1);
		findUniqueElemtns(str2,m,0,set2);
		if(set1.size()>set2.size())
		{
			return str1;
		}
		else if(set1.size()==set2.size())
		{
			return n>=m?str1:str2;
		}
		return str2;
	}
	public static void subsequence(int length, int idx, String ori,String str,List<String> strs) {
		if(idx==length)
		{
			if(!str.isBlank() && !strs.contains(str))
			strs.add(str);
			return;
		}
		str+=ori.charAt(idx);
		subsequence(length,idx+1,ori,str,strs);
		if(str.length()==1) {
			str="";
		}
		else
		str=str.substring(0,str.length()-1);
		subsequence(length,idx+1,ori,str,strs);
	}
	public static void findUniqueElemtns(String str,int len,int idx, Set<Character> set)
	{
		if(idx==len)
		{
			return;
		}
		if(!set.contains(str.charAt(idx)))
		{
			set.add(str.charAt(idx));
		}
		findUniqueElemtns(str,len,++idx,set);
	}
}
