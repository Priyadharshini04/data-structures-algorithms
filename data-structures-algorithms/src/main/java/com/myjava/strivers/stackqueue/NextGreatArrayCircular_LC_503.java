package com.myjava.strivers.stackqueue;

import java.util.Stack;

// https://leetcode.com/problems/next-greater-element-ii/description/
public class NextGreatArrayCircular_LC_503 {
	// Don't use map. Map will not give results for duplicate values.
	public static int[] nextGreaterElements(int[] nums) {
		Stack<Integer> stk1=new Stack<Integer>();
		int[] ans=new int[nums.length];
		int n=nums.length;
		for(int i=(n*2)-1;i>=0;i--)
		{
			while(!stk1.isEmpty() && stk1.peek()<=nums[i%n])
			{
				stk1.pop();
			}
			if(i<n)
			{
				ans[i] = !stk1.isEmpty() ? stk1.peek() : -1;
			}
			stk1.push(nums[i % n]);
		}
		return ans;
	}

}
