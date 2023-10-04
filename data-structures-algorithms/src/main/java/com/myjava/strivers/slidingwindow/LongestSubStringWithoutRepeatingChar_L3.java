package com.myjava.strivers.slidingwindow;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
public class LongestSubStringWithoutRepeatingChar_L3 {
	
	// Sliding window with map.
	public static int lengthOfLongestSubstring(String s)
	{
		int maxStringLen=0;
		Map<Character,Integer> set=new HashMap<Character,Integer>();
		int left=0;
		int right=0;
		while(right<s.length())
		{
			if(!set.isEmpty() && set.containsKey(s.charAt(right)))
			{
				left=Math.max(left,set.get(s.charAt(right))+1);
			}
			maxStringLen=Math.max(maxStringLen, right-left+1);
			set.put(s.charAt(right),right);
			right++;
		}
		return maxStringLen;
	}
	
	// sliding window technique.
	public static int lengthOfLongestSubstringss(String s)
	{
		int maxStringLen=0;
		List<Character> set=new ArrayList<Character>();
		int left=0;
		int right=0;
		while(right<s.length())
		{
			while(!set.isEmpty() && set.contains(s.charAt(right)))
			{
				set.remove(0);
				left++;
			}
			maxStringLen=Math.max(maxStringLen, right-left+1);
			set.add(s.charAt(right));
			right++;
		}
		return Math.max(maxStringLen, right-left);
	}
	
	// Brute Force.
	public static int lengthOfLongestSubstrings(String s) {
		int maxstringLen = 0;
		Queue<String> q1=new ArrayDeque<String>();
		for (int i = 0; i < s.length(); i++) {
			while (!q1.isEmpty() && q1.contains(String.valueOf(s.charAt(i)))) {
				maxstringLen = Math.max(maxstringLen, q1.size());
				q1.poll();
			}
			q1.add(String.valueOf(s.charAt(i)));
		}
		return Math.max(maxstringLen, q1.size());
	}

}
