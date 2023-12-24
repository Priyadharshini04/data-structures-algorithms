package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://leetcode.com/contest/weekly-contest-377/problems/maximum-square-area-by-removing-fences-from-a-field/
public class MaximumSquareRemovingFences_L2975 {
	public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
		int ans = -1;
		Arrays.sort(hFences);
		Arrays.sort(vFences);
		Set<Integer> set = new HashSet<Integer>();
		List<Integer> horizondal = new ArrayList<Integer>();
		List<Integer> vertical̰ = new ArrayList<Integer>();

		for (int i = 0; i < hFences.length; i++) {
			horizondal.add(hFences[i]);
		}
		horizondal.add(0, 1);
		horizondal.add(m);
		for (int i = 0; i < vFences.length; i++) {
			vertical̰.add(vFences[i]);
		}
		vertical̰.add(0, 1);
		vertical̰.add(n);
		for (int i = 0; i < horizondal.size(); i++) {
			for (int j = i + 1; j < horizondal.size(); j++) {
				set.add(horizondal.get(j) - horizondal.get(i));
			}
		}
		for (int i = 0; i < vertical̰.size(); i++) {
			for (int j = i + 1; j < vertical̰.size(); j++) {
				if (set.contains(vertical̰.get(j) - vertical̰.get(i))) {
					ans = Math.max(ans, vertical̰.get(j) - vertical̰.get(i));
				}
			}
		}
		return ans == -1 ? -1 : (int) ((ans * ans) % (1000000007));
	}
}
