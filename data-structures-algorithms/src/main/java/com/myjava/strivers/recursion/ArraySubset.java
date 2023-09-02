package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/
public class ArraySubset {
	List<List<Integer>> list2;
	public List<List<Integer>> subsets(int[] nums) {
		List<Integer> list1 = new ArrayList<Integer>();
		list2 = new ArrayList<List<Integer>>();
		if (nums.length == 0) {
			return list2;
		}
		subsets(nums, 0, list1);
		return list2;
	}
	
	
	public void subsets(int[] nums, int idx, List<Integer> list1) {
		if(idx==nums.length)
		{
			list2.add(new ArrayList<Integer>(list1));
			return;
		}
		list1.add(nums[idx]);
		subsets(nums,idx+1,list1);
		list1.remove(list1.size()-1);
		
		subsets(nums,idx+1,list1);
	}

//	public static void subsets(int[] nums, int start, int end, List<Integer> list1, List<List<Integer>> list2) {
//		if (start < end) {
//			int middle = start + (end - start) / 2;
//			subsets(nums, start, middle, list1, list2);
//			subsets(nums, middle + 1, end, list1, list2);
//			list1=new ArrayList<Integer>();
//			for (int i = start; i <= end; i++) {
//				list1.add(nums[i]);
//			}
//			list2.add(list1);
//		}
//		else {
//			list1=new ArrayList<Integer>();
//			list1.add(nums[start]);
//			list2.add(list1);
//		}
//	}
}
