package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr= new ArrayList<Integer>( Arrays.asList(1,2,2,3,3,3,4,4,5,5) );
		System.out.println(removeDuplicates(arr, 10));
		System.out.println(removeDuplicate(arr, 10));

	}
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
