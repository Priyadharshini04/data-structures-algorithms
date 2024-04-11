package com.myjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyMain {

	public static void main(String[] args) {
		findConcatWords(new String[] { "cat", "cats", "catsdogcats", "dog", "dogcatsdog", "hippopotamuses", "rat",
				"ratcatdogcat", "catcat", "cat$cat" }).forEach(i -> System.out.println(i));
	}

	public static List<String> findConcatWords(String[] strs) {
		// Input: words =
		// ["cat","cats","catsdogcats","dog","dogcatsdog","hippopotamuses","rat","ratcatdogcat"]
		// Output: ["catsdogcats","dogcatsdog","ratcatdogcat"]
		List<String> result = new ArrayList<String>();
		Arrays.sort(strs, (a, b) -> {
			int aLen = a.length();
			int bLen = b.length();
			return aLen - bLen;
		}); // "cat","dog","rat","cats","dogcatsdog",
			// "catsdogcats","ratcatdogcat","hippopotamuses",]
		Set<String> setStr = new HashSet<String>();
		for (String str : strs) {
			setStr.add(str);
		}
		for (int i = strs.length - 1; i >= 0; i--) {
			setStr.remove(strs[i]);
			Iterator<String> itr = setStr.iterator();
			int count = 0;
			while (itr.hasNext() && count < 2) {
				String word = itr.next();
				String conWord = word + word;
				if (containsSubsequence(strs[i], conWord)) {
					count = 2;
				} else if (strs[i].contains(word)) {
					count++;
				}
			}
			if (count >= 2) {
				result.add(strs[i]);
			}
		}
		return result;
	}

	public static boolean containsSubsequence(String str, String sub) {
		int i = 0; // Index for the main string 'str'
		int j = 0; // Index for the subsequence 'sub'

		// Iterate over both strings
		while (i < str.length() && j < sub.length()) {
			// If characters match, move to the next character in the subsequence
			if (str.charAt(i) == sub.charAt(j)) {
				j++;
			}
			// Move to the next character in the main string
			i++;
		}

		// If all characters in the subsequence were matched, it's a subsequence
		return j == sub.length();
	}
}
