package com.myjava.strivers.arrays;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

// https://www.codingninjas.com/studio/problems/sorted-array_6613259
public class MergeUniqueElementsArray {

	public static List<Integer> sortedArray(int[] a, int[] b) {
		int i = 0;
		int j = 0;
		Set<Integer> list = new LinkedHashSet<Integer>();
		while (i < a.length && j < b.length) {
			if (a[i] < b[j]) {
				list.add(a[i]);
				i++;
			} else if (a[i] == b[j]) {
				list.add(a[i]);
				i++;
				j++;
			} else {
				list.add(b[j]);
				j++;
			}
		}
		while (i < a.length) {
			list.add(a[i]);
			i++;
		}
		while (j < b.length) {
			list.add(b[j]);
			j++;
		}
		return list.stream().collect(Collectors.toList());
	}
}
