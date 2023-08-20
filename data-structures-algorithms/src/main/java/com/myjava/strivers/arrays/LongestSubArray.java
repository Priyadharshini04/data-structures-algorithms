package com.myjava.strivers.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(longestSubarrayWithSumK(new int[] {5,1,3,0,1,5,3,1,4,2},
		// 5));
		// System.out.println(longestSubarrayWithSumK(new int[] {1,2,1,3}, 2));
		// System.out.println(longestSubarrayWithSumK(new int[]
		// {0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0},
		// 52));
		// System.out.println(findLongestSum(new int[] {0,1,1,2,0,3}, 4));

//		 System.out.println(findLongestSum(new int[]
//		 {3,2,2,0,1,2,1,0,1,0,3,3,5,4,5,4,5,1,4,1,3,1,1,4,3,2,3,2,0,0,1,2,4,5,0,1,0,2,2,0,3,1,0,0,3,5,4,4,3,3,4,3,0,3,4,1,1,0,0,2},
//		 28));
		
//		
//		System.out.println(findLongestSum(new int[] {5,1,3,0,1,5,3,1,4,2},
//		 5));
		System.out.println(findLong(new int[] {1,2,1,3},4, 2));
//		 System.out.println(findLongestSum(new int[]
//		{0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0},
//		 52));
//		 System.out.println(longestSubarrayWithSumKkol(new int[]
//					{-1,0,1,1,-1,-1,0},
//					 0));
//		System.out.println(longestSubarrayWithSumKs(new int[] {0,1,1,2,0,3}, 4));
//
//		System.out.println(longestSubarrayWithSumKs(new int[]
//		 {3,2,2,0,1,2,1,0,1,0,3,3,5,4,5,4,5,1,4,1,3,1,1,4,3,2,3,2,0,0,1,2,4,5,0,1,0,2,2,0,3,1,0,0,3,5,4,4,3,3,4,3,0,3,4,1,1,0,0,2},
//		 28));
//		System.out.println(longestSubarrayWithSumKs(new int[]
//				 {8,15,17,0,11 },
//				 17));

	}
	public static int findLong(int[] arr,int n, int k)
	{
		int max_sum = Integer.MIN_VALUE;
		 
        // Consider all blocks starting with i.
        for (int i = 0; i < n - k + 1; i++) {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];
 
            // Update result if required.
            max_sum = Math.max(current_sum, max_sum);
        }
 
        return max_sum;
	}
	public static int findLongestSum(int[] nums, long k)
	{
		int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
		//return longestSubarrayWithSumK(a,k,0,a.length-1);
	}
	static int maxCount=0;
	public static int longestSubarrayWithSumK(int[] a, long k, int i,int j) {
		// Write your code here
		if(i>=0 && j<a.length && i<j)
		{
		int sum=0;
		for(int l=i;l<j;l++)
		{
			sum+=a[l];
		}
		if(sum==k)
		{
			if(maxCount<(j-i+1))
			{
				maxCount=j-i;
			}
		}
		longestSubarrayWithSumK(a, k, i, j-1);
		longestSubarrayWithSumK(a, k, i+1, j);
		}
		return maxCount;
	}
	public static int longestSubarrayWithSumK(int []a, long k) {
        // Write your code here
        int n = a.length;
  
        int maxLength = 0;

        int start = 0, end = -1;
        long currentSum = 0;

        while (start < n) {
            while ((end + 1 < n) && (currentSum + a[end + 1] <= k)) {
                currentSum += a[end + 1];
                ++end;
            }

            if (currentSum == k) {
                maxLength = Math.max(maxLength, end - start + 1);
            }

            currentSum -= a[start];
            ++start;
        }

        return maxLength;
	}
}