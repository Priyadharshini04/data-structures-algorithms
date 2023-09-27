package com.myjava.strivers.stackqueue;
// https://leetcode.com/problems/next-greater-element-i/description/
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElementArraySubSet_L496 {
	// Use stack.
	public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		int[] ans=new int[nums1.length];
		Stack<Integer> stk1=new Stack<Integer>();
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=nums2.length-1;i>=0;i--)
		{
			while(!stk1.isEmpty()&&stk1.peek()<nums2[i])
			{
				stk1.pop();
			}
			map.put(nums2[i], stk1.isEmpty()?-1:stk1.peek());
			stk1.push(nums2[i]);
		}
		for(int i=0;i<nums1.length;i++)
		{
			ans[i]=map.get(nums1[i]);
		}
		return ans;
	}
	public static int[] nextGreaterElements(int[] nums1, int[] nums2) {
		int[] ans=new int[nums1.length];
		Map<Integer,Integer> map=new HashMap<Integer, Integer>();
		for(int i=0;i<nums2.length;i++)
		{
			int j=i+1;
			boolean found=false;
			while(j<nums2.length)
			{
				if(nums2[j]>nums2[i])
				{
					map.put(nums2[i], nums2[j]);
					found=true;
					break;
				}
				j++;
			}
			if(!found)
			{
				map.put(nums2[i], -1);
			}
		}
		for(int i=0;i<nums1.length;i++)
		{
			ans[i]=map.get(nums1[i]);
		}
		return ans;
	}
}
