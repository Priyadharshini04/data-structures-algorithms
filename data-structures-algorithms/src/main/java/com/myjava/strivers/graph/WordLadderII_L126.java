package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/word-ladder-ii/
public class WordLadderII_L126 {

	public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
		List<List<String>> result = new ArrayList<List<String>>();
		int n = beginWord.length();
		Set<List<Character>> set = new HashSet<>();
		for (int i = 0; i < wordList.size(); i++) {
			if (!beginWord.equals(wordList.get(i))) {
				List<Character> chars = new ArrayList<>();
				for (char c : wordList.get(i).toCharArray()) {
					chars.add(c);
				}
				set.add(chars);
			}
		}
		List<Character> endWordChars = new ArrayList<Character>();
		for (char c : endWord.toCharArray()) {
			endWordChars.add(c);
		}

		List<Character> beginWordChars = new ArrayList<Character>();
		for (char c : beginWord.toCharArray()) {
			beginWordChars.add(c);
		}
		List<String> list = new ArrayList<String>();
		findWords(list, result, set, set, beginWordChars, n, new boolean[] { false }, endWordChars, beginWord);

		return result;
	}

	public static void findWords(List<String> list, List<List<String>> res, Set<List<Character>> set,
			Set<List<Character>> globalSet, List<Character> currStr, int n, boolean[] hasEnd, List<Character> endString,
			String beginString) {
		for (int i = 0; i < n; i++) {
			char currChar = currStr.get(i);
			for (char j = 'a'; j <= 'z'; j++) {
				currStr.set(i, (char) j);
				if (set.contains(currStr)) {
					List<String> newList = new ArrayList<String>(list);
					set.remove(currStr);
					String removeStr = listToString(currStr);
					if (endString.equals(currStr)) {
						hasEnd[0] = true;
						newList.add(0, beginString);
						res.add(new ArrayList<String>(newList));
						return;
					} else {
						newList.add(removeStr);
						findWords(newList, res, set, globalSet, currStr, n, hasEnd, endString, beginString);
					}
					list.remove(removeStr);

				} else if (endString.equals(currStr) && hasEnd[0]) {
					List<String> newList = new ArrayList<String>(list);
					String removeStr = listToString(currStr);
					newList.add(removeStr);
					newList.add(0, beginString);
					res.add(new ArrayList<String>(newList));
					list.remove(removeStr);
					return;
				}
			}
			currStr.set(i, currChar);
		}
	}

	public static String listToString(List<Character> list) {
		StringBuilder sb = new StringBuilder();
		for (char ch : list) {
			sb.append(ch);
		}
		return sb.toString();
	}
}
