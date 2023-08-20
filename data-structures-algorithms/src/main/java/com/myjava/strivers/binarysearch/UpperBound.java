package com.myjava.strivers.binarysearch;

public class UpperBound {

	// Same like lowerbound but should find only the next greater element and should not be a same element.
	//https://www.codingninjas.com/studio/problems/implement-upper-bound_8165383
	 public static int upperBound(int []arr, int n, int x) {
		 int left=0;
		 int right=arr.length-1;
		 int max=arr.length-1;
		 while(left<=right)
		 {
			 int mid=(left+(right-left)/2);
			 if(arr[mid]==x)
			 {
				left=mid+1;
			 }
			 else if(arr[mid]>x)
			 {
				if(arr[max]>arr[mid])
				 max=mid;
				right=mid-1;
				 
			 }
			 else if(arr[mid]<x)
			 {
				 left=mid+1;
			 }
		 }
		 if(arr[max]>x)
		 {
			 return max;
		 }
		 return arr.length;
	 }

}
