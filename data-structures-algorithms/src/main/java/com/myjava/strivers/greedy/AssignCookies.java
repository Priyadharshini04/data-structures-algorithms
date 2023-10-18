package com.myjava.strivers.greedy;

import java.util.Arrays;

// https://leetcode.com/problems/assign-cookies/description/
public class AssignCookies {

	// The more optimized code but more time complexity.
	public static int findContentChildren(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int i = 0;
		int j = 0;
		for (; i < g.length && j < s.length; j++) {
			if (g[i] <= s[j])
				i++;
		}
		return i;
	}

	// Own solution is a optimized solution.
	public static int findContentChildrens(int[] g, int[] s) {
		Arrays.sort(g);
		Arrays.sort(s);
		int contentChildren = 0;
		int i = 0;
		int j = 0;
		// Try to use while instead of for since for loop space complexity is high.
		while (i < g.length) {
			while (j < s.length) {
				if (g[i] <= s[j]) {
					contentChildren++;
					j++;
					break;
				}
				j++;
			}
			i++;
		}
		return contentChildren;
	}

}
