package com.myjava.strivers.stackqueue;
// https://www.codingninjas.com/studio/problems/count-of-greater-elements-to-the-right_8365436
public class CountNextGreaters {
	
	// the brute force approach.
	public static int[] countGreater(int[] arr, int[] query) {
		int[] ans=new int[query.length];
		for(int i=0;i<query.length;i++)
		{
			int count=0; int ele=arr[query[i]];
			for(int j=query[i]+1;j<arr.length;j++)
			{
				if(ele<arr[j])
				{
					++count;
				}
			}
			ans[i]=count;
		}
		return ans;
	}

}
