package com.myjava.strivers.recursion;

import java.util.Stack;

public class ReverseStack {

	public static void reverseStack(Stack<Integer> stk) {
		if (!stk.isEmpty()) {
			System.out.print(stk.pop()+" ");
			reverseStack(stk);
		}
	}

}
