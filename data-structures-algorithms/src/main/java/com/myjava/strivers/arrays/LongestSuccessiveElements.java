package com.myjava.strivers.arrays;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

// https://www.codingninjas.com/studio/problems/longest-successive-elements_6811740
public class LongestSuccessiveElements {

	public static int longestSuccessiveElementss(int[] a) {
		int maxSeq = 0;
		Set<Integer> set = new TreeSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		List<Integer> list = set.stream().collect(Collectors.toList());
		Collections.sort(list);
		int seq = 1;
		boolean seqinc = false;
		for (int i = 0; i < list.size() - 1; i++) {
			if (list.get(i) + 1 == list.get(i + 1)) {
				seq++;
				seqinc = true;
			} else {
				maxSeq = Math.max(maxSeq, seq);
				seq = 1;
			}

		}
		if (seqinc)
			maxSeq = Math.max(maxSeq, seq);
		return maxSeq;
	}

	// Better solution.
	public static int longestSuccessiveElements(int[] a) {
		int maxSeq = 0;
		int seq = 2;
		boolean seqinc = false;
		Set<Integer> set = new LinkedHashSet<Integer>();
		for (int i = 0; i < a.length; i++) {
			set.add(a[i]);
		}
		for (int i = 0; i < a.length; i++) {
			if (set.contains(a[i] - 1)) {
				seq = 2;
				int currElement = a[i];
				while (set.contains(currElement + 1)) {
					currElement++;
					seq++;
				}
				seqinc = true;
				maxSeq = Math.max(maxSeq, seq);
			}
		}
		if (seqinc)
			maxSeq = Math.max(maxSeq, seq);
		return maxSeq;
	}
}
