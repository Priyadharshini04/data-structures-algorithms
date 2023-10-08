package com.myjava.strivers.slidingwindow;

// https://leetcode.com/problems/longest-repeating-character-replacement/description/
public class LongestRepeatingCharacterReplacement_L424 {
	
	// Note: length of sub string - number of time maximum occurring character in sub string
	public static int characterReplacement(String s, int k) {
		int maxRepLen=0;
		int start=0;
		int maxSubRepLen=0;
		int[] chars=new int[26];
		for(int end=0;end<s.length();end++)
		{
			chars[s.charAt(end)-'A']++;
			maxSubRepLen=Math.max(maxSubRepLen, chars[s.charAt(end)-'A']);
			if((end-start+1)-maxSubRepLen>k)
			{
				chars[s.charAt(start)-'A']--;
				start++;
			}
			maxRepLen=Math.max(maxRepLen, end-start+1);
		}
		return maxRepLen;
	}
	
	// Doesn't work well for all the scenarios.
	public static int characterReplacements(String s, int k) {
		int len = 0;
		int n=s.length();
		for (int i = 0; i < n; i++) {
			StringBuilder sb=new StringBuilder();
			int left=(i==0?0:i-1);
			int right=i+1;
			boolean leftReached=i==0?true:false;
			boolean rightReached=false;
			int flipped=k;
			while(left>=0 && right<n)
			{
				if( flipped ==0 && (left==0||s.charAt(left)!=s.charAt(i)) &&( right==n || s.charAt(i)!=s.charAt(right)))
				{
					break;
				}
				if( flipped > 0 && !leftReached && s.charAt(i)!=s.charAt(left))
				{
					sb.append(s.charAt(i));
					flipped--;
				}
				if(flipped > 0 && !rightReached && s.charAt(i)!=s.charAt(right))
				{
					sb.append(s.charAt(i));
					flipped--;
				}
				if(!leftReached && s.charAt(i)==s.charAt(left) )
				{
					sb.append(s.charAt(i));
				}
				if(!rightReached && s.charAt(i)==s.charAt(right) )
				{
					sb.append(s.charAt(i));
				}
				left--;
				right++;
				if( left<0)
				{
					leftReached=true;
					left=0;
				}
				if(right>=n)
				{
					right=n;
					rightReached=true;
				}
			}
			len=Math.max(len, sb.length()+1);
		}
		return len;
	}

}
