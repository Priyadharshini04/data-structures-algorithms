package com.myjava.strivers.strings;

// https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/description/
public class MaximumNestingDepthParentheses_L1614 {

	public static int maxDepth(String string) {
		int maxDepth = 0;
		int leftParenthesis=0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == '(') {
				++leftParenthesis;
			}
			else if(string.charAt(i) == ')')
			{
				if(leftParenthesis>maxDepth)
				{
					maxDepth=leftParenthesis;
				}
				--leftParenthesis;
			}
		}
		if(leftParenthesis>maxDepth)
		{
			maxDepth=leftParenthesis;
		}
		return maxDepth;
	}

}
