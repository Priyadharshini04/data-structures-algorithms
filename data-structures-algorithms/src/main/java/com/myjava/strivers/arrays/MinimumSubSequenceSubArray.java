package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumSubSequenceSubArray {
	// x is always less
	// y is always greater
	public static int minimumSubarray(int n, int x, int y, int[] a) {
		int minSum = 0;
		int maxSum = 0;
		int minTotalSum = 0;
		int maxTotalSum = 0;
		boolean xReached = false;
		boolean yReached = false;
		int xIdx = -1;
		int yIdx = -1;
		List<Integer> xIdxs = new ArrayList<Integer>();
		List<Integer> yIdxs = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			if (xReached && yReached) {
				break;
			}
			if (!xReached) {
				minTotalSum += a[i];
				if (minSum < minTotalSum) {
					minTotalSum = minSum;
				} else {
					xIdxs.add(i);
					minSum = minTotalSum;
				}
				if (minTotalSum <= x) {
					xReached = true;
				}
			}
			if (!yReached) {
				maxTotalSum += a[i];
				if (maxSum > maxTotalSum) {
					maxTotalSum = maxSum;
				} else {
					yIdxs.add(i);
					maxSum = maxTotalSum;
				}
				if (maxTotalSum >= y) {
					yReached = true;
				}
			}
		}
		if (!yReached || !xReached) {
			return -1;
		}
		xIdx = xIdxs.get(xIdxs.size() - 1);
		yIdx = yIdxs.get(yIdxs.size() - 1);
		return xIdx > yIdx ? xIdx + 1 : yIdx + 1;
	}

}
