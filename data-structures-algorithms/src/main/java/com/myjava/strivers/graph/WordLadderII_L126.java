package com.myjava.strivers.graph;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

//https://leetcode.com/problems/word-ladder-ii/
public class WordLadderII_L126 {

	public static int findLadders(String beginWord, String endWord, List<String> wordList) {
		int total = 0;
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

		List<Character> begin = new ArrayList<>();
		for (char c : beginWord.toCharArray()) {
			begin.add(c);
		}

		List<Character> end = new ArrayList<>();
		for (char c : endWord.toCharArray()) {
			end.add(c);
		}

		Queue<WordWithCount> queue = new ArrayDeque<>();
		queue.offer(new WordWithCount(begin));

		while (!queue.isEmpty()) {
			WordWithCount wc = queue.poll();
			List<Character> word = wc.word;
			if (word.equals(end)) {
				continue;
			}
			for (int i = 0; i < end.size(); i++) {
				char original = word.get(i);
				for (char j = 'a'; j <= 'z'; j++) {
					word.set(i, j);
					if (set.contains(word)) {
						if (word.equals(end))
							total = 1;
						queue.offer(new WordWithCount(new ArrayList<>(word), wc.count + 1));
						set.remove(word);
					} else if (word.equals(end) && total >= 1) {
						total++;
					}
				}
				word.set(i, original);
			}
		}
		return total;
	}
}
