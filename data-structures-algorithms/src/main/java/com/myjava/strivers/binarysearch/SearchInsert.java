package com.myjava.strivers.binarysearch;

public class SearchInsert {
	// https://leetcode.com/problems/search-insert-position/
	 public static int searchInsert(int []arr, int n, int x) {
		 int left=0;
		 int right=arr.length-1;
		 int mid=(left+(right-left)/2);
		 while(left<=right)
		 {
			 mid=(left+(right-left)/2);
			 
			 if(arr[mid]==x)
			 {
				 return mid;
			 }
			 else if(arr[mid]>x)
			 {
				 right=mid-1; 
			 }
			 else if(arr[mid]<x)
			 {
					left=mid+1;
			 }
		 }
		 if(right<0 || left<0)
		 {
			 return 0;
		 }
		 else {
			 return left;
		 }
	 }
}
