package com.myjava.strivers.arrays;
//https://www.codingninjas.com/studio/problems/remove-duplicates-from-sorted-array_1102307
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {


	public static int removeDuplicates(ArrayList<Integer> arr,int n) {
		if(n==1)
		{
			return 1;
		}
		else if( n==2)
		{
			if(arr.get(0).equals(arr.get(1)))
			{
				return 1;
			}
			return 2;
		}
		int count=0;
		for(int j=0;j<arr.size()-1;j++)
		{
			if(!arr.get(j).equals(arr.get(j+1)))
			{
				count++;
			}
		}
		return count+1;
	}
	public static int removeDuplicate(ArrayList<Integer> arr,int n)
	{
		HashSet<Integer> hs=new HashSet<Integer>(arr);
		return hs.size();
	}
}
