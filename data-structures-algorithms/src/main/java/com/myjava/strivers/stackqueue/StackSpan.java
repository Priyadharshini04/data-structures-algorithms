package com.myjava.strivers.stackqueue;

import java.util.Stack;

//https://www.geeksforgeeks.org/problems/stock-span-problem-1587115621/1?utm_source=geeksforgeeks&utm_medium=ml_article_practice_tab&utm_campaign=article_practice_tab
//https://leetcode.com/problems/online-stock-span/
public class StackSpan {

	public static int[] calculateSpan(int[] price) {
		// sorted ascending linked list is a best choice.
		int n = price.length;
		int[] ans = new int[n];
		Stack<Integer> stk = new Stack<Integer>();
		for (int i = 0; i < n; i++) {
			while (!stk.isEmpty() && price[stk.peek()] <= price[i]) {
				stk.pop();
			}
			if (stk.isEmpty()) {
				ans[i] = i + 1; // all the elements before this one was smaller so i+1.
			} else {
				ans[i] = i - stk.peek();
			}
			stk.push(i);
		}
		return ans;
	}

}
