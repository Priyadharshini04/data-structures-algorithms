package com.myjava.strivers.stackqueue;

import java.util.ArrayList;
import java.util.List;

import com.myjava.strivers.linkedlist.Node;

// https://leetcode.com/problems/min-stack/

// More space complexity O(2N) TC O(1)
class MinStacks {
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> minList = new ArrayList<Integer>();
	int min = Integer.MAX_VALUE;
	int top = -1;

	public void push(int val) {
		if (min > val) {
			min = val;
		}
		list.add(val);
		minList.add(min);
		++top;
	}

	public void pop() {
		list.remove(top);
		minList.remove(top);
		--top;
		if (top == -1) {
			min = Integer.MAX_VALUE;
		} else {
			min = minList.get(top);
		}
	}

	public int top() {
		return list.get(top);
	}

	public int getMin() {
		return minList.get(top);
	}
}

// Space complexity O(N) and TC is O(1)
public class MinStack {
	List<Long> list = new ArrayList<Long>();
	int min = Integer.MAX_VALUE;
	int top = -1;

	public void push(int val) {
		if (min > val) {
			Long val1 = (long) val;
			list.add(((2 * val1) - min));
			min = val;
		} else {
			list.add((long) val);
		}
		++top;
	}

	public void pop() {
		if (list.get(top) < min) {
			min = (int) (2 * min - list.get(top));
		}
		list.remove(top--);
		if (top == -1) {
			min = Integer.MAX_VALUE;
		}
	}

	public int top() {
		if (list.get(top) < min) {
			return min;
		}
		int x = Integer.parseInt(String.valueOf(list.get(top)));
		return x;
	}

	public int getMin() {
		return min;
	}
}
