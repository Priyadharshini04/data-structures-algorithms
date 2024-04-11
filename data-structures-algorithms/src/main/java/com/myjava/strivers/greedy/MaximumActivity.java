package com.myjava.strivers.greedy;

import java.util.Arrays;

public class MaximumActivity {

	public static Object activitySelection(int start[], int end[]) {
		int n = start.length;
		PairActivity[] pairs = new PairActivity[n];
		for (int i = 0; i < n; i++) {
			pairs[i] = new PairActivity(start[i], end[i]);
		}
		Arrays.sort(pairs, (a, b) -> {
			if (a.end < b.end) {
				return -1;
			} else if (a.end > b.end) {
				return 1;
			}
			return 0;
		});
		int total = 1;
		int prevEnd = pairs[0].end;
		for (int i = 1; i < n; i++) {
			if (prevEnd < pairs[i].start) {
				total++;
				prevEnd = pairs[i].end;
			}
		}
		return total;
	}
}

class PairActivity {
	int start;
	int end;

	PairActivity(int start, int end) {
		this.start = start;
		this.end = end;
	}
}
