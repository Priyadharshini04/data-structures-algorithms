package com.myjava.strivers.recursion;

import java.util.ArrayList;
import java.util.List;

// https://www.codingninjas.com/studio/problems/subarrays-with-sum-%E2%80%98k'_6922076
public class SubArraysWithSumK {

	public static List<List<Integer>> subarraysWithSumK(int[] a, long k) {

		List<Integer> list1=new ArrayList<Integer>();
		List<List<Integer>> list2=new ArrayList<List<Integer>>();
		if(a.length==0)
		{
			list2.add(list1);
			return list2;
		}
		else if(a.length==1){
			list1.add(a[0]);
			list2.add(list1);
		}
		subArraysWithSumK(a, 0L, list1, list2, 0, 0, k);
		return list2;
	}
	public static void subArraysWithSumK(int[] arr,long sum,List<Integer> list1,List<List<Integer>> list2,int start,int curr,long k)
	{
		if(curr<arr.length)
		{
			sum+=arr[curr];
			list1.add(arr[curr]);
			curr+=1;
			while(sum > k && start<=curr){
				sum-=arr[start];
				list1.remove(0);
				start++;
			}
			if(sum==k)
			{
				List<Integer> temp=new ArrayList<Integer>(list1);
				list2.add(temp);
			}
			subArraysWithSumK(arr, sum,list1,list2,start,curr,k);
		}
	}

}
