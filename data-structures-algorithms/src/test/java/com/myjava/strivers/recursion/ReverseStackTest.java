package com.myjava.strivers.recursion;

import java.util.Stack;

import org.junit.Test;

public class ReverseStackTest {
	@Test
	public void test1() {
		Stack<Integer> stk = new Stack<Integer>();
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		for (int i = 0; i < arr.length; i++) {
			stk.push(arr[i]);
		}
		ReverseStack.reverseStack(stk);
	}
}
