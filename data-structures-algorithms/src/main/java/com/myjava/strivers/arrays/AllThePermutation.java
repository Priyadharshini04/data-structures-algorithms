package com.myjava.strivers.arrays;

import java.util.*;

public class AllThePermutation {
	
	public static void findPermutation(int[] nums,List<Integer> list,List<List<Integer>> allPer,boolean[] fill)
	{
		if(list.size()==nums.length)
		{
			allPer.add(new ArrayList<>(list));
			return;
		}
		for(int i=0;i<nums.length;i++)
		{
			if(!fill[i])
			{
				fill[i]=true;
				list.add(nums[i]);
				findPermutation(nums, list, allPer, fill);
				list.remove(list.size()-1);
				fill[i]=false;
			}
		}
	}
}
