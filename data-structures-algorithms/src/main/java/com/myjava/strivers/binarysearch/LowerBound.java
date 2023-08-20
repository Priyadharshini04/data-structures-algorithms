package com.myjava.strivers.binarysearch;

public class LowerBound {
	// https://www.codingninjas.com/studio/problems/lower-bound_8165382
	// the same value else the next greatest value index for x

	public static int lowerBound(int []arr, int x) {
		 int left=0;
		 int right=arr.length-1;
		 int max=0;
		 while(left<=right)
		 {
			 int mid=(left+(right-left)/2);
			 if(arr[mid]==x)
				 return mid;
			 else if(arr[mid]>=x)
			 {
				right=mid-1;
				max=mid;
			 }
			 else if(arr[mid]<x)
			 {
				 left=mid+1;
			 }
		 }
		 if(arr[max]>=x)
		 {
			 return max;
		 }
		 return arr.length;
	 }
}
