package com.myjava.strivers.strings;

import java.util.LinkedHashSet;
import java.util.Set;
//https://www.codingninjas.com/studio/problems/longest-substring-with-at-most-k-distinct-characters_2221410
public class CountWithKDifferentCharacters {

	public static int countSubStrings(String str, int k) {
		int totalCount = 0;
		for (int i = 0; i < str.length(); i++) {
			Set<Character> sb = new LinkedHashSet<Character>();
			int j = i;
			while (j < str.length()) {
				sb.add(str.charAt(j));
				j++;
				if(sb.size() ==k)
				{
					totalCount +=1;
				}
			}
		}
		return totalCount;
	}

}
