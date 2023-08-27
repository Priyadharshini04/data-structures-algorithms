package com.myjava.strivers.arrays;
//https://www.codingninjas.com/studio/problems/longest-subarray-with-sum-k_6682399
public class LongSubArray {

	public static int findLong(int[] arr,int k)
	{
		int p1=0;
		int sum=0;
		int maxLength=0;
		int p2=0;
		while(p1>= 0 && p1<arr.length && p2<arr.length)
		{
			sum+=arr[p2];
			while(sum>k && p1<p2)
			{
					sum-=arr[p1];
					p1+=1;
			}
			if(sum==k && maxLength<(p2-p1+1))
			{
				maxLength=(p2-p1+1);
			}
			p2+=1;
		}
		
		return maxLength;
	}
}