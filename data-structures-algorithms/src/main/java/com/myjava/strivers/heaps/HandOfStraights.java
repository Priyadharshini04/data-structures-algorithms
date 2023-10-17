package com.myjava.strivers.heaps;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.TreeMap;

// https://leetcode.com/problems/hand-of-straights/description/
public class HandOfStraights {
	// Sequence matters 1,2,2,2,3,3,3,4,6,7,8.
	public static boolean isNStraightHand(int[] hand, int groupSize) {
		if (hand.length % groupSize != 0) {
			return false;
		}
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		for (int i = 0; i < hand.length; i++)
			pq1.offer(hand[i]);
		while (!pq1.isEmpty()) {
			int val = pq1.peek();
			for (int i = val; i < val + groupSize; i++) {
				if (!pq1.remove(i))
					return false;
			}
		}
		return true;
	}

	// Like a rummy game. Time Complexity O(n*n)
	public static boolean isNStraightHands(int[] hand, int groupSize) {
		if (hand.length % groupSize != 0) {
			return false;
		}
		PriorityQueue<Integer> pq1 = new PriorityQueue<Integer>();
		for (int i = 0; i < hand.length; i++)
			pq1.add(hand[i]);

		int cnt = 0;
		Stack<Integer> stk = new Stack<Integer>();
		List<Integer> polledList = new ArrayList<Integer>();
		while (!pq1.isEmpty() && cnt < hand.length) {
			if (stk.size() == groupSize) {
				stk.clear();
			}
			if (stk.isEmpty()) {
				stk.push(pq1.poll());
			} else {
				while (!pq1.isEmpty() && stk.peek() + 1 != pq1.peek()) {
					polledList.add(pq1.poll());
				}
				if (!pq1.isEmpty() && stk.peek() + 1 == pq1.peek()) {
					stk.push(pq1.poll());
				}
				if (polledList.size() > 0) {
					pq1.addAll(polledList);
					polledList.clear();
				}
			}
			cnt++;
		}
		if (pq1.isEmpty())
			return true;
		return false;
	}

}
