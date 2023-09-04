package com.myjava.strivers.binarysearch;
//https://www.codingninjas.com/studio/problems/occurrence-of-x-in-a-sorted-array_630456
public class CountOccurence {
	
	public static int findOccurrence(int[] arr, int x) {
		int count=0;
		if(arr[arr.length-1]<x)
		{
			return count;
		}
		int[] pos=StartEndPosition.findStartandEndPosition(arr,x);
		if(pos[0]<0)
		{
			return 0;
		}
		else if(pos[1]<0)
		{
			return 1;
		}
		return pos[1]-pos[0]+1;
	}

}
