package com.myjava.strivers.arrays;

public class LongSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(findLong(new int[]
		{-1,0,1,1,-1,-1,0},
		 0));
//		 System.out.println(findLong(new int[]
//		{0,2,5,3,3,4,4,3,0,5,5,4,4,4,3,2,0,2,3,1,3,0,4,3,1,4,5,2,4,3,1,4,5,0,3,4,0},
//		 52));
//		 
//		 System.out.println(findLong(new int[]{8,15,17,0,11 },17));
		System.out.println(findLong(new int[]{1,4,1,3},3));
	}
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